package PlayerStartegies;

import Utility.Board;
import Utility.Position;

public interface PlayerStrategy {
    public Position makeMove(Board board);
}
