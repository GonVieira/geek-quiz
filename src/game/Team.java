package game;

import java.util.ArrayList;

public class Team {
    private int firewalls;
    private int viruses;
    private int antiviruses;
    private final ArrayList<Player> players;

    public Team(ArrayList<Player> players){
        this.players = players;
        this.firewalls = 5 * players.size();
        this.viruses = 0;
        this.antiviruses = 0;
    }

    public void addVirus(int virus){
        this.viruses = this.viruses + virus;
    }

    public void addAntivirus(int antivirus){
        this.antiviruses = this.antiviruses + antivirus;
    }

    public void updateFirewalls(Team opposingTeam){
        this.firewalls = this.firewalls - (Math.max((opposingTeam.getViruses() - this.antiviruses),0));
    }

    /**GETTERS**/
    public int getFirewalls() {
        return firewalls;
    }

    public int getViruses() {
        return viruses;
    }

    public int getAntiviruses() {
        return antiviruses;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

}
