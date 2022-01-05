package game;

import server.Lobby;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import static utility.Utility.*;

public class Player {

    private final String name;
    private int score = 0;
    private final ArrayList<String> answeredQuestions = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public void receiveQuestion(String question, int correctAnswer, BufferedReader bufferedReader, PrintWriter printWriter, Lobby lobby) {
        saveQuestion(question);
        printWriter.println("\n\nGET THE QUESTION RIGHT FOR 1 POINT!\n\n");
        printWriter.println(ANSI_BLUE + question + ANSI_RESET);
        String choice = checkIfValidInput(1, 4, bufferedReader, printWriter, lobby);
        checkIfIsCorrect(Integer.parseInt(choice), correctAnswer, printWriter);
    }

    public void saveQuestion(String question) {
        answeredQuestions.add(question);
    }

    public boolean questionAnswered(String question) {

        return answeredQuestions.contains(question);
    }

    public void checkIfIsCorrect(int answer, Integer correctAnswer, PrintWriter printWriter) {

        if (answer == correctAnswer) {
            printWriter.println(ANSI_GREEN + "Correct answer." + ANSI_RESET);
            score++;
            printWriter.println("Now your score is: " + score);

        } else {
            printWriter.println(ANSI_RED + "Incorrect answer." + ANSI_RESET);
            printWriter.println("Score: " + score);
        }
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }


}
