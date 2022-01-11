package leaderboard;

import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static utility.Messages.*;

public class Leaderboard {

    private static Map<String, Integer> leaderboard = new HashMap<>();

    public Leaderboard(HashMap<String, Integer> leaderboard) {

        Leaderboard.leaderboard = leaderboard;
    }

    public static void addPlayerToLeaderboard(String playerName) {
        if (leaderboard != null) {
            if (leaderboard.containsKey(playerName)) {
                leaderboard.replace(playerName, leaderboard.get(playerName), leaderboard.get(playerName) + 1);
                return;
            }
            leaderboard.put(playerName, 1);
            return;
        }
        leaderboard = new HashMap<>();
        leaderboard.put(playerName, 1);
    }

    public static void printLeaderboard(PrintWriter printWriter) {
        String heading1 = "PLAYER";
        String heading2 = "WINS";
        String divider = "-----------------------------------------------";
        printWriter.println(CLEAR);
        printWriter.println("TOP 10 PLAYERS:");
        printWriter.println(ANSI_WHITE_BACKGROUND + ANSI_BLACK);
        printWriter.println(divider);
        printWriter.printf("%15s %30s %n", heading1, heading2);
        printWriter.println(divider);

        leaderboard.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .limit(10)
                .forEach(o -> printWriter.printf("%15s %30s %n", o, leaderboard.get(o)));

        printWriter.println(divider + "\n" + ANSI_RESET);
    }

    public static int getPlayerRank(String name) {
        if (leaderboard.containsKey(name)) {
            return leaderboard.entrySet()
                    .stream()
                    .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList()).indexOf(name) + 1;
        }
        return 0;
    }

    public Map<String, Integer> getLeaderboard() {
        return leaderboard;
    }
}
