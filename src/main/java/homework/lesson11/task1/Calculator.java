package homework.lesson11.task1;

import java.util.Arrays;

public class Calculator {

    public static int sum(int... values) {
        return Arrays.stream(values).sum();
    }

    public static int multiplication(int... values) {
        int result = 1;
        for (int value : values) {
            result *= value;
        }
        return result;
    }
}
