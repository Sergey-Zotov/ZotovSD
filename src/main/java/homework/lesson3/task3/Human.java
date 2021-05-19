package homework.lesson3.task3;

public class Human {
    int age;
    String name;
    Human[] parents;

    Human(int age, String name, Human mom, Human dad) {
        this.age = age;
        this.name = name;
        this.parents = new Human[]{mom, dad};
    }
}
