package homework.lesson5.task4;

import java.util.Random;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public static String getRandomCatName() {
        Random random = new Random();
        String[] catNames = {"Vaska", "Murka", "Max", "Pirat", "Mashka", "Pushok", "Drujok"};
        String catName = catNames[random.nextInt(catNames.length)];
        return catName;
    }

    public static int getRandomCatAge() {
        Random random = new Random();
        int catAge = random.nextInt(101) - 50;
        return catAge;
    }

}
