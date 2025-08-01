package GameStateHandler.ConcreteStates;

import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;
import Utility.Player;
import Enum.Symbol;

public class XTurnState implements GameState {
    @Override
    public void next(GameStateContext context, Player player, boolean hasWon) {
        if(hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
            return;
        }
        context.setState(new OTurnState());
    }

    @Override
    public boolean isGameOver() {
        return true;
    }
}