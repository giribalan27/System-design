package GameStateHandler;

import GameStateHandler.Context.GameStateContext;
import Utility.Player;

public interface GameState {
    void next(GameStateContext context, Player player, boolean hasWon);
    boolean isGameOver();
}
