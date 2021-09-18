package test.homework.lesson14;

import homework.lesson14.model.Account;
import homework.lesson14.model.Person;
import homework.lesson14.model.Propertie;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 extends JsonPathTest {

    @Test
    void calculateAccountSummBalanceLessThan2100K() {
        Function<List<Account>, Double> getSumm = accounts -> {
            double[] summ = {0d};
            accounts.forEach(acc -> summ[0] += acc.getAccountBalance());
            return summ[0];
        };

        persons.stream()
                .filter(person -> !person.getAccounts().isEmpty())
                .filter(person -> getSumm.apply(person.getAccounts()) < 2_100_000)
                .forEach(person -> System.out.printf("%s %s %s: %.2f%n", person.getLastName(), person.getFirstName(), person.getPatronymic(),
                        getSumm.apply(person.getAccounts())));
    }

    @Test
    void calculateMaxLiningPropertyPriceSumm() {
        Function<List<Propertie>, Double> getLivingPropertiesSum = properties -> {
            final double[] summ = {0d};
            properties.forEach(property -> {
                if (property.getType().equals("Жилая"))
                    summ[0] += property.getPrice();
            });
            return summ[0];
        };
        List<Person> sortedPersons = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .sorted(Comparator.comparingDouble(person -> getLivingPropertiesSum.apply(person.getProperties())))
                .collect(Collectors.toList());
        Collections.reverse(sortedPersons);
        Person resultPerson = sortedPersons.get(0);
        System.out.printf("%s %s %s: %.2f%n", resultPerson.getLastName(), resultPerson.getFirstName(), resultPerson.getPatronymic(),
                getLivingPropertiesSum.apply(resultPerson.getProperties()));
    }
}
