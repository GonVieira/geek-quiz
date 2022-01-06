package utility;

import server.Lobby;

import java.io.IOException;

import static server.Server.lobbies;
import static utility.Messages.*;

public class Utility {

    public static String checkIfValidInputOrIfUserQuit(Integer minimumAcceptable, Integer maximumAcceptable, Lobby lobby) {
        String choice = null;
        boolean invalid = true;

        while (invalid) {
            try {
                choice = lobby.getBufferedReader().readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Checks if the user disconnected halfway through the game
            if (choice == null) {
                lobby.broadcastMessage(GAME_INTERRUPTED, lobby.getClientUsername());
                lobbies.remove(lobby);
                break;
            }
            //Checks if user wants to disconnect from terminal
            if (choice.matches("#QUIT")) {
                lobby.getPrintWriter().println(GOODBYE_MESSAGE);
                lobby.broadcastMessage(GAME_INTERRUPTED, lobby.getClientUsername());
                lobbies.remove(lobby);
                try {
                    lobby.getBufferedReader().close();
                    lobby.getPrintWriter().close();
                    lobby.getSocket().close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
            //Checks if input matches current choice options
            if (choice.matches(".*[0-9]")) {
                if (Integer.parseInt(choice) >= minimumAcceptable && Integer.parseInt(choice) <= maximumAcceptable) {
                    invalid = false;
                } else {
                    lobby.getPrintWriter().println(INVALID_INPUT);

                }
            } else {
                lobby.getPrintWriter().println(INVALID_INPUT);
            }
        }
        return choice;
    }
}
