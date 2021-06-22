package homework.lesson6.task4;

import java.util.Random;

public class NameGenerator {

    private static final String SYMBOL = "qwertyuioplkjhgfdsazxcvbnm";

    public static String generate() {
        String result = "";
        result += generateSymbol(1);
        result = result.toUpperCase();
        int length = new Random().nextInt(8) + 4;
        result += generateSymbol(length);
        return result;

    }

    private static String generateSymbol(int length) {
        String result = "";
        for (int i = 0; i < length; i++) {
            result += SYMBOL.charAt(new Random().nextInt(SYMBOL.length()));
        }
        return result;
    }
}
