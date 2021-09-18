package test.homework.lesson14;

import org.junit.jupiter.api.Test;

public class Task13 extends JsonPathTest {

    @Test
    public void printByPassportSorted() {
        persons20.stream()
                .sorted((p1, p2) -> {
                    if (!p1.getPassport().getSeries().equals(p2.getPassport().getSeries()))
                        return p1.getPassport().getSeries().compareTo(p2.getPassport().getSeries());
                    return p1.getPassport().getNumber().compareTo(p2.getPassport().getNumber());
                })
                .forEach(person -> System.out.printf("ФИО: %s %s %s, Паспорт: %s %s, Количество объектов недвижимости: %d%n",
                        person.getLastName(),
                        person.getFirstName(),
                        person.getPatronymic(),
                        person.getPassport().getSeries(),
                        person.getPassport().getNumber(),
                        person.getProperties().size()));
    }
}
