package homework.lesson9.task2;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static int roundRobin = 0;

    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            objects.add(Generator.generate());
        }
        for (Object object : objects) {
            Action.action(object);
        }
    }
}
