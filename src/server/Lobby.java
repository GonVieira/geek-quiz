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
            //broadcastMessage("SERVER: " + clientUsername + " has entered the chat!");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (socket.isConnected() && !Server.gameStarted) {
            try {
                messageFromClient = bufferedReader.readLine();
                if (messageFromClient.contains("#GEEKQUIZ")) {
                    Server.gameStarted = true;

                    broadcastMessage("GAME");
                }
                broadcastMessage(messageFromClient);
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
                break;
            }
        }
        //Game starts
                    broadcastMessage("GAME STARTED");

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

    /*public void sendMessage(){
        try {
            bufferedWriter.write(username);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            Scanner sc = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = sc.nextLine();
                bufferedWriter.write(username + ": " + messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }
*/
    public void listenForMessage(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                String msgFromGroupChat;

                while (socket.isConnected()) {
                    try {
                        msgFromGroupChat = bufferedReader.readLine();
                        System.out.println(msgFromGroupChat);
                    } catch (IOException e) {
                        closeEverything(socket, bufferedReader, bufferedWriter);
                    }
                }
            }
        }).start();
    }

}
