package GameStateHandler.Context;

import GameStateHandler.GameState;
import GameStateHandler.ConcreteStates.XTurnState;

public class GameStateContext {
    private GameState gameState;
    public GameStateContext() {
        this.gameState = new XTurnState();
    }

    public void setState(GameState gameState) {
        this.gameState = gameState;
    } 
    public void next() {
        gameState.next(this);
    }
}