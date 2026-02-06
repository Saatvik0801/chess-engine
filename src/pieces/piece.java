package pieces;

import board.Board;

public abstract class piece {
    protected boolean isWhite;
    public int row;
    public int col;

    public piece(boolean isWhite, int row, int col) {
        this.isWhite = isWhite;
        this.row = row;
        this.col = col;
    }

    public abstract boolean isValidMove(Board board, int r, int c);
}

