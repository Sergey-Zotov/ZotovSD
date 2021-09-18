package test.homework.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1 extends JsonPathTest {

    @Test
    void NoPassportBut3Properties() {
        Long result = persons.stream()
                .filter(person -> person.getPassport() == null)
                .filter(person -> person.getProperties().size() == 3)
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(3, result);
    }

    @Test
    void NumberAccountsNotEqualToNumberCards() {
        Long result = persons.stream()
                .filter(person -> person.getAccounts().size() != person.getCards().size())
                .filter(person -> person.getLastName().equals("Васильев"))
                .peek(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()))
                .count();
        Assertions.assertEquals(10, result);
    }

    @Test
    void First5PassportsWithSeriesStartWith00() {
        persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getPassport().getSeries().startsWith("00"))
                .limit(5)
                .forEach(person -> System.out.printf("%s %s %s%n", person.getLastName(), person.getFirstName(), person.getPatronymic()));
    }
}
