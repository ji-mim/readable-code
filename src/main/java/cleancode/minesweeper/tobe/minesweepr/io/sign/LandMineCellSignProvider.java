package cleancode.minesweeper.tobe.minesweepr.io.sign;

import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshotStatus;

public class LandMineCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.LAND_MINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }
}
