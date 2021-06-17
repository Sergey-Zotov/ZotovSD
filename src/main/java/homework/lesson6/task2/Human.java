package homework.lesson6.task2;

import java.util.Map;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    private Map<PhoneType, String> phones;

    public Human(String lastName, String firstName, int age, Map<PhoneType, String> phones) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phones = phones;
    }

    public String getLastName() {
        return lastName;
    }

    public Human setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Human setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Human setAge(int age) {
        this.age = age;
        return this;
    }

    public Map<PhoneType, String> getPhones() {
        return phones;
    }

    public Human setPhones(Map<PhoneType, String> phones) {
        this.phones = phones;
        return this;
    }
}
