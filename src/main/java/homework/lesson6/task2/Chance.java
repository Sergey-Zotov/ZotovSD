package homework.lesson6.task2;

import java.util.Random;

public class Chance {

    public static Boolean calculateChance(int percent) {
        int chance = new Random().nextInt(101);
        return percent >= chance;
    }
}
