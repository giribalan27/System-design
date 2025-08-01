package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;
import Utility.Player;

public class XWonState implements GameState {
    @Override
    public void next(GameStateContext context, Player player, boolean hasWon) {
        // empty
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}
