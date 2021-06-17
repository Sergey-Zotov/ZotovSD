package homework.lesson6.task2.generators;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", longNumber(3),
                longNumber(3), longNumber(2), longNumber(2));
    }

    private static String longNumber(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += number();
        }
        return result;
    }

    private static int number() {
        return new Random().nextInt(10);
    }
}
