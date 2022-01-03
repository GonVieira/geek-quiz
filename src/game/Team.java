package game;

import java.util.ArrayList;

public class Team {
    private int firewalls;  //HP
    private int viruses;    //Attack
    private int antivirus;  //Defense
    private final ArrayList<Player> players;

    public Team(ArrayList<Player> players) {
        this.players = players;
        this.firewalls = 5 * players.size();
        this.viruses = 0;
        this.antivirus = 0;
    }

    public void addVirus(int virus) {
        this.viruses = this.viruses + virus;
    }

    public void addAntivirus(int antivirus) {
        this.antivirus = this.antivirus + antivirus;
    }

    public void updateFirewalls(Team opposingTeam) {

        this.firewalls = this.firewalls - (Math.max((opposingTeam.getViruses() - this.antivirus), 0));
    }

    /**
     * GETTERS
     **/
    public int getFirewalls() {
        return firewalls;
    }

    public int getViruses() {
        return viruses;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public synchronized String getPlayersString(){
        String result = "";
        for(Player player : players){
            result += player.getName() + "\n";
        }
        return result;
    }
}
