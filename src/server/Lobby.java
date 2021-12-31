package server;

import game.Player;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

import static server.Server.*;


public class Lobby implements Runnable {

    private Socket socket;
    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    private String clientUsername;
    private Player player;


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
        String messageFromClient;
        try {
            printWriter.println("Enter your username for the group chat: ");
            this.clientUsername = bufferedReader.readLine();
            this.player = new Player(clientUsername);
            broadcastMessage("SERVER: " + clientUsername + " has entered the chat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (!Server.gameStarted) {
            try {
                messageFromClient = bufferedReader.readLine();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, printWriter);
                break;
            }
                if (messageFromClient.contains("#GEEKQUIZ")) {
                    if (lobbies.size() % 2 != 0) {
                        printWriter.println("Number of participants must be even");
                        return;
                    }
                    gameStarted = true;
                    printWriter.println("\n\nGotcha! Let's get this game started!");
                }
                broadcastMessage(clientUsername + ": " + messageFromClient);
        }
        //Game starts

        for (int i = 0; i < lobbies.size(); i++) {
            if (i % 2 != 0) {
                team1.add(lobbies.get(i).player);
                return;
            }
            team2.add(lobbies.get(i).player);
        }
        game.setTeam1(team1);
        game.setTeam2(team2);

        while (socket.isConnected()) {

            printWriter.println("\n\nGAME IS ABOUT TO START\n\n");
            synchronized (game) {
                printWriter.println("Team 1:\n\n" + game.getTeam1().getPlayersString() + "------------");
                printWriter.println("Team 2:\n\n" + game.getTeam2().getPlayersString() + "------------");
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
}
