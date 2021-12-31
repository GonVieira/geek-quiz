package game;

import java.net.Socket;
import java.util.ArrayList;

import static Utility.Utility.*;

public class Player {

    private Socket socket;
    private final String name;
    private int score = 0;
    private final ArrayList<String> answeredQuestions = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public void receiveQuestion(String question, int correctAnswer) {
        //print String
        saveQuestion(question);
        String choice = checkIfValidInput(1, 4);
        checkIfIsCorrect(Integer.parseInt(choice), correctAnswer);
    }

    public void saveQuestion(String question) {
        answeredQuestions.add(question);
    }

    public boolean questionAnswered(String question) {

        return answeredQuestions.contains(question);
    }

    public void checkIfIsCorrect(int answer, Integer correctAnswer) {

        if (answer == correctAnswer) {
            System.out.println("Correct answer.");
            score++;
            System.out.println("Now your score is: " + score);

        } else {
            System.out.println("Incorrect answer.");
            System.out.println("Score: " + score);
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
