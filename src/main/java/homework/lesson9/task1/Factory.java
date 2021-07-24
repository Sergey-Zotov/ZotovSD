package homework.lesson9.task1;

import java.util.Random;

public class Factory {

    public static Car make() {

        int result = new Random().nextInt(101);
        if (result < 41) return new Renault();
        if (result > 40 && result < 71) return new Nissan();
        if (result > 70 && result < 91) return new Mitsubishi();
        if (result > 90 && result < 101) return new Mercedes();
        throw new IllegalStateException();

    }
}
