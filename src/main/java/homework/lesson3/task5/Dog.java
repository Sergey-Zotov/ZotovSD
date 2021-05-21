package homework.lesson3.task5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    Dog() {
        this.name = Names.randomDogName();
        this.age = new Random().nextInt(25);
    }
}
