package game;

import board.Board;
import pieces.knight;
import pieces.piece;

public class Game {
    private final Board board;
    public MoveValidator validator;

    public Game() {
        board = new Board();
        validator = new MoveValidator(board);
        setup();
    }

    private void setup() {
        board.placePiece(new knight(true, 0, 1), 0, 1);
    }

    public void play() {
        piece p = board.getPiece(0, 1);
        if (validator.isLegalMove(p, 2, 2)) {
            board.movePiece(p, 2, 2);
            System.out.println("Move successful");
        }
    }
}
