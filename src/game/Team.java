package game;

import java.util.ArrayList;

public class Team {
    private int firewalls;
    private int viruses;
    private int antivirus;
    private final ArrayList<Player> players;

    public Team(ArrayList<Player> players){
        this.players = players;
        this.firewalls = 5 * players.size();
        this.viruses = 0;
        this.antivirus = 0;
    }

    public void addVirus(int virus){
        this.viruses = this.viruses + virus;
    }

    public void addAntivirus(int antivirus){
        this.antivirus = this.antivirus + antivirus;
    }

    public void updateFirewalls(Team opposingTeam){
        this.firewalls = this.firewalls - (Math.max((opposingTeam.getViruses() - this.antivirus),0));
    }

    /**GETTERS**/
    public int getFirewalls() {
        return firewalls;
    }

    public int getViruses() {
        return viruses;
    }

    public int getAntivirus() {
        return antivirus;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

}
