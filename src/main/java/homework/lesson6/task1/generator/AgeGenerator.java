package homework.lesson6.task1.generator;

import java.util.Random;

public class AgeGenerator {

    public static int generate() {
        return 20 + new Random().nextInt(56);
    }
}
