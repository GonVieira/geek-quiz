package game;

import questions.Questions;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static utility.Utility.*;

public class Game {

    private Team team1 = new Team();
    private Team team2 = new Team();
    private static final Questions QUESTIONS = new Questions();
    private static int round;

    //Metodo para chamar as fases do jogo
   /* public void gameRounds() {
        while (team1.getFirewalls() > 0 && team2.getFirewalls() > 0) {
            System.out.println("ROUND" + round); //BufferedWriter
         //   questionPhase();
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

    //Cada jogador decide o que faz com os pontos
    public void spendPhase() {
        spendingPhase(team1);
        spendingPhase(team2);
    }
*/
    //Pancada velha
    public void aftermathPhase() {
        team1.updateFirewalls(team2);
        team2.updateFirewalls(team1);
    }


    //metodo para distribuir as perguntas por cada jogador da equipa
    public void distributeQuestions(Player player, BufferedReader bufferedReader, PrintWriter printWriter) {
        List<String> keysAsArray = new ArrayList<>(QUESTIONS.getQuestions().keySet());


        String question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));

        while (player.questionAnswered(question)) {
            question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        }
        int correctAnswer = QUESTIONS.getQuestions().get(question);
        player.receiveQuestion(question, correctAnswer, bufferedReader, printWriter);
    }


    //metodo para perguntar a cada jogador o que quer fazer com os pontos
    public void spendingPhase(Player player, BufferedReader bufferedReader, PrintWriter printWriter) {
        if (player.getScore() > 0) {

            printWriter.println("\n\n\nPlayer Score: " + player.getScore());
            printWriter.println("Choose one of the following options:");
            printWriter.println("1)SPEND POINTS              2)PASS");
            String option1 = checkIfValidInput(1, 2, bufferedReader);

            if (option1.equals("1")) {
                printWriter.println("Choose one of the following options:");
                printWriter.println("1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)");
                String option2 = checkIfValidInput(1, 2, bufferedReader);

                if (option2.equals("1")) {
                    printWriter.println("Score: " + player.getScore());
                    printWriter.println("How many points do you want to spend?");
                    String quantity = checkIfValidInput(1, player.getScore(), bufferedReader);
                    if (team1.containsPlayer(player)) {
                        team1.addVirus(Integer.parseInt(quantity));
                    }else {
                        team2.addVirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                } else {
                    printWriter.println("Score: " + player.getScore());
                    printWriter.println("How many points do you want to spend?");
                    String quantity = checkIfValidInput(1, player.getScore(), bufferedReader);
                    if (team1.containsPlayer(player)) {
                        team1.addAntivirus(Integer.parseInt(quantity));
                    }else {
                        team2.addAntivirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                }
            } else {
                printWriter.println("PHASE PASSED");
            }
            return;
        }
        printWriter.println("\n\n\n\nYOU DON'T HAVE ANY POINTS TO SPEND");
    }


    public void printTeamMembers(PrintWriter printWriter) {
        printWriter.println("Team 1:\n\n" + team1.getPlayersString() + "------------");
        printWriter.println("Team 2:\n\n" + team2.getPlayersString() + "------------");
    }

    public void printTeamStats(PrintWriter printWriter){
        String result1 = "";
        for (Player player : team1.getPlayers()) {
            result1 += player.getName() + " / ";
        }
        String result2 = "";
        for (Player player : team2.getPlayers()) {
            result2 += player.getName() + " / " ;
        }

        printWriter.println("RESOLUTION:\n");
        printWriter.println("Team 1: " + result1);
        printWriter.println("Firewalls: " + team1.getFirewalls() );
        printWriter.println("Virus: " + team1.getViruses());
        printWriter.println("Antivirus: " + team1.getAntivirus());
        printWriter.println("----------------------------");

        printWriter.println("RESOLUTION:\n");
        printWriter.println("Team 2: " + result2);
        printWriter.println("Firewalls: " + team2.getFirewalls() );
        printWriter.println("Virus: " + team2.getViruses());
        printWriter.println("Antivirus: " + team2.getAntivirus());
        printWriter.println("----------------------------");
    }
    /**
     * SETTERS & GETTERS
     **/

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }
}
