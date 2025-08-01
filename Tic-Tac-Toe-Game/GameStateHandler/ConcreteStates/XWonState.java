package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;

public class XWonState implements GameState {
    @Override
    public void next(GameStateContext context) {
        return;
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
