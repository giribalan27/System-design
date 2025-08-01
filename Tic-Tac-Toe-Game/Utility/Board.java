package Utility;

import Enum.Symbol;
import GameStateHandler.Context.GameStateContext;

public class Board {
    private int rows;
    private int columns;

    private Symbol[][] grid;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        grid = new Symbol[rows][columns];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                grid[i][j] = Symbol.EMPTY;
            }
        }
    }

    public boolean isvalidMove(Position move) {
        return move.row >= 0 && move.row < rows && move.col >= 0 && move.col < columns
                && grid[move.row][move.col] == Symbol.EMPTY;
    }

    public void makeMove(Position pos, Symbol s) {
        grid[pos.row][pos.col] = s;
    }

    public boolean checkGameState(GameStateContext context, Player currentPlayer) {
        for(int i = 0; i < rows; i++) {
            int countRow = 0, countColumn = 0;
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == currentPlayer.getSymbol())
                    countRow++;
                if(grid[j][i] == currentPlayer.getSymbol())
                    countColumn++;
            }
            if(countRow == columns || countColumn == rows)
                return true;
        }

        int diagonal1 = 0, diagonal2 = 0;
        for(int i = 0; i < rows; i++) {
            if(grid[i][i] == currentPlayer.getSymbol())
                diagonal1++;
            if(grid[i][rows - i - 1] == currentPlayer.getSymbol())
                diagonal2++;
        }
        
        if(diagonal1 == rows || diagonal2 == columns)
            return true;
        return false;
    }

    public void printBoard() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                Symbol symbol = grid[i][j];
                switch(symbol) {
                    case Symbol.X:
                        System.out.print(" X ");
                        break;
                    case Symbol.O:
                        System.out.print(" O ");
                        break;
                    case Symbol.EMPTY:
                    default:
                        System.out.print(" . ");   
                }
                if (j < columns - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < rows - 1) {
                System.out.println("---+---+---");
            }
        }
        System.out.println();
    }
}
