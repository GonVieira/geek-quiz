package utility;

import java.io.BufferedReader;
import java.io.IOException;
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
}
