package homework.lesson6.task1.generator;

import java.util.Random;

public class PhoneGenerator {

    public static String generate() {
        return String.format("+7(%s)%s-%s-%s", longNumber(3), longNumber(3), longNumber(2), longNumber(2));
    }

    private static String longNumber(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += randomNumber();
        }
        return result;
    }

    private static String randomNumber() {
        String a = Integer.toString(new Random().nextInt(10));
        return a;
    }
}
