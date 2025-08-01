package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;

public class XTurnState implements GameState {
    @Override
    public void next(GameStateContext context) {
        context.setState(new OTurnState());
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}