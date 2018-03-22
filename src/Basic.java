import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Game game = new Game();
        String[] signs = new String[2];
        signs[0] ="X";
        signs[1] ="O";
        for (int i = 0; i < 2; i++) {
            System.out.println("enter your name");
            String name = scn.nextLine();
            game.addPlayer(name,signs[i]);
        }
        String board = "_1_|_2_|_3_\n" + "_4_|_5_|_6_\n"+" 7 | 8 | 9 ";
        for (int i = 0; i <9 ; i++) {
            int turn = game.getPlayerIndex();
            String currentPlayerName = game.getCurrentPlayerName(turn);
            System.out.println(board);
            System.out.printf("enter your move %s\n",currentPlayerName);
            int pos = scn.nextInt();
            game.addMoves(pos);
            board = board.replace(""+pos,signs[turn]);
        }
    }

}

