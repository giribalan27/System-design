package Utility;

import Enum.Symbol;

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

    
}
