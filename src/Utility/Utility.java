package Utility;

import java.util.Scanner;

public class Utility {

    private static final Scanner sc = new Scanner(System.in);

    public static String checkIfValidInput(Integer minimumAcceptable, Integer maximumAcceptable) {
        String choice = null;
        boolean invalid = true;
        while (invalid) {
            choice = sc.nextLine();
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
