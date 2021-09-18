package test.homework.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task8 extends JsonPathTest {

    @Test
    public void countCards() {
        long total = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .count();

        long visaTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("VISA"))
                .count();

        long mcTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("MasterCard"))
                .count();

        long mirTotal = persons.stream()
                .flatMap(person -> person.getCards().stream())
                .filter(this::isCardActive)
                .filter(card -> card.getType().equalsIgnoreCase("мир"))
                .count();

        System.out.println(total);
        System.out.println(visaTotal);
        System.out.println(mcTotal);
        System.out.println(mirTotal);

        Assertions.assertEquals(total, visaTotal + mirTotal + mcTotal);
    }
}
