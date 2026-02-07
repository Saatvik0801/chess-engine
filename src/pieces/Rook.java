package pieces;

import board.Board;

public class Rook extends piece {

    public Rook(boolean isWhite, int row, int col) {
        super(isWhite, row, col);
    }

    @Override
    public boolean isValidMove(Board board, int r, int c) {
        // Must move in straight line
        if (r != row && c != col) return false;

        int dr = Integer.compare(r, row);
        int dc = Integer.compare(c, col);

        int cr = row + dr;
        int cc = col + dc;

        // Path clearance check
        while (cr != r || cc != c) {
            if (board.getPiece(cr, cc) != null) return false;
            cr += dr;
            cc += dc;
        }

        // Destination square
        piece target = board.getPiece(r, c);
        return target == null || target.isWhite() != this.isWhite;
    }
}
