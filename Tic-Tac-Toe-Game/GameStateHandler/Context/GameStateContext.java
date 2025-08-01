package GameStateHandler.Context;

import GameStateHandler.GameState;
import GameStateHandler.ConcreteStates.XTurnState;
import Utility.Player;

public class GameStateContext {
    private GameState gameState;
    public GameStateContext() {
        this.gameState = new XTurnState();
    }

    public void setState(GameState gameState) {
        this.gameState = gameState;
    } 
    public void next(Player player, boolean hasWon) {
        gameState.next(this, player, hasWon);
    }
    public GameState getState() {
        return gameState;
    }
}