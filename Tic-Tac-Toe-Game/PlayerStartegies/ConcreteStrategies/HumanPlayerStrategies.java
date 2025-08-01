package PlayerStartegies.ConcreteStrategies;

import java.util.Scanner;

import PlayerStartegies.PlayerStrategy;
import Utility.Board;
import Utility.Position;

public class HumanPlayerStrategies implements PlayerStrategy {
    private Scanner inp;
    private String playerName;
    
    public HumanPlayerStrategies(String playerName) {
        this.playerName = playerName;
        this.inp = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
        while (true) {
            try {
                System.out.println(playerName + " " + "Enter you move (row and column eg:[1, 2])");
                int row = inp.nextInt();
                int col = inp.nextInt();
                Position move = new Position(row, col);
                if(board.isvalidMove(move)) {
                    return move;
                }
                System.out.println("Invalid Move Try again");
            }
            catch(Exception e) {
                System.out.println("Exception occured" + e);
            }
        }
    }
}
