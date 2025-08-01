import Controller.GameController.TicTacToeGame;
import Enum.Symbol;
import GameStateHandler.Context.GameStateContext;
import PlayerStartegies.PlayerStrategy;
import Utility.Board;
import Utility.Player;
import PlayerStartegies.ConcreteStrategies.HumanPlayerStrategies;

public class Main {
    public static void main(String[] args) {
        PlayerStrategy playerStrategyX = new HumanPlayerStrategies("X");
        PlayerStrategy playerStrategyO = new HumanPlayerStrategies("O");
        Player playerX = new Player(Symbol.X, playerStrategyX);
        Player playerO = new Player(Symbol.O, playerStrategyO);
        GameStateContext context = new GameStateContext();
        Board board = new Board(3, 3);
        TicTacToeGame game = new TicTacToeGame(board, playerX, playerO, context);
        game.play();
    }
}
