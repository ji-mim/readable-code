package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.minesweepr.MineSweeper;
import cleancode.minesweeper.tobe.minesweepr.config.GameConfig;
import cleancode.minesweeper.tobe.minesweepr.gameLevel.Beginner;
import cleancode.minesweeper.tobe.minesweepr.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.minesweepr.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
                new Beginner(),
                new ConsoleInputHandler(),
                new ConsoleOutputHandler()
        );

        MineSweeper mineSweeper = new MineSweeper(gameConfig);
        mineSweeper.initialize();
        mineSweeper.run();
    }
}
