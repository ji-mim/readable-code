package cleancode.minesweeper.tobe.minesweepr.io.sign;

import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshot;

public interface CellSignProvidable {

    boolean supports(CellSnapshot cellSnapshot);

    String provide(CellSnapshot cellSnapshot);

}
