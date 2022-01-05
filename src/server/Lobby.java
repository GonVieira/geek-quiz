package server;

import game.Player;
import utility.Messages;
import utility.Utility;

import java.io.*;
import java.net.Socket;

import static server.Server.*;
import static music.Music.*;
import static utility.Utility.*;

public class Lobby implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private String clientUsername = "";
    private Player player;
    static boolean advance = false;
    private boolean gameMaster = false;
    private boolean teamsPrinted = false;
    private boolean questionAnswered = false;
    private boolean pointsSpent = false;
    private boolean resolutionChecked = false;
    private static final String MUSICPATH = "src/music/Output_1-2.wav";


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
        while (socket.isConnected()) {
            //Chat:
            chatRoom();
            //Game starts
            printTeams();
            geekGame();
            checkIfSomeoneWon();
        }
    }

    public void createUsername() {
        try {
            printWriter.println(Messages.USERNAME_REQUEST);
            String name = bufferedReader.readLine();
            for (Lobby lobby : lobbies) {
                while (lobby.clientUsername.equals(name)) {
                    printWriter.println(Messages.NAME_IN_USED + Messages.USERNAME_REQUEST);
                    name = bufferedReader.readLine();
                }
            }
            clientUsername = name;
            player = new Player(clientUsername);
            addPlayerToTeam(player);
            broadcastMessage(Messages.ANSI_BLUE + "SERVER: " + Messages.ANSI_GREEN + clientUsername + Messages.ANSI_RESET + " has entered the chat!");
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
                this.gameMaster = true;
                if (lobbies.size() % 2 == 0) {
                    printWriter.println(Messages.KEY_USED);
                    game.getTeam1().setFirewalls(8 * game.getTeam1().getPlayers().size());
                    game.getTeam2().setFirewalls(8 * game.getTeam2().getPlayers().size());

                    gameHasStarted();
                    broadcastMessage(Messages.KEY_USED_NOTIFICATION);
                    return;
                }
                printWriter.println(Messages.VALIDATE_NUMBER_PLAYERS);
            }
            if (!messageFromClient.equals("")) {
                broadcastMessage(Messages.ANSI_GREEN + this.clientUsername + Messages.ANSI_RESET + ": " + messageFromClient);
            }
        }
    }

    public void printTeams() {
        while (!allLobbiesHavePrintedTeams()) {
            Utility.printGameName(printWriter);
            printWriter.println(Messages.TEAM_CREATION);
            game.printTeamMembers(printWriter);
            teamsPrinted = true;
            printWriter.println(Messages.ENTER);
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void geekGame() {
        if (gameMaster) {
            // playMusic(MUSICPATH);
            resetGameStarted();
        }
        while (lobbies.size() % 2 == 0 && game.bothTeamsareStillAlive()) {
            advance = false;
            questionPhase();
            this.pointsSpent = false;
            resolutionChecked = false;
            spendingPhase();
            if (this.gameMaster) {
                game.aftermathPhase();
                advance = true;
            } else {
                while (!advance) {
                    printWriter.println(Messages.PLAYER_NOT_READY);
                    try {
                        bufferedReader.readLine();
                    } catch (IOException e) {
                        closeEverything(socket, bufferedReader, printWriter);
                        break;
                    }
                }
            }
            resolutionPhase();
            this.questionAnswered = false;
            pressEnterToContinue();
        }
    }

    public void questionPhase() {
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        questionAnswered = true;
        while (!allLobbiesHaveAnsweredQuestion()) {
            printWriter.println(Messages.PLAYER_NOT_ANSWER);
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void spendingPhase() {
        game.spendingPhase(player, bufferedReader, printWriter, this);
        pointsSpent = true;
        while (!allLobbiesHaveSpentPoints()) {
            printWriter.println(Messages.PLAYER_NOT_SPEND_POINTS);
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void resolutionPhase() {
        game.printTeamStats(printWriter);
        resolutionChecked = true;
        while (!allLobbiesHaveCheckedResolution()) {
            printWriter.println(Messages.PLAYER_WAIT_RESOLUTION);
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
        }
    }

    public void broadcastMessage(String messageToSend) {
        for (Lobby lobby : lobbies) {
            if (!lobby.clientUsername.equals(clientUsername)) {
               /* if (messageToSend.contains("Game will be interrupted.")){
                    pressEnterToContinue();
                    lobby.chatRoom();
                }*/
                lobby.printWriter.println(messageToSend);
            }
        }
    }

    public void pressEnterToContinue() {
        printWriter.println(Messages.ENTER);
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void checkIfSomeoneWon() {
        if (game.getTeam1().getFirewalls() <= 0) {
            printWriter.println(Messages.TEAM2_WIN);
            pressEnterToContinue();
            chatRoom();
        } else {
            printWriter.println(Messages.TEAM1_WIN);
            pressEnterToContinue();
            chatRoom();
        }
    }

    public void removeClient() {
        lobbies.remove(this);
        broadcastMessage(Messages.ANSI_BLUE + "SERVER: " + Messages.ANSI_GREEN + clientUsername + Messages.ANSI_RESET + " has left the chat!");
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

    public boolean teamsArePrinted() {
        return teamsPrinted;
    }

    public boolean choiceIsMade() {
        return pointsSpent;
    }

    public boolean questionIsAnswered() {
        return questionAnswered;
    }

    public boolean resolutionIsChecked() {
        return resolutionChecked;
    }

    public String getClientUsername() {
        return clientUsername;
    }

}
