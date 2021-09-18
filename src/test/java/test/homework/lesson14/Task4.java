package test.homework.lesson14;

import homework.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 extends JsonPathTest {

    @Test
    void testStreamMatches() {
        List<Person> filteredPersons = persons.stream()
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getAccounts().size() == 3)
                .filter(person -> person.getCards().size() == 0)
                .collect(Collectors.toList());

        Assertions.assertEquals(0, filteredPersons.size());

        boolean allMatch = filteredPersons.stream()
                .allMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean anyMatch = filteredPersons.stream()
                .anyMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));
        boolean noneMatch = filteredPersons.stream()
                .noneMatch(person -> person.getPassport().getSeries().matches("^[0-9]{4}$"));

        System.out.println(allMatch);
        System.out.println(anyMatch);
        System.out.println(noneMatch);
    }

    @Test
    void findPersonsWithExpiredCards() {
        long haveAnyCardCount = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .count();
        long allExpiredCount = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream()
                        .noneMatch(this::isCardActive))
                .count();
        long allActiveCount = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream()
                        .allMatch(this::isCardActive))
                .count();
        long activeAndExpiredCount = persons.stream()
                .filter(person -> !person.getCards().isEmpty())
                .filter(person -> person.getCards().stream().anyMatch(this::isCardActive)
                        && person.getCards().stream().anyMatch(card -> !isCardActive(card)))
                .count();

        Assertions.assertEquals(haveAnyCardCount, allActiveCount + allExpiredCount + activeAndExpiredCount);

        System.out.println(haveAnyCardCount);
        System.out.println(allExpiredCount);
        System.out.println(allActiveCount);
        System.out.println(activeAndExpiredCount);
    }
}
