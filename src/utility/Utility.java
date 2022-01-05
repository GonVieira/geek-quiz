package utility;

import server.Lobby;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import static server.Server.lobbies;

public class Utility {


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\033[0;101m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\033[0;104m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


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
                lobby.broadcastMessage(ANSI_RED + lobby.getClientUsername() + " left the server! Game will be interrupted." + ANSI_RESET);
                lobbies.remove(lobby);
            }
            if (choice.matches(".*[0-9]")) {
                if (Integer.parseInt(choice) >= minimumAcceptable && Integer.parseInt(choice) <= maximumAcceptable) {
                    invalid = false;
                }else {
                    printWriter.println("\nInvalid Input. Try again:");

                }
            } else {
                printWriter.println("\nInvalid Input. Try again:");
            }
        }
        return choice;
    }

    public static void printGameName(PrintWriter printWriter) {
        printWriter.println(ANSI_BLUE + "\n" +
                "   _____ ______ ______ _  __      ____  _    _ _____ ______\n" +
                "  / ____|  ____|  ____| |/ /     / __ \\| |  | |_   _|___  /\n" +
                " | |  __| |__  | |__  | ' /_____| |  | | |  | | | |    / / \n" +
                " | | |_ |  __| |  __| |  <______| |  | | |  | | | |   / /  \n" +
                " | |__| | |____| |____| . \\     | |__| | |__| |_| |_ / /__ \n" +
                "  \\_____|______|______|_|\\_\\     \\___\\_\\\\____/|_____/_____|\n" +
                "                                                           \n" +
                "                                                           \n" + ANSI_RESET);
    }
}
