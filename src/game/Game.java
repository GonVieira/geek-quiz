package game;

import questions.Questions;
import server.Lobby;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static questions.Questions.getQuestions;
import static utility.Messages.*;
import static utility.Utility.*;

public class Game {

    private Team team1 = new Team();
    private Team team2 = new Team();
    private static final Questions QUESTIONS = new Questions();
    private static final Map<String, Integer> printTeams = new HashMap<>();

    //FIGHT PHASE
    public void aftermathPhase() {
        team1.updateFirewalls(team2);
        team2.updateFirewalls(team1);
    }

    //METHOD TO DISTRIBUTE THE QUESTIONS FOR EACH PLAYER
    public void distributeQuestions(Lobby lobby) {
        List<String> keysAsArray = new ArrayList<>(getQuestions().keySet());
        String question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        while (lobby.getPlayer().questionAnswered(question)) {
            question = keysAsArray.get((int) (Math.random() * keysAsArray.size()));
        }
        int correctAnswer = getQuestions().get(question);
        lobby.getPlayer().receiveQuestion(question, correctAnswer, lobby);
    }

    //SPENDING PHASE
    public void spendingPhase(Lobby lobby) {
        lobby.getPrintWriter().println(SPEND_PHASE_BANNER);
        if (lobby.getPlayer().getScore() > 0) {
            lobby.getPrintWriter().println(SPEND_POINTS_OR_PASS);
            String option1 = checkIfValidInputOrIfUserQuit(1, 2, lobby);

            if (option1.equals("1")) {
                lobby.getPrintWriter().println(CHOOSE_ATTACK_OR_DEFENSE_OR_FIREWALLS);
                String option2 = checkIfValidInputOrIfUserQuit(1, 2, lobby);
                String quantity;
                int scoreLeft;

                switch (option2) {
                    case "1":
                    lobby.getPrintWriter().printf(POINTS, player.getScore());
                    lobby.getPrintWriter().println(CHOOSE_NUMBER_OF_POINTS);
                    quantity = checkIfValidInputOrIfUserQuit(1, lobby.getPlayer().getScore(), lobby);
                    if (team1.containsPlayer(lobby.getPlayer())) {
                        team1.addVirus(Integer.parseInt(quantity));
                    } else {
                        team2.addVirus(Integer.parseInt(quantity));
                    }
                    scoreLeft = lobby.getPlayer().getScore() - Integer.parseInt(quantity);
                    lobby.getPlayer().setScore(scoreLeft);
                    break;
                    case"2":
                    lobby.getPrintWriter().printf(POINTS, lobby.getPlayer().getScore());
                    lobby.getPrintWriter().println(CHOOSE_NUMBER_OF_POINTS);
                    quantity = checkIfValidInputOrIfUserQuit(1, lobby.getPlayer().getScore(), lobby);
                    if (team1.containsPlayer(lobby.getPlayer())) {
                        team1.addAntivirus(Integer.parseInt(quantity));
                    } else {
                        team2.addAntivirus(Integer.parseInt(quantity));
                    }
                    scoreLeft = lobby.getPlayer().getScore() - Integer.parseInt(quantity);
                    lobby.getPlayer().setScore(scoreLeft);
                    break;
                    case "3":
                        lobby.getPrintWriter().printf(POINTS, lobby.getPlayer().getScore());
                        lobby.getPrintWriter().println(CHOOSE_NUMBER_OF_POINTS);
                        quantity = checkIfValidInputOrIfUserQuit(1, lobby.getPlayer().getScore(), lobby);
                        if (team1.containsPlayer(lobby.getPlayer())) {
                            team1.addFirewalls(Integer.parseInt(quantity));
                        } else {
                            team2.addFirewalls(Integer.parseInt(quantity));
                        }
                        scoreLeft = lobby.getPlayer().getScore() - Integer.parseInt(quantity);
                        lobby.getPlayer().setScore(scoreLeft);
                }
            } else {
                lobby.getPrintWriter().println(PHASE_PASSED);
            }
            return;
        }
        lobby.getPrintWriter().println(NO_POINTS);
    }

    //PRINT METHODS
    public void printTeamMembers(PrintWriter printWriter) {
        String heading1 = "TEAM 1";
        String heading2 = "TEAM 2";
        String divider = "------------------------------------------------";
        printWriter.println(CLEAR);
        printWriter.println("TEAMS:");
        printWriter.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK);
        printWriter.println(divider);
        printWriter.printf("%15s %30s %n", heading1, heading2);
        printWriter.println(divider);
        for (int i = 0; i < team1.getPlayers().size(); i++) {
            printWriter.printf("%15s %30s %n", team1.getPlayers().get(i).getName(), team2.getPlayers().get(i).getName());
        }
        printWriter.println(divider + "\n" + ANSI_RESET);
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

    /* GETTERS */

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }
}