package game;

import questions.Questions;
import server.Lobby;

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
            printWriter.println("\n\n\nPlayer Score: " + player.getScore());
            printWriter.println("Choose one of the following options:");
            printWriter.println("1)SPEND POINTS              2)PASS");
            String option1 = checkIfValidInput(1, 2, bufferedReader, printWriter, lobby);

            if (option1.equals("1")) {
                printWriter.println("Choose one of the following options:");
                printWriter.println("1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)");
                String option2 = checkIfValidInput(1, 2, bufferedReader, printWriter, lobby);

                if (option2.equals("1")) {
                    printWriter.println("Score: " + player.getScore());
                    printWriter.println("How many points do you want to spend?");
                    String quantity = checkIfValidInput(1, player.getScore(), bufferedReader, printWriter, lobby);
                    if (team1.containsPlayer(player)) {
                        team1.addVirus(Integer.parseInt(quantity));
                    } else {
                        team2.addVirus(Integer.parseInt(quantity));
                    }
                    int scoreLeft = player.getScore() - Integer.parseInt(quantity);
                    player.setScore(scoreLeft);
                } else {
                    printWriter.println("Score: " + player.getScore());
                    printWriter.println("How many points do you want to spend?");
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
                printWriter.println("PHASE PASSED");
            }
            return;
        }
        printWriter.println("\n\n\n\nYOU DON'T HAVE ANY POINTS TO SPEND");
    }


    public void printTeamMembers(PrintWriter printWriter) {
        printWriter.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "TEAM 1:\n\n" + "------------\n" + team1.getPlayersString() + "\n" + "------------" + ANSI_RESET + "\n");
        printWriter.println(ANSI_BLUE_BACKGROUND + ANSI_WHITE + "TEAM 2:\n\n" + "------------\n" + team2.getPlayersString() + "\n" + "------------" + ANSI_RESET);
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

        printWriter.println("\n\nRESOLUTION:\n");
        printWriter.println("Team 1: " + result1);
        printWriter.println("Firewalls: " + team1.getFirewalls());
        printWriter.println("Virus: " + team1.getViruses());
        printWriter.println("Antivirus: " + team1.getAntivirus());
        printWriter.println("----------------------------");

        printWriter.println("Team 2: " + result2);
        printWriter.println("Firewalls: " + team2.getFirewalls());
        printWriter.println("Virus: " + team2.getViruses());
        printWriter.println("Antivirus: " + team2.getAntivirus());
        printWriter.println("----------------------------");
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
