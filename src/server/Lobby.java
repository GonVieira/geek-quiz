package server;

import game.Game;
import game.Player;
import game.Team;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Lobby implements Runnable {
    public static ArrayList<Lobby> lobby = new ArrayList<>();
    private Socket socket;
    //gameSocket
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String clientUsername;
    private int numberOfClients;
    private Player player;


    public Lobby(Socket socket) {
        try {
            this.socket = socket;
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            lobby.add(this);

            numberOfClients++;
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        try {
            bufferedWriter.write("Enter your username for the group chat: ");
            bufferedWriter.flush();
            this.clientUsername = bufferedReader.readLine();
            broadcastMessage("SERVER: " + clientUsername + " has entered the chat!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (socket.isConnected() && !Server.gameStarted) {
            try {
                messageFromClient = bufferedReader.readLine();
                System.out.println(messageFromClient);
                if (messageFromClient.contains("#GEEKQUIZ")){
                    Server.gameStarted = true;
                    bufferedWriter.write("\n\nGotcha! Let's get this game starting!");
                }
                broadcastMessage(clientUsername + ": " + messageFromClient);
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
        //Game starts
        try {
            bufferedWriter.write("\n\nGAME IS ABOUT TO START\n\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        broadcastMessage("GAME IS ABOUT TO START");

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
