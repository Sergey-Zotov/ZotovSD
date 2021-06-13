package homework.lesson5.task4;

import java.util.Random;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0) {
                throw new AgeUnderZeroException();
            }
            if (age > 25) {
                throw new AgeTooHighException();
            }
            this.name = name;
            this.age = age;
        } catch (AgeUnderZeroException exception) {
            StackTraceElement element = exception.getStackTrace()[0];
            System.out.println(element);
        }
    }

    public String getName() {
        if (name == null) {
            throw new NullPointerException();
        }
        return name;
    }

    public int getAge() {
        return age;
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
