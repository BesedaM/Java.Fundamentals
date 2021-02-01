package by.epam.learn.automation.additionaltask01;

import by.epam.learn.automation.additionaltask01.differentnumbersmin.DifferentNumbersMin;
import by.epam.learn.automation.additionaltask01.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask01.Text.NUMBER_DIFFERENT_NUMBERS_MIN;

public class DifferentNumbersMinMain {

    public static void findNumber(String[] array){
        String number = DifferentNumbersMin.findNumber(array);
        ConsolePrinter.printText(NUMBER_DIFFERENT_NUMBERS_MIN + number);
    }
}
