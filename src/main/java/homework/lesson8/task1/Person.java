package homework.lesson8.task1;

import java.util.Objects;
import java.util.Random;

public class Person {

    private String lastName;
    private String firstName;

    public Person() {
        this.lastName = "Фамилия - " + (new Random().nextInt(20) + 1);
        this.firstName = "Имя - " + (new Random().nextInt(20) + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return lastName.equals(person.lastName) &&
                firstName.equals(person.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName);
    }

    @Override
    public String toString() {
        return String.format("Фамилия: %s, Имя: %s%n", lastName, firstName);
    }
}
