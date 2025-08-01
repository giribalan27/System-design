package GameStateHandler.ConcreteStates;

import Enum.Symbol;
import GameStateHandler.GameState;
import GameStateHandler.Context.GameStateContext;
import Utility.Player;

public class OTurnState implements GameState {
    @Override 
    public void next(GameStateContext context, Player player, boolean hasWon) {
        if(hasWon) {
            context.setState(player.getSymbol() == Symbol.X ? new XWonState() : new OWonState());
            return;
        }
        context.setState(new XTurnState());
    }
    @Override
    public boolean isGameOver() {
        return false;
    }
}
