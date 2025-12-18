package cleancode.minesweeper.tobe.minesweepr.io;

import cleancode.minesweeper.tobe.minesweepr.board.GameBoard;
import cleancode.minesweeper.tobe.minesweepr.exception.GameException;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingCommet();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);
}
