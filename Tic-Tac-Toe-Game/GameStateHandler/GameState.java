package GameStateHandler;

import GameStateHandler.Context.GameStateContext;

public interface GameState {
    void next(GameStateContext context);
    boolean isGameOver();
}
