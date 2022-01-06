package server;

import game.Player;
import utility.Utility;

import java.io.*;
import java.net.Socket;

import static server.Server.*;
import static utility.Messages.*;

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
            printWriter.println(USERNAME_REQUEST);
            String name = bufferedReader.readLine();
            for (Lobby lobby : lobbies) {
                while (lobby.clientUsername.equals(name)) {
                    printWriter.println(INVALID_USERNAME + USERNAME_REQUEST);
                    name = bufferedReader.readLine();
                }
            }
            clientUsername = name;
            player = new Player(clientUsername);
            broadcastMessage(ANSI_BLUE + "SERVER: " + ANSI_GREEN + clientUsername + ANSI_RESET + " has entered the chat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chatRoom() {
        printWriter.println(WELCOME_TO_CHATROOM);
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
                    game.getTeam1().getPlayers().clear();
                    game.getTeam2().getPlayers().clear();
                    addPlayersToTeam();
                    printWriter.println(GAME_CODE_USED);
                    game.getTeam1().setFirewalls(8 * game.getTeam1().getPlayers().size());
                    game.getTeam2().setFirewalls(8 * game.getTeam2().getPlayers().size());

                    gameHasStarted();
                    broadcastMessage(GAME_CODE_USED_NOTIFICATION);
                    return;
                }
                printWriter.println(INCORRECT_NUMBER_OF_PLAYERS);
            }
            if (!messageFromClient.equals("")) {
                broadcastMessage(ANSI_GREEN + this.clientUsername + ANSI_RESET + ": " + messageFromClient);
            }
        }
    }

    public void printTeams() {
        while (!allLobbiesHavePrintedTeams()) {
            Utility.printGameName(printWriter);
            printWriter.println(GAME_STARTING);
            game.printTeamMembers(printWriter);
            teamsPrinted = true;
            printWriter.println(PRESS_ENTER_TO_CONTINUE);
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
            if (lobbies.size() % 2 != 0){
                return;
            }
            this.pointsSpent = false;
            resolutionChecked = false;
            spendingPhase();
            if (lobbies.size() % 2 != 0){
                return;
            }
            if (this.gameMaster) {
                game.aftermathPhase();
                advance = true;
                if (lobbies.size() % 2 != 0){
                    return;
                }
            } else {
                while (!advance) {
                    printWriter.println(PLAYERS_NOT_READY);
                    try {
                        bufferedReader.readLine();
                    } catch (IOException e) {
                        closeEverything(socket, bufferedReader, printWriter);
                        break;
                    }
                }
            }
            resolutionPhase();
            if (lobbies.size() % 2 != 0){
                return;
            }
            this.questionAnswered = false;
        }
    }

    public void questionPhase() {
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0){
            return;
        }
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0){
            return;
        }
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0){
            return;
        }
        questionAnswered = true;
        while (!allLobbiesHaveAnsweredQuestion()) {
            printWriter.println(PLAYERS_HAVENT_ANSWERED);
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
            printWriter.println(PLAYERS_HAVENT_SPENT_POINTS);
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
        pressEnterToContinue();
        while (!allLobbiesHaveCheckedResolution()) {
            printWriter.println(PLAYERS_HAVENT_CHECKED_RESOLUTION);
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
                lobby.printWriter.println(messageToSend);
            }
        }
    }

    public void pressEnterToContinue() {
        printWriter.println(PRESS_ENTER_TO_CONTINUE);
        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void checkIfSomeoneWon() {
        if (game.getTeam1().getFirewalls() <= 0) {
            printWriter.println(TEAM2_WINS);
            pressEnterToContinue();
            chatRoom();
        } else if (game.getTeam2().getFirewalls() <= 0){
            printWriter.println(TEAM1_WINS);
            pressEnterToContinue();
            chatRoom();
        }
    }

    public void removeClient() {
        lobbies.remove(this);
        broadcastMessage(ANSI_BLUE + "SERVER: " + ANSI_GREEN + clientUsername + ANSI_RESET + " has left the chat!");
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

    public Player getPlayer() {
        return player;
    }
}
