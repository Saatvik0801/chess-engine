package pieces;

import board.Board;

public class knight extends piece {

    public knight(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
    }

    @Override
    public boolean isValidMove(Board board, int r, int c) {
        int dr = Math.abs(r - row);
        int dc = Math.abs(c - col);
        return (dr == 2 && dc == 1) || (dr == 1 && dc == 2);
    }
}
