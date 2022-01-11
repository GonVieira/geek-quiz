import leaderboard.Leaderboard;

import java.util.HashMap;
import java.util.Map;

import static leaderboard.LeaderboardManager.serialize;

public class Main {
    public static void main(String[] args) {
       HashMap<String, Integer> leaderboards = new HashMap<String,Integer>();
        leaderboards.put("Çongalinho", 6);
        leaderboards.put("NNeto", 6);
        leaderboards.put("Genesis", 6);
        leaderboards.put("rippeR", 6);
        leaderboards.put("Quim", 4);
        leaderboards.put("Zacarias", 5);
        leaderboards.put("Toni", 3);
        leaderboards.put("Manel", 3);
        leaderboards.put("Tobias", 2);
        leaderboards.put("Alfredo", 3);
        Leaderboard leaderboard = new Leaderboard(leaderboards);
        serialize(leaderboard);
    }
}
