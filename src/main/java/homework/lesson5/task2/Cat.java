package homework.lesson5.task2;

public class Cat {
    private String name;
    private int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }
}
