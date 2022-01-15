package game;

import java.util.ArrayList;

public class Team {
    private int firewalls;  //HP
    private int viruses;    //Attack
    private int antivirus;  //Defense
    private final ArrayList<Player> players = new ArrayList<>();

    public Team() {
        this.viruses = 0;
        this.antivirus = 0;
    }

    public void addVirus(int virus) {
        this.viruses = this.viruses + virus;
    }

    public void addAntivirus(int antivirus) {
        this.antivirus = this.antivirus + antivirus;
    }

    public void addFirewalls(int firewalls) {
        this.firewalls = this.firewalls + firewalls;
    }

    public void updateFirewalls(Team opposingTeam) {

        this.firewalls = Math.max(0, (this.firewalls - (Math.max((opposingTeam.getViruses() - this.antivirus), 0))));
    }

    /* GETTER */

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

    public boolean containsPlayer(Player player) {
        boolean check = false;
        for (Player listPlayer : players) {
            if (player.getName().equals(listPlayer.getName())) {
                check = true;
                return check;
            }
        }
        return check;
    }

    public void setFirewalls(int firewalls) {
        this.firewalls = firewalls;
    }
}