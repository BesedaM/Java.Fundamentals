package by.epam.learn.automation.randomnumbers;

import by.epam.learn.automation.util.ConsolePrinter;
import by.epam.learn.automation.util.ConsoleReader;

import static by.epam.learn.automation.randomnumbers.Text.*;

/**
 * Displays given number of integer numbers
 */
public class RandomNumbersMain {

    public static void main(String[] args) {
        int inputNumber = ConsoleReader.Constants.ERROR_NUMBER_DEFAULT;
        int[] numbersArray;
        ConsolePrinter.printText(FIRST_MESSAGE);
        while (inputNumber < MINIMUM_NUMBER_OF_NUMBERS
                || inputNumber > MAXIMUM_NUMBER_OF_NUMBERS) {
            inputNumber = ConsoleReader.readInt();
            if (inputNumber < MINIMUM_NUMBER_OF_NUMBERS
                    || inputNumber > MAXIMUM_NUMBER_OF_NUMBERS) {
                inputNumber = ConsoleReader.Constants.ERROR_NUMBER_DEFAULT;
                ConsolePrinter.printText(ERROR);
            }
        }
        numbersArray = RandomIntegerNumbersGenerator.generateRandomIntValues(inputNumber);
        ConsolePrinter.printText(INLINE_RESULT);
        for (int num : numbersArray) {
            ConsolePrinter.printText(num + SPACE);
        }
        ConsolePrinter.printText(LINE_SEPARATOR);
        ConsolePrinter.printText(DIFFERENT_LINES);
        for (int num : numbersArray) {
            ConsolePrinter.printText(LINE_SEPARATOR+num);
        }

    }
}
