import questions.QuestionManager;
import questions.Questions;

public class Main {
    public static void main(String[] args) {
        Questions questions = new Questions();
        System.out.println(questions.getQuestions().get(Math.random()*questions.getQuestions().size()));
    }
}
