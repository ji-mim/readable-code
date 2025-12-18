package cleancode.minesweeper.tobe.minesweepr.io;

import cleancode.minesweeper.tobe.minesweepr.board.position.CellPosition;
import cleancode.minesweeper.tobe.minesweepr.user.UserAction;

public interface InputHandler {

    UserAction getUserActionFromUser();

    CellPosition getCellPositionFromUser();

}
