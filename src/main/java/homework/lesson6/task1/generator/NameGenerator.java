package homework.lesson6.task1.generator;

import java.util.Random;

public class NameGenerator {

    public static String generator() {
        String name = "";
        name += letter();
        name = name.toUpperCase();
        int length = new Random().nextInt(8) + 4;
        for (int i = 0; i < length; i++) {
            name += letter();
        }
        return name;
    }

    private static char letter() {
        String line = "йцукенгшщзхъэждлорпавыфячсмитьбю";
        return line.charAt(new Random().nextInt(line.length()));
    }
}
