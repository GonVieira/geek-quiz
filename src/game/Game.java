package game;

import questions.Questions;
import server.Lobby;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import static questions.Questions.getQuestions;
import static utility.Messages.*;
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
        List<String> keysAsArray = new ArrayList<>(getQuestions().keySet());
        String question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        while (player.questionAnswered(question)) {
            question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        }
        int correctAnswer = getQuestions().get(question);
        player.receiveQuestion(question, correctAnswer, bufferedReader, printWriter, lobby);
    }

    //SPENDING PHASE
    public void spendingPhase(Player player, BufferedReader bufferedReader, PrintWriter printWriter, Lobby lobby) {
        printWriter.println(SPEND_PHASE_BANNER);
        if (player.getScore() > 0) {
            printWriter.println(SPEND_POINTS_OR_PASS);
            String option1 = checkIfValidInputOrIfUserQuit(1, 2, lobby);

            if (option1.equals("1")) {
                printWriter.println(CHOOSE_ATTACK_OR_DEFENSE);
                String option2 = checkIfValidInputOrIfUserQuit(1, 2, lobby);

                if (option2.equals("1")) {
                    printWriter.printf(POINTS, player.getScore());
                    printWriter.println(CHOOSE_NUMBER_OF_POINTS);
                    String quantity = checkIfValidInputOrIfUserQuit(1, player.getScore(), lobby);
                    if (team1.containsPlayer(player)) {
                        team1.addVirus(Integer.parseInt(quantity));
                    } else {
                        team2.addVirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                } else {
                    printWriter.printf(POINTS, player.getScore());
                    printWriter.println(CHOOSE_NUMBER_OF_POINTS);
                    String quantity = checkIfValidInputOrIfUserQuit(1, player.getScore(), lobby);
                    if (team1.containsPlayer(player)) {
                        team1.addAntivirus(Integer.parseInt(quantity));
                    } else {
                        team2.addAntivirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                }
            } else {
                printWriter.println(PHASE_PASSED);
            }
            return;
        }
        printWriter.println(NO_POINTS);
    }

    //PRINT METHODS
    public void printTeamMembers(PrintWriter printWriter) {
        printWriter.printf(TEAM_1, team1.getPlayersString());
        printWriter.printf(TEAM_2, team2.getPlayersString());
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
        printWriter.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK + "\033[4;30m");
        printWriter.printf("%-15s %15s %30s %n", "","TEAM 1","TEAM 2");
        printWriter.printf("%-15s %15s %30s %n", "FIREWALLS |", team1.getFirewalls(), team2.getFirewalls());
        printWriter.printf("%-15s %15s %30s %n", "VIRUS     |", team1.getViruses(), team2.getViruses());
        printWriter.printf("%-15s %15s %30s %n", "ANTIVIRUS |", team1.getAntivirus(), team2.getAntivirus());
        printWriter.println(ANSI_RESET);
    }

    public boolean bothTeamsareStillAlive(){
        return team1.getFirewalls() > 0 && team2.getFirewalls() > 0;
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
