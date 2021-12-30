package game;

import questions.Questions;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import static Utility.Utility.*;

public class Game {
    private Team team1;
    private Team team2;
    //private Socket socket;
    private final Questions questions = new Questions();
    private static int round;


    public Game(Socket socket){
        //this.socket = socket;
    }

    public Game(){
        this.team1 = null;
        this.team2 = null;
    }

    public Game(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;

    }

    //Metodo para chamar as fases do jogo
    public void gameRounds() {
        while (team1.getFirewalls() > 0 && team2.getFirewalls() > 0) {
            System.out.println("ROUND" + round); //BufferedWriter
            questionPhase();
            spendPhase();
            aftermathPhase();
            round++;
        }
        if (team1.getFirewalls() <= 0) {
            System.out.println("TEAM 2 WON");
        } else {
            System.out.println("TEAM 1 WON");
        }
    }

    //Mandar as peguntas a cada jogador de cada equipa
    public void questionPhase() {
        System.out.println("QUESTION PHASE");
        distributeQuestions(team1);
        distributeQuestions(team2);
    }

    //Cada jogador decido o que faz com os pontos
    public void spendPhase() {
        spendingPhase(team1);
        spendingPhase(team2);
    }

    //Pancada velha
    public void aftermathPhase() {
        System.out.println("AFTERMATH PHASE");
        team1.updateFirewalls(team2);
        team2.updateFirewalls(team1);
        //Utility.printRoundOutcome();
    }


    //metodo para distribuir as perguntas por cada jogador da equipa
    public void distributeQuestions(Team team) {
        List<String> keysAsArray = new ArrayList<>(this.questions.getQuestions().keySet());

        for (Player player : team.getPlayers()) {
            String question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));

            while (player.questionAnswered(question)) {
                question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
            }
            int correctAnswer = this.questions.getQuestions().get(question);

            player.receiveQuestion(question, correctAnswer);

        }
    }


    //metodo para perguntar a cada jogador o que quer fazer com os pontos
    public void spendingPhase(Team team) {
        for (Player player: team.getPlayers()) {

            if (player.getScore() > 0) {

                System.out.println("Choose one of the following options:");
                String option1 = checkIfValidInput(1,2);
                System.out.println("1)SPEND POINTS              2)PASS");

                if (option1.equals("1")) {
                    String option2 = checkIfValidInput(1,2);
                    System.out.println("Choose one of the following options:");
                    System.out.println("1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)");

                    if (option2.equals("1")) {
                        System.out.println(player.getScore());
                        System.out.println("How many points do you want to spend?");
                        String quantity = checkIfValidInput(1, player.getScore());
                        team.addVirus(Integer.parseInt(quantity));
                        int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                        player.setScore(scoreLeft);
                    } else {
                        System.out.println(player.getScore());
                        System.out.println("How many points do you want to spend?");
                        String quantity = checkIfValidInput(1, player.getScore());
                        team.addAntivirus(Integer.parseInt(quantity));
                        int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                        player.setScore(scoreLeft);
                    }
                } else {
                    System.out.println("PHASE PASSED");
                }
            }
            System.out.println("YOU DON'T HAVE ANY POINTS TO SPEND");
        }
    }

    public void setTeam1(ArrayList<Player> players) {
        this.team1 = new Team(players);
    }

    public void setTeam2(ArrayList<Player> players) {
        this.team2 = new Team(players);
    }

}
