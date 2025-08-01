package Controller.GameController;

import Controller.BoardGame;
import GameStateHandler.GameState;
import GameStateHandler.ConcreteStates.OWonState;
import GameStateHandler.ConcreteStates.XWonState;
import GameStateHandler.Context.GameStateContext;
import Utility.Board;
import Utility.Player;
import Utility.Position;

public class TicTacToeGame implements BoardGame {
    private Board board;
    private Player playerX;
    private Player playerO;
    private Player currentPlayer;
    private GameStateContext context;

    public TicTacToeGame(Board board, Player playerX, Player playerO, GameStateContext context) {
        this.board = board;
        this.playerO = playerO;
        this.playerX = playerX;
        this.context = context;
        this.currentPlayer = playerX;
    }

    @Override
    public void play() {
        do {
            Position move = currentPlayer.getPlayerStrategy().makeMove(board);
            board.makeMove(move, currentPlayer.getSymbol());
            if(board.checkGameState(context, currentPlayer)) {
                context.next(currentPlayer, true);
            }
            else {
                context.next(currentPlayer, false);
            }
            board.printBoard();
            switchPlayer();
        } while(!context.getState().isGameOver());
        doAnnouncement();
    }

    private void switchPlayer() {
        currentPlayer = currentPlayer.getSymbol() == playerX.getSymbol() ? playerO : playerX;
    }

    private void doAnnouncement() {
        GameState gameState = context.getState();
        board.printBoard();
        if(gameState instanceof XWonState) {
            System.out.println("X has won");
        }
        else if (gameState instanceof OWonState){
            System.out.println("O has won");
        }
        else {
            System.out.println("Draw");
        }
    }

}