package utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {

    public static String checkIfValidInput(Integer minimumAcceptable, Integer maximumAcceptable, BufferedReader bufferedReader) {
        String choice = null;
        boolean invalid = true;
        while (invalid) {
            try {
                choice = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (choice.matches(".*[0-9]")) {
                if (Integer.parseInt(choice) >= minimumAcceptable && Integer.parseInt(choice) <= maximumAcceptable) {
                    invalid = false;
                }else {
                    System.out.println("\nInvalid Input. Try again:");

                }
            } else {
                System.out.println("\nInvalid Input. Try again:");
            }
        }
        return choice;
    }

    public static void printGameName(PrintWriter printWriter) {
        printWriter.println("\n" +
                "   _____ ______ ______ _  __      ____  _    _ _____ ______\n" +
                "  / ____|  ____|  ____| |/ /     / __ \\| |  | |_   _|___  /\n" +
                " | |  __| |__  | |__  | ' /_____| |  | | |  | | | |    / / \n" +
                " | | |_ |  __| |  __| |  <______| |  | | |  | | | |   / /  \n" +
                " | |__| | |____| |____| . \\     | |__| | |__| |_| |_ / /__ \n" +
                "  \\_____|______|______|_|\\_\\     \\___\\_\\\\____/|_____/_____|\n" +
                "                                                           \n" +
                "                                                           \n");
    }
}
