package homework.lesson6.task2.generators;

import java.util.Random;

public class NameGenerator {

    public static String generate() {
        String result = "";
        result += letter();
        result = result.toUpperCase();
        int length = new Random().nextInt(6) + 4;
        for (int i = 0; i < length; i++) {
            result += letter();
        }
        return result;
    }

    private static char letter() {
        String line = "юбьтимсчяфывапролджэъхзщшгнекуцй";
        return line.charAt(new Random().nextInt(line.length()));
    }
}
