package homework.lesson3.task5;

import java.util.Random;

public class Human {
    String name;
    Dog[] dogs;
    Cat[] cats;

    Human() {
        this.name = Names.randomHumanName();
        this.cats = new Cat[new Random().nextInt(4)];
        this.dogs = new Dog[new Random().nextInt(4)];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();
        }
    }
}
