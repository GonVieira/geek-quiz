package game;

import questions.Questions;

import java.util.Scanner;

public class Game {
    private Team team1;
    private Team team2;
    private Questions questions;
    private int round;


    //Instanciar os metodos necessarios para começar o jogo
    public void gameStart() {
        distributePlayers(team1);
        distributePlayers(team2);
        gameRounds(round++);
    }

    //Metodo para chamar as fases do jogo
    public void gameRounds(int numberOfRounds) {
        while (team1.getFirewalls() > 0 && team2.getFirewalls() > 0) {
            System.out.println("ROUND" + numberOfRounds);
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
    }

    //metodo para distribuir os jogadores pela equipa
    public void distributePlayers(Team team) {
        /*
        Pegar no numero total de jogadores no lobby.
        Adicionar a cada equipa jogadores aleatorios de forma a criar 2 equipas com o mesmo numero de jogadores.
         */
    }

    //metodo para distribuir as perguntas por cada jogador da equipa
    public void distributeQuestions(Team team) {
        for (int i = 0; i < team.getPlayers().size(); i++) {
            //team.getPlayers().get(i).
            //team.getPlayers().get(i).checkIfIsCorrect();
        }
    }


    //metodo para perguntar a cada jogador o que quer fazer com os pontos
    public void spendingPhase(Team team) {
        for (int i = 0; i < team.getPlayers().size(); i++) {
            Player player = team.getPlayers().get(i);
            if (player.getScore() > 0) {
                System.out.println("Choose one of the following options:");
                Scanner sc = new Scanner(System.in);
                String option1 = sc.nextLine();
                System.out.println("1)SPEND POINTS              2)PASS");
                if (option1.equalsIgnoreCase("1")) {
                    String option2 = sc.nextLine();
                    System.out.println("Choose one of the following options:");
                    System.out.println("1)VIRUS(ATK)            2)ANTI-VIRUS(DEF)");
                    if (option2.equalsIgnoreCase("1")) {
                        System.out.println(player.getScore());
                        System.out.println("How many points do you want to spend?");
                        int quantity = Integer.parseInt(sc.nextLine());
                        team.addVirus(quantity);
                        int scoreLeft = player.getScore() - quantity;
                        player.setScore(scoreLeft);
                    } else {
                        System.out.println(player.getScore());
                        System.out.println("How many points do you want to spend?");
                        int quantity = Integer.parseInt(sc.nextLine());
                        team.addAntivirus(quantity);
                        int scoreLeft = player.getScore() - quantity;
                        player.setScore(scoreLeft);
                    }
                } else {
                    System.out.println("PHASE PASSED");
                }
            }
            System.out.println("I DON+'T HAVE ANY POINTS TO SPEND");
        }
    }
}
