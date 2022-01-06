package utility;

import server.Lobby;
import server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import static server.Server.lobbies;
import static utility.Messages.*;

public class Utility {

    public static String checkIfValidInput(Integer minimumAcceptable, Integer maximumAcceptable, BufferedReader bufferedReader, PrintWriter printWriter, Lobby lobby) {
        String choice = null;
        boolean invalid = true;
        while (invalid) {
            try {
                choice = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (choice == null){
                lobby.broadcastMessage(ANSI_RED + lobby.getClientUsername() + GAME_INTERRUPTED);
                lobbies.remove(lobby);
                Server.game.removePlayer(lobby.getPlayer());
                break;
            }
            if (choice.matches(".*[0-9]")) {
                if (Integer.parseInt(choice) >= minimumAcceptable && Integer.parseInt(choice) <= maximumAcceptable) {
                    invalid = false;
                }else {
                    printWriter.println(INVALID_INPUT);

                }
            } else {
                printWriter.println(INVALID_INPUT);
            }
        }
        return choice;
    }

    public static void printGameName(PrintWriter printWriter) {
        printWriter.println(GEEK_QUIZ);
    }
}
