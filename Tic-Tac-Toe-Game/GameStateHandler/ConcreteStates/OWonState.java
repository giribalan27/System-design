package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;

public class OWonState implements GameState {
    @Override 
    public void next(GameStateContext context) {
        context.setState(null);
    }
    
    @Override
    public boolean isGameOver() {
        return true;
    }
} 