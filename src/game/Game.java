package game;

import questions.Questions;
import server.Lobby;
import utility.Messages;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static server.Server.game;
import static utility.Utility.*;

public class Game {

    private Team team1 = new Team();
    private Team team2 = new Team();
    private static final Questions QUESTIONS = new Questions();


    //FIGHT PHASE
    public void aftermathPhase() {
        team1.updateFirewalls(team2);
        team2.updateFirewalls(team1);
    }


    //METHOD TO DISTRIBUTE THE QUESTIONS FOR EACH PLAYER
    public void distributeQuestions(Player player, BufferedReader bufferedReader, PrintWriter printWriter, Lobby lobby) {
        List<String> keysAsArray = new ArrayList<>(QUESTIONS.getQuestions().keySet());
        String question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        while (player.questionAnswered(question)) {
            question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        }
        int correctAnswer = QUESTIONS.getQuestions().get(question);
        player.receiveQuestion(question, correctAnswer, bufferedReader, printWriter, lobby);
    }


    //SPENDING PHASE
    public void spendingPhase(Player player, BufferedReader bufferedReader, PrintWriter printWriter, Lobby lobby) {
        if (player.getScore() > 0) {
            printWriter.println(Messages.SCORE + player.getScore() + Messages.SPEND_OR_PASS);
            String option1 = checkIfValidInput(1, 2, bufferedReader, printWriter, lobby);

            if (option1.equals("1")) {
                printWriter.println(Messages.ATTACK_OR_DEFENCE);
                String option2 = checkIfValidInput(1, 2, bufferedReader, printWriter, lobby);

                if (option2.equals("1")) {
                    printWriter.println(Messages.SCORE + player.getScore());
                    printWriter.println(Messages.SPENDING_POINTS);
                    String quantity = checkIfValidInput(1, player.getScore(), bufferedReader, printWriter, lobby);
                    if (team1.containsPlayer(player)) {
                        team1.addVirus(Integer.parseInt(quantity));
                    } else {
                        team2.addVirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                } else {
                    printWriter.println(Messages.SCORE + player.getScore());
                    printWriter.println(Messages.SPENDING_POINTS);
                    String quantity = checkIfValidInput(1, player.getScore(), bufferedReader, printWriter, lobby);
                    if (team1.containsPlayer(player)) {
                        team1.addAntivirus(Integer.parseInt(quantity));
                    } else {
                        team2.addAntivirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                }
            } else {
                printWriter.println(Messages.PHASE_PASSED);
            }
            return;
        }
        printWriter.println(Messages.NO_POINTS);
    }


    public void printTeamMembers(PrintWriter printWriter) {
        printWriter.printf(Messages.TEAM_1, team1.getPlayersString());
        printWriter.printf(Messages.TEAM_2, team2.getPlayersString());
    }

    public void printTeamStats(PrintWriter printWriter) {
        String result1 = "";
        for (Player player : team1.getPlayers()) {
            result1 += player.getName() + " / ";
        }
        String result2 = "";
        for (Player player : team2.getPlayers()) {
            result2 += player.getName() + " / ";
        }
        printWriter.printf(Messages.RESOLUTION, result1, team1.getFirewalls(), team1.getViruses(), team1.getAntivirus(), result2, team2.getFirewalls(), team2.getViruses(), team2.getAntivirus());
    }


    public boolean bothTeamsareStillAlive(){
        return team1.getFirewalls() > 0 && team2.getFirewalls() > 0;
    }

    public void removePlayer(Player player){
        team1.getPlayers().remove(player);
        team2.getPlayers().remove(player);
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
