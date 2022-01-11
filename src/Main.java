import leaderboard.Leaderboard;

import java.util.HashMap;
import java.util.Map;

import static leaderboard.LeaderboardManager.serialize;

public class Main {
    public static void main(String[] args) {
       HashMap<String, Integer> leaderboards = new HashMap<String,Integer>();
        leaderboards.put("Çongalinho", 1);
        Leaderboard leaderboard = new Leaderboard(leaderboards);
        serialize(leaderboard);
    }
}
