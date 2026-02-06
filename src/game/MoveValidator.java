package game;

import board.Board;
import pieces.piece;

public class MoveValidator {
    private Board board;

    public MoveValidator(Board board) {
        this.board = board;
    }

    public boolean isLegalMove(piece p, int r, int c) {
        return p != null && p.isValidMove(board, r, c);
    }
}
