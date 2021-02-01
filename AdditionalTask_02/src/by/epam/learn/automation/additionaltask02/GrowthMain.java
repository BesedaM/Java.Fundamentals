package by.epam.learn.automation.additionaltask02;

import by.epam.learn.automation.additionaltask02.matrix.baseoperation.MatrixDisplayer;
import by.epam.learn.automation.additionaltask02.matrix.growth.Growth;
import by.epam.learn.automation.additionaltask02.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask02.Text.LONGEST_GROWING_SEQUENCE;

public class GrowthMain {

    public static void displayGrowingSequence(int[][] matrix) {
        int[] growingSequence = Growth.growingSequence(matrix);
        ConsolePrinter.printText(LONGEST_GROWING_SEQUENCE + System.lineSeparator());
        MatrixDisplayer.display1DMatrix(growingSequence);
    }
}
