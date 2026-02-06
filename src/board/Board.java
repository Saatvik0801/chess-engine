package board;

import pieces.piece;

public class Board {
    private final piece[][] board = new piece[8][8];

    public piece getPiece(int r, int c) {
        return board[r][c];
    }

    public void placePiece(piece p, int r, int c) {
        board[r][c] = p;
    }

    public void movePiece(piece p, int r, int c) {
        board[p.row][p.col] = null;
        board[r][c] = p;
    }
}
