package leaderboard;

import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
        String divider = "------------------------------------------------------------";
        printWriter.println(CLEAR + ANSI_WHITE_BACKGROUND + ANSI_BLACK);
        printWriter.println(divider);
        printWriter.printf("%15s %30s %n", heading1, heading2);
        printWriter.println(divider);

        leaderboard.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .map(Map.Entry::getKey)
                .forEach(o -> printWriter.printf("%15s %30s %n", o, leaderboard.get(o)));

        printWriter.println(divider + "\n" + ANSI_RESET);
    }

    public Map<String, Integer> getLeaderboard() {
        return leaderboard;
    }
}
