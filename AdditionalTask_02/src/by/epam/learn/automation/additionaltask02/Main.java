package by.epam.learn.automation.additionaltask02;

import by.epam.learn.automation.additionaltask02.matrix.baseoperation.MatrixCreator;
import by.epam.learn.automation.additionaltask02.matrix.baseoperation.MatrixDisplayer;
import by.epam.learn.automation.additionaltask02.matrix.baseoperation.MatrixFiller;
import by.epam.learn.automation.additionaltask02.util.ConsolePrinter;
import by.epam.learn.automation.additionaltask02.util.ConsoleReader;

import static by.epam.learn.automation.additionaltask02.Text.*;

/**
 * 2D matrix
 */
public class Main {

    public static void main(String[] args) {

        ConsolePrinter.printText(HELLO_MESSAGE);

        int matrixSize = ConsoleReader.readInt();

        if (matrixSize >= MIN_NUMBERS_TO_ENTER && matrixSize <= MAX_NUMBERS_TO_ENTER) {
            int[][] matrix = MatrixCreator.createMatrix(matrixSize);
            MatrixFiller.fillMatrix(matrix);
            MatrixDisplayer.display2DMatrix(matrix);

            ConsolePrinter.printText(System.lineSeparator());
            ConsolePrinter.printText(PROGRAM_CAN_DO + System.lineSeparator());
            ConsolePrinter.printText(SORTING_CHOICE + System.lineSeparator());
            ConsolePrinter.printText(GROWTH_SEQUENCE_CHOICE + System.lineSeparator());
            ConsolePrinter.printText(CHOICE_MESSAGE);
            int choice = ConsoleReader.readInt();
            switch (choice) {
                case 1:
                    SortingMain.doFieldSorting(matrix);
                    break;
                case 2:
                    GrowthMain.displayGrowingSequence(matrix);
                    break;
                default:
                    ConsolePrinter.printText(ERROR);
            }

        } else {
            ConsolePrinter.printText(ERROR);
        }

    }
}
