package by.epam.learn.automation.monthname;

import by.epam.learn.automation.util.ConsolePrinter;
import by.epam.learn.automation.util.ConsoleReader;

import java.io.IOException;

import static by.epam.learn.automation.monthname.Text.ENTER_NUMBER;
import static by.epam.learn.automation.monthname.Text.INCORRECT_INPUT;

/**
 * Display month's name according to users input
 */
public class MonthNameMain {

    public static void main(String[] args) {
        boolean incorrectInput = true;
        ConsolePrinter.printText(ENTER_NUMBER);
        try {
            while (incorrectInput) {
                String input = ConsoleReader.readText();
                if (NumberValidator.isNumber(input)
                        && NumberValidator.isNumberInMonthRange(input)) {
                    int number = Integer.decode(input);
                    String monthName = MonthNameSelector.getMonthName(number);
                    ConsolePrinter.printText(monthName);
                    incorrectInput = false;
                } else {
                    ConsolePrinter.printText(INCORRECT_INPUT);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
