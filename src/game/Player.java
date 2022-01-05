package game;

import server.Lobby;
import utility.Messages;

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
        printWriter.println(Messages.ADVERTISING + question);
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
            printWriter.println(Messages.CORRECT_ANSWER);
            score++;
            printWriter.println(Messages.SCORE + score);

        } else {
            printWriter.println(Messages.WRONG_ANSWER);
            printWriter.println(Messages.SCORE + score);
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
