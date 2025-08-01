package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;

public class OTurnState implements GameState {
    @Override 
    public void next(GameStateContext context) {
        context.setState(new XTurnState());
    }
    @Override
    public boolean isGameOver() {
        return false;
    }
}
