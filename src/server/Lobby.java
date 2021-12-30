package server;

import game.Game;
import game.Player;
import game.Team;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Lobby implements Runnable {
    public static ArrayList<Lobby> lobby = new ArrayList<>();
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;
    private int numberOfClients;
    private Player player;
    private Game game;

    public Lobby(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.clientUsername = bufferedReader.readLine();
            lobby.add(this);
            broadcastMessage("SERVER: " + clientUsername + " has entered the chat!");
            numberOfClients++;
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    @Override
    public void run() {
        String messageFromClient;

        while (socket.isConnected()) {
            try {
                messageFromClient = bufferedReader.readLine();
              /*  if (messageFromClient.equals("#GEEKQUIZ")) {

                    ArrayList<Player> team1 = new ArrayList<>();
                    ArrayList<Player> team2 = new ArrayList<>();
                    for (int i = 0; i < lobby.size(); i++) {
                        team1.add(lobby.get(i).player);
                    }
                }*/
                broadcastMessage(messageFromClient);
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
    }

    public void broadcastMessage(String messageToSend) {
        for (Lobby lobby : lobby) {
            try {
                if (!lobby.clientUsername.equals(clientUsername)) {
                    lobby.bufferedWriter.write(messageToSend);
                    lobby.bufferedWriter.newLine();
                    lobby.bufferedWriter.flush();
                }
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
            }
        }
    }

    public void removeClient() {
        lobby.remove(this);
        numberOfClients--;
        broadcastMessage("SERVER: " + clientUsername + " has left the chat!");
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        removeClient();
        try {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            numberOfClients--;
            e.printStackTrace();
        }
    }

    public int getNumberOfClients() {
        return numberOfClients;
    }

    public void setNumberOfClients(int numberOfClients) {
        this.numberOfClients = numberOfClients;
    }


}
