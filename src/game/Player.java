package game;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

import static Utility.Utility.*;

public class Player {

    private final String name;
    private int score = 0;
    private final ArrayList<String> answeredQuestions = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public void receiveQuestion(String question, int correctAnswer, BufferedReader bufferedReader, PrintWriter printWriter) {
        saveQuestion(question);
        printWriter.println("GET THE QUESTION RIGHT FOR 1 POINT!\n\n");
        printWriter.println(question);
        String choice = checkIfValidInput(1, 4, bufferedReader);
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
            printWriter.println("Correct answer.");
            score++;
            printWriter.println("Now your score is: " + score);

        } else {
            printWriter.println("Incorrect answer.");
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
