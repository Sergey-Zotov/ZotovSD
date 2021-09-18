package test.homework.lesson14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7 extends JsonPathTest {

    @Test
    public void countAccounts() {
        long total = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .count();

        long checkingTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("расчетный"))
                .count();

        long depositTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("депозитный"))
                .count();

        long currentTotal = persons.stream()
                .flatMap(person -> person.getAccounts().stream())
                .filter(account -> account.getAccountType().equalsIgnoreCase("текущий"))
                .count();

        System.out.println(total);
        System.out.println(checkingTotal);
        System.out.println(depositTotal);
        System.out.println(currentTotal);

        Assertions.assertEquals(total, checkingTotal + currentTotal + depositTotal);
    }
}
