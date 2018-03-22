import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private int playerIndex;

    public Game() {
        this.players = new ArrayList<Player>();
        this.playerIndex = 0;
    }
    public void addPlayer(String name, String sign){
        Player player = new Player(name,sign);
        players.add(player);
    }

    public int getPlayerIndex() {
        return playerIndex;
    }
    public void setPlayerIndex(){
        this.playerIndex = 1-playerIndex;
    }
    public void addMoves(int move){
        setPlayerIndex();
        Player player = players.get(playerIndex);
        player.addMove(move);
    }
    public String getCurrentPlayerName(int index){
        return players.get(index).getName();
    }
}