package by.epam.learn.automation.additionaltask01;

import by.epam.learn.automation.additionaltask01.differentnumbers.DifferentNumbers;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask01.Text.NUMBER_DIFFERENT_NUMBERS;

public class DifferentNumbersMain {

    public static void findNumber(String[] numbers) {
        String numberWithDifferentNumbers = DifferentNumbers.findNumber(numbers);
        ConsolePrinter.printText(NUMBER_DIFFERENT_NUMBERS + numberWithDifferentNumbers);
    }
}
