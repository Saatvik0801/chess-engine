package pieces;

import board.Board;

public class Pawn extends piece {

    public Pawn(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
    }

    @Override
    public boolean isValidMove(Board board, int r, int c) {
        int direction = isWhite ? 1 : -1;

        // Move forward by 1
        if (c == col && r - row == direction && board.getPiece(r, c) == null) {
            return true;
        }

        // Capture diagonally
        if (Math.abs(c - col) == 1 && r - row == direction) {
            piece target = board.getPiece(r, c);
            return target != null && target.isWhite() != this.isWhite;
        }

        return false;
    }
}
