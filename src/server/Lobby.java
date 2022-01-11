package server;

import game.Player;
import leaderboard.Leaderboard;

import javax.sound.sampled.Clip;
import java.io.*;
import java.net.Socket;

import static leaderboard.Leaderboard.addPlayerToLeaderboard;
import static leaderboard.Leaderboard.printLeaderboard;
import static leaderboard.LeaderboardManager.deserialize;
import static leaderboard.LeaderboardManager.serialize;
import static music.Music.*;
import static server.Server.*;
import static utility.Messages.*;

public class Lobby implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private static Leaderboard leaderboard;
    private Clip music;

    private String clientUsername = "";
    private Player player;

    static boolean advance = false;
    private boolean gameMaster = false;
    private boolean teamsPrinted = false;

    private boolean questionAnswered = false;
    private static int playersThatFinishedQuestions = 0;
    private boolean pointsSpent = false;
    private static int playersThatFinishedBet = 0;
    private boolean resolutionChecked = false;


    private boolean clientQuit = false;

    private static final String MUSICPATH = "src/music/Output_1-2.wav";

    static {
        try {
            leaderboard = new Leaderboard(deserialize());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
        while (socket.isConnected() && !clientQuit) {
            //Chat:
            chatRoom();
            //Game starts
            printTeams();
            geekGame();
            checkIfSomeoneWon();
            gameMaster = false;
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
            broadcastMessage(NEW_CLIENT_JOINED, clientUsername);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void chatRoom() {
        printWriter.println(CLEAR);
        printWriter.println(WELCOME_TO_CHATROOM);
        String messageFromClient;
        while (!gameStarted) {
            try {
                messageFromClient = bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }

            if (messageFromClient == null) {
                closeEverything(socket, bufferedReader, printWriter);
            }
            if (messageFromClient.matches("#SCORES")) {
                printLeaderboard(printWriter);
            }
            if (messageFromClient.matches("#QUIT")) {
                clientQuit = true;
                closeEverything(socket, bufferedReader, printWriter);
            }
            if (messageFromClient.matches("#RAGEQUIT")) {
                printWriter.println(SERVER_CRASH_MESSAGE);
                System.exit(0);
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

            if (!messageFromClient.equals("")
                    && !messageFromClient.matches("#SCORES")
                    && !messageFromClient.matches("#RAGEQUIT")
                    && !messageFromClient.matches("#QUIT")) {
                broadcastMessage(ANSI_GREEN + this.clientUsername + ANSI_RESET + ": " + messageFromClient);
            }
        }
    }

    public void printTeams() {
        while (!allLobbiesHavePrintedTeams()) {
            printWriter.println(CLEAR);
            printWriter.println(GEEK_QUIZ_LOGO);
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
            music = playMusic(MUSICPATH);
            resetGameStarted();
        }
        while (lobbies.size() % 2 == 0 && game.bothTeamsareStillAlive()) {
            advance = false;
            this.pointsSpent = false;
            playersThatFinishedBet = 0;

            printWriter.println(CLEAR);
            questionPhase();
            if (lobbies.size() % 2 != 0) {
                stopMusic(music);
                player.setScore(0);
                return;
            }

            resolutionChecked = false;

            printWriter.println(CLEAR);
            spendingPhase();
            if (lobbies.size() % 2 != 0) {
                stopMusic(music);
                player.setScore(0);
                return;
            }

            if (this.gameMaster) {
                game.aftermathPhase();
                advance = true;
                broadcastMessage(PLAYERS_READY);
                if (lobbies.size() % 2 != 0) {
                    stopMusic(music);
                    player.setScore(0);
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

            printWriter.println(CLEAR);
            resolutionPhase();
            if (lobbies.size() % 2 != 0) {
                stopMusic(music);
                player.setScore(0);
                return;
            }
            this.questionAnswered = false;
            playersThatFinishedQuestions = 0;
        }
    }

    public void questionPhase() {
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0) {
            stopMusic(music);
            player.setScore(0);
            return;
        }
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0) {
            stopMusic(music);
            player.setScore(0);
            return;
        }
        game.distributeQuestions(player, bufferedReader, printWriter, this);
        if (lobbies.size() % 2 != 0) {
            stopMusic(music);
            player.setScore(0);
            return;
        }
        questionAnswered = true;
        playersThatFinishedQuestions++;
        if (playersThatFinishedQuestions == (game.getTeam1().getPlayers().size() + game.getTeam2().getPlayers().size())){
            broadcastMessage(PLAYERS_READY);
        }
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
        playersThatFinishedBet++;
        if (playersThatFinishedBet == (game.getTeam1().getPlayers().size() + game.getTeam2().getPlayers().size())){
            broadcastMessage(PLAYERS_READY);
        }
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
        printWriter.println(RESOLUTION_PHASE_BANNER);
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

    public void broadcastMessage(String messageToSend, String variable) {
        for (Lobby lobby : lobbies) {
            if (!lobby.clientUsername.equals(clientUsername)) {
                lobby.printWriter.printf(messageToSend, variable);
            }
        }
    }

    public void pressEnterToContinue() {
        if (bufferedReader != null) {
            printWriter.println(PRESS_ENTER_TO_CONTINUE);
            try {
                bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void checkIfSomeoneWon() {
        if (game.getTeam1().getFirewalls() <= 0) {
            printWriter.println(TEAM2_WINS);
            if (gameMaster) {
                for (Player player : game.getTeam2().getPlayers()) {
                    addPlayerToLeaderboard(player.getName());
                }
                pressEnterToContinue();
                stopMusic(music);
                player.setScore(0);
                chatRoom();
            }
        } else if (game.getTeam2().getFirewalls() <= 0) {
            printWriter.println(TEAM1_WINS);
            if (gameMaster) {
                for (Player player : game.getTeam1().getPlayers()) {
                    addPlayerToLeaderboard(player.getName());
                }
                pressEnterToContinue();
                stopMusic(music);
                player.setScore(0);
                chatRoom();
            }
        }
        if (gameMaster) {
            serialize(leaderboard);
        }
    }

    public void removeClient() {
        broadcastMessage(CLIENT_LEFT_CHAT, clientUsername);
        lobbies.remove(this);
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, PrintWriter printWriter) {
        removeClient();
        try {
            bufferedReader.close();
            printWriter.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * CHECKS
     **/
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

    /**
     * GETTERS
     **/

    public String getClientUsername() {
        return clientUsername;
    }

    public Player getPlayer() {
        return player;
    }

    public Socket getSocket() {
        return socket;
    }

    public BufferedReader getBufferedReader() {
        return bufferedReader;
    }

    public PrintWriter getPrintWriter() {
        return printWriter;
    }
}
