package server;

import game.Game;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import static utility.Messages.*;

public class Server {

    private final ServerSocket serverSocket;
    public static final Game game = new Game();
    public static boolean gameStarted = false;
    public static ArrayList<Lobby> lobbies = new ArrayList<>();

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Server server = new Server(serverSocket);
        System.out.println(SERVER_ON);
        server.startServer();
    }


    public void startServer() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println(CLIENT_CONNECTED + socket.getInetAddress().getHostAddress());
                Lobby lobby = new Lobby(socket);
                Thread thread = new Thread(lobby);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void gameHasStarted() {
        gameStarted = true;
    }

    public synchronized static void resetGameStarted() {
        gameStarted = false;
    }

    public synchronized static void addPlayersToTeam() {
        for (int i = 0; i < lobbies.size(); i++) {
            if (i % 2 == 0)
                game.getTeam1().getPlayers().add(lobbies.get(i).getPlayer());
            else
                game.getTeam2().getPlayers().add(lobbies.get(i).getPlayer());
        }
    }

    public void closeServerSocket() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean allLobbiesHavePrintedTeams() {
        boolean ready = true;
        for (Lobby lobby : lobbies) {
            if (!lobby.teamsArePrinted()) {
                ready = false;
            }
        }
        return ready;
    }

    public static boolean allLobbiesHaveAnsweredQuestion() {
        boolean ready = true;
        for (Lobby lobby : lobbies) {
            if (!lobby.questionIsAnswered()) {
                ready = false;
            }
        }
        return ready;
    }

    public static boolean allLobbiesHaveSpentPoints() {
        boolean ready = true;
        for (Lobby lobby : lobbies) {
            if (!lobby.choiceIsMade()) {
                ready = false;
            }
        }
        return ready;
    }

    public static boolean allLobbiesHaveCheckedResolution() {
        boolean ready = true;
        for (Lobby lobby : lobbies) {
            if (!lobby.resolutionIsChecked()) {
                ready = false;
            }
        }
        return ready;
    }


}
