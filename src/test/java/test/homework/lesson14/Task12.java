package test.homework.lesson14;

import homework.lesson14.model.Propertie;
import org.junit.jupiter.api.Test;

public class Task12 extends JsonPathTest {

    @Test
    public void printPropertyPrices() {
        persons20.stream()
                .sorted((p1, p2) -> {
                    Double summ1 = p1.getProperties().stream()
                            .map(Propertie::getPrice)
                            .reduce(Double::sum)
                            .get();
                    Double summ2 = p2.getProperties().stream()
                            .map(Propertie::getPrice)
                            .reduce(Double::sum)
                            .get();
                    return summ2.compareTo(summ1);
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Суммарная стоимость недвижимости: %.2f%n",
                        person.getLastName(),
                        person.getFirstName(),
                        person.getPatronymic(),
                        person.getProperties().stream()
                                .map(Propertie::getPrice)
                                .reduce(Double::sum)
                                .get()
                        )
                );
    }
}
