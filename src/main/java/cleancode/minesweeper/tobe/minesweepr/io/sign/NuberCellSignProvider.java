package cleancode.minesweeper.tobe.minesweepr.io.sign;

import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.minesweepr.board.cell.CellSnapshotStatus;

public class NuberCellSignProvider implements CellSignProvidable{

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.NUMBER);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return String.valueOf(cellSnapshot.getNearbyLandMineCount());
    }
}
