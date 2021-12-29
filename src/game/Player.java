package game;

import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;

public class Player {

    private Socket socket;
    private int score = 0;
   // private HashMap<String, Integer> questions;

    private LinkedList answeredQuestions;



    public void saveQuestion(String question) {
        answeredQuestions.add(question);
    }

    public boolean questionAnswered(String question) {

        if (answeredQuestions.contains(question)) {
            return true;
        }
        return false;

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
}
