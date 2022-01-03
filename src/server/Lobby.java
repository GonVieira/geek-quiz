package server;

import game.Player;

import java.io.*;
import java.net.Socket;

import static server.Server.*;


public class Lobby implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private String clientUsername;
    private Player player;
    boolean teamsPrinted = false;
    boolean questionAnswered = false;
    boolean choiceMade = false;


    public Lobby(Socket socket) {
        try {
            this.socket = socket;
            this.printWriter = new PrintWriter(socket.getOutputStream(), true);
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            lobbies.add(this);
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, printWriter);
        }
    }


    @Override
    public void run() {
        createUsername();
        chatRoom();
        //Game starts
        printTeams();
        geekGame();
    }

    public void createUsername() {
        try {
            printWriter.println("Enter your username for the group chat: ");
            this.clientUsername = bufferedReader.readLine();
            player = new Player(clientUsername);
            addPlayerToTeam(player);
            broadcastMessage("SERVER: " + clientUsername + " has entered the chat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chatRoom() {
        String messageFromClient;
        while (!gameStarted) {
            try {
                messageFromClient = bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
            if (messageFromClient.contains("#GEEKQUIZ")) {
                if (lobbies.size() % 2 == 0) {
                    printWriter.println("\n\nGotcha! Let's get this game started!");
                    gameHasStarted();
                    broadcastMessage("Someone typed a secret code! Press enter!");
                    return;
                }
                printWriter.println("Number of participants must be even");
            }
            if (messageFromClient.equals("")) {
                chatRoom();
            }
            broadcastMessage(clientUsername + ": " + messageFromClient);
        }
    }

    public void printTeams() {
        while (!allLobbiesHavePrintedTeams()) {
            printWriter.println("\n\nGAME IS ABOUT TO START\nDividing players in 2 teams...\n\n");
            game.printTeamMembers(printWriter);
            teamsPrinted = true;
            printWriter.println("Press Enter to continue:\n\n");
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void geekGame(){
        while (game.getTeam1().getFirewalls() > 0 && game.getTeam2().getFirewalls() > 0) {
            questionAnswered = false;
            questionPhase();
            choiceMade = false;
            spendingPhase();
            resetFirewallBoolean();
            firewallUpdate();
            resolutionPhase();
            printWriter.println("Press Enter to continue");
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void questionPhase() {
        game.distributeQuestions(player, bufferedReader, printWriter);
        game.distributeQuestions(player, bufferedReader, printWriter);
        game.distributeQuestions(player, bufferedReader, printWriter);
        questionAnswered = true;
        while (!allLobbiesHaveAnsweredQuestion()) {
            printWriter.println("\n\nNot all players have answered! Please wait a sec and press Enter:\n\n");
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void spendingPhase() {
        game.spendingPhase(player, bufferedReader, printWriter);
        choiceMade = true;
        while (!allLobbiesHaveSpentPoints()) {
            printWriter.println("\n\nNot all players have used their points! Please wait a sec and press Enter:\n\n");
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void resolutionPhase(){
        game.printTeamStats(printWriter);

    }

    public void broadcastMessage(String messageToSend) {
        for (Lobby lobby : lobbies) {
            if (!lobby.clientUsername.equals(clientUsername)) {
                lobby.printWriter.println(messageToSend);
            }
        }
    }

    public void removeClient() {
        lobbies.remove(this);
        broadcastMessage("SERVER: " + clientUsername + " has left the chat!");
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, PrintWriter printWriter) {
        removeClient();
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getClientUsername() {
        return clientUsername;
    }
}
