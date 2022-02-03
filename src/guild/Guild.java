package guild;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    private String name;
    private int capacity;
    private Collection<Player> roster;

    public Guild(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Collection<Player> getRoster() {
        return roster;
    }

    public void setRoster(Collection<Player> roster) {
        this.roster = roster;
    }

    public void addPlayer(Player player){
        if(this.getRoster().size() + 1 <= this.getCapacity()){
            roster.add(player);
        }
    }

    public boolean removePlayer(String name){
        return this.getRoster().removeIf(p -> p.getName().equals(name));
    }

    public void promotePlayer(String name){
        Player playerToPromote = this.getPlayerByName(name);
        if(playerToPromote != null && !playerToPromote.getRank().equals("Member")) {
            playerToPromote.setRank("Member");
        }
    }

    public void demotePlayer(String name){
        Player playerToDemote = this.getPlayerByName(name);
        if(playerToDemote != null && !playerToDemote.getRank().equals("Trial")) {
            playerToDemote.setRank("Trial");
        }
    }

    private Player getPlayerByName(String name) {
        for(Player player : this.getRoster()) {
            if(player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public int count(){
        return this.getRoster().size();
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> playersToKick = this.getRoster().stream().filter(p -> p.getClazz().equals(clazz)).collect(Collectors.toList());

        Player[] kickedPlayers = new Player[playersToKick.size()];
        playersToKick.toArray(kickedPlayers);

        this.getRoster().removeAll(playersToKick);
        return kickedPlayers;
    }

    public String report(){
        String guildInfo = String.format("Players in the guild: %s:%n", this.getName());
        StringBuilder sb = new StringBuilder(guildInfo);

        for(Player player : this.getRoster()){
            sb.append(player.toString()).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
