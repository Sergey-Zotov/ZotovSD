package test.homework.lesson14;

import homework.lesson14.model.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class Task6 extends JsonPathTest {

    @Test
    public void calculateTotalPropertiesCount() {
        long total = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .count();

        long livingTotal = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Жилая"))
                .count();

        long commercialTotal = persons.stream()
                .map(Person::getProperties)
                .flatMap(Collection::stream)
                .filter(property -> property.getType().equals("Нежилая"))
                .count();

        System.out.println(total);
        System.out.println(livingTotal);
        System.out.println(commercialTotal);
        Assertions.assertEquals(total, livingTotal + commercialTotal);
    }
}
