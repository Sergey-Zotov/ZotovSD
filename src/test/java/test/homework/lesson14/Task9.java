package test.homework.lesson14;

import homework.lesson14.model.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task9 extends JsonPathTest {

    @Test
    public void countCards() {
        long accountCount = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> person.getAccounts().stream()
                        .map(Account::getAccountBalance)
                        .reduce((bal1, bal2) -> bal1 + bal2)
                        .get() > 20_000_000d)
                .count();

        long propertiesCount = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getProperties().stream()
                        .map(property -> property.getPrice())
                        .reduce((price1, price2) -> price1 + price2)
                        .get() > 26_000_000d)
                .count();
        System.out.println(accountCount);
        System.out.println(propertiesCount);

        Assertions.assertEquals(accountCount, propertiesCount);

    }
}
