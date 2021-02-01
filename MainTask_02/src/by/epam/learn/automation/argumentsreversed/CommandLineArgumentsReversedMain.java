package by.epam.learn.automation.argumentsreversed;

import by.epam.learn.automation.util.ConsolePrinter;

import static by.epam.learn.automation.argumentsreversed.Text.SPACE;

/**
 * Display command line arguments in reversed order
 */
public class CommandLineArgumentsReversedMain {

    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            ConsolePrinter.printText(args[i] + SPACE);
        }
    }
}
