package by.epam.learn.automation.randomnumbers;

import java.util.Random;

import static by.epam.learn.automation.randomnumbers.Text.MAXIMUM_NUMBER_OF_NUMBERS;
import static by.epam.learn.automation.randomnumbers.Text.MINIMUM_NUMBER_OF_NUMBERS;

public class RandomIntegerNumbersGenerator {

    private static Random generator = new Random();

    public static int[] generateRandomIntValues(int number) {
        int[] numArray = new int[number];
        for (int i = 0; i < number; i++) {
            numArray[i] = generator.nextInt(MAXIMUM_NUMBER_OF_NUMBERS - MINIMUM_NUMBER_OF_NUMBERS)
                    + MINIMUM_NUMBER_OF_NUMBERS;
        }
        return numArray;
    }

}
