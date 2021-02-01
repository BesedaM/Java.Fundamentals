package by.epam.learn.automation.monthname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.epam.learn.automation.monthname.Text.*;

public class NumberValidator {

    private static Pattern pattern = Pattern.compile(NUMBER_REGEXP);

    public static boolean isNumber(String text) {
        Matcher m = pattern.matcher(text);
        return m.matches();
    }

    public static boolean isNumberInMonthRange(String text) {
        boolean monthExists = false;
        if (isNumber(text)) {
            int number = Integer.decode(text);
            if (number >= MIN_MONTH && number <= MAX_MONTH) {
                monthExists = true;
            }
        }
        return monthExists;
    }
}
