package test.homework.lesson14;

import homework.lesson14.model.Person;
import homework.lesson14.model.Propertie;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class Task10 extends JsonPathTest {

    @Test
    public void allSummAmounts() {
        double allAccountsAmount = persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .map(person -> person.getAccounts())
                .flatMap(accounts -> accounts.stream())
                .map(account -> account.getAccountBalance())
                .reduce((acc1, acc2) -> acc1 + acc2)
                .get();

        double allPropertiesAmount = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .map(Propertie::getPrice)
                .reduce(Double::sum)
                .get();

        System.out.printf("%.2f%n", allAccountsAmount);
        System.out.printf("%.2f%n", allPropertiesAmount);
    }
}
