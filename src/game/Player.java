package game;

import server.Lobby;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import static utility.Messages.*;
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
        printWriter.println(QUESTIONS_BANNER + question);
        String choice = checkIfValidInputOrIfUserQuit(1, 4, lobby);
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
            printWriter.println(CORRECT_ANSWER);
            score++;
            printWriter.printf(POINTS, score);

        } else {
            printWriter.println(WRONG_ANSWER);
            printWriter.printf(POINTS, score);
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
