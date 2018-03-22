import java.util.ArrayList;

public class Player {
    private final String name;
    private final String sign;
    private final ArrayList<Integer> moves;

    protected Player(String name, String sign) {
        this.name = name;
        this.sign = sign;
        this.moves = new ArrayList<Integer>();
    }

    public String getSign() {
        return sign;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMoves() {
        return moves;
    }
    public void addMove(int move){
        moves.add(move);
    }
}
