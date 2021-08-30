package homework.lesson11.task4;

import java.util.Date;
import java.util.Objects;

public class Person {

    private String lastName;
    private String firstName;
    private String patronymic;
    private Date birthDate;
    private Passport passport;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Passport getPassport() {
        return passport;
    }

    public Person(String lastName, String firstName, String patronymic, Date birthDate, Passport passport) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getLastName().equals(person.getLastName()) &&
                getFirstName().equals(person.getFirstName()) &&
                getPatronymic().equals(person.getPatronymic()) &&
                getBirthDate().equals(person.getBirthDate()) &&
                getPassport().equals(person.getPassport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLastName(), getFirstName(), getPatronymic(), getBirthDate(), getPassport());
    }
}
