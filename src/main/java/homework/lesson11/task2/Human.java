package homework.lesson11.task2;

public class Human {

    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        String regex = "^[А-Я][а-я]{2,11}$";
        if (firstName.matches(regex)) {
            this.firstName = firstName;
            return this;
        } else throw new IllegalArgumentException("Некорректное имя: " + firstName);
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
            return this;
        } else throw new IllegalArgumentException("Некорректый возраст: " + age);
    }
}
