package homework.lesson14.helpers;

import homework.lesson14.model.Person;
import homework.lesson14.model.Propertie;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.stream.Collectors;

public class PersonFilterHelper {

    public static List<Person> getFilteredPersons() {
        List<Person> persons = JsonHelper.getPersonsFromFile("src/main/java/homework/lesson14/dataset.json");
        List<Person> filteredPersons = persons.stream()
                .filter(person -> !person.getProperties().isEmpty())
                .filter(person -> person.getCards().size() == 3)
                .filter(person -> person.getPassport() != null)
                .filter(person -> person.getProperties().stream()
                        .map(Propertie::getPrice)
                        .reduce(Double::sum)
                        .get() > 20_000_000)
                .collect(Collectors.toList());

        Assertions.assertEquals(20, filteredPersons.size(), "Проверка числа клиентов отсортированного списка");
        return filteredPersons;
    }
}
