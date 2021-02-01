package by.epam.learn.automation.argumentssum;


import by.epam.learn.automation.util.ConsolePrinter;

import static by.epam.learn.automation.argumentssum.Text.ARGUMENTS_SUM;
import static by.epam.learn.automation.argumentssum.Text.INCORRECT_ARGUMENTS;

/**
 * Counts sum of command line arguments
 */
public class CommandLineArgumentsSumMulti {

    public static void main(String[] args) {
        for (String arg : args) {
            if (!NumberValidator.isNumber(arg)) {
                ConsolePrinter.printText(INCORRECT_ARGUMENTS);
                return;
            }
        }

        ConsolePrinter.printText(ARGUMENTS_SUM);
        ConsolePrinter.printText(ArraySum.countSum(StringNumberArrayTransformer.getIntArray(args)) + "");
    }
}
