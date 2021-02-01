package by.epam.learn.automation.additionaltask01.longshortnumber;

public class LongestNumber {

    public static String getNumber(String[] array) {
        String number = null;
        if (array != null && array.length > 0) {
            number = array[0];
            for (int i = 0; i < array.length; i++) {
                if (number.length() < array[i].length()) {
                    number = array[i];
                }
            }
        }
        return number;
    }

}
