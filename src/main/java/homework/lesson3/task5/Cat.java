package homework.lesson3.task5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    Cat() {
        this.name = Names.randomCatName();
        this.age = new Random().nextInt(20);
    }
}
