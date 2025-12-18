package cleancode.minesweeper.tobe.minesweepr.io.sign;

import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshotStatus;

public class UncheckedCellSignProvider implements CellSignProvidable {

    private static final String UNCHECKED_SIGN = "□";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.UNCHECKED);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return UNCHECKED_SIGN;
    }
}
