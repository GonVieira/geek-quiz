package server;

import game.Game;
import game.Player;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    private final ServerSocket serverSocket;
    public static Game game;
    public static boolean gameStarted = false;
    public static ArrayList<Lobby> lobbies = new ArrayList<>();
    public static ArrayList<Player> team1 = new ArrayList<>();
    public static ArrayList<Player> team2 = new ArrayList<>();

    public Server(ServerSocket serverSocket) {

        this.serverSocket = serverSocket;
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        System.out.println("Server started.");
        server.startServer();
    }


    public void startServer() {
        try {
            while (!serverSocket.isClosed()) {
                Socket socket = serverSocket.accept();
                System.out.println("A new client has connected: " + socket.getInetAddress().getHostAddress());
                Lobby lobby = new Lobby(socket);
                Thread thread = new Thread(lobby);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printGameTeams(PrintWriter printWriter){
        game.printTeams(printWriter);
    }

    public synchronized static void gameHasStarted() {
        gameStarted = true;
    }

    public synchronized static void setTeams(){
        for (int i = 0; i < lobbies.size(); i++) {
            if (i % 2 != 0) {
                team1.add(lobbies.get(i).getPlayer());
                return;
            }
            team2.add(lobbies.get(i).getPlayer());
        }
        game = new Game(team1,team2);
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

}
