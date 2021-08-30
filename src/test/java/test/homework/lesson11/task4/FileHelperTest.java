package test.homework.lesson11.task4;

import homework.lesson11.task4.FileHelper;
import homework.lesson11.task4.Passport;
import homework.lesson11.task4.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class FileHelperTest extends FileTest {

    @Test
    @DisplayName("Получение персональных данных с листа Persons1 из Excel файла")
    public void getPersons1FromExcelTest() throws ParseException {
        List<Person> people = FileHelper.getPersonsFromExcel("src/main/java/homework/lesson11/task4/persons.xlsx", "Persons1");
        Assertions.assertNotNull(people);
        Assertions.assertEquals(6, people.size());
        List<Person> expectedPeople = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", fromString("18.05.1972"), new Passport("4500", "535344")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );
        for (int i = 0; i < people.size(); i++) {
            Assertions.assertEquals(people.get(i), expectedPeople.get(i));
        }
    }

    @Test
    @DisplayName("Получение персональных данных с листа Persons2 из Excel файла")
    public void getPersons2FromExcelTest() throws ParseException {
        List<Person> people = FileHelper.getPersonsFromExcel("src/main/java/homework/lesson11/task4/persons.xlsx", "Persons2");
        Assertions.assertNotNull(people);
        Assertions.assertEquals(5, people.size());
        List<Person> expectedPeople = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", fromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", fromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", fromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Александрова", "Мария", "Сергеевна", fromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", fromString("17.07.1978"), new Passport("4504", "532212"))
        );
        for (int i = 0; i < people.size(); i++) {
            Assertions.assertEquals(people.get(i), expectedPeople.get(i));
        }
    }

    @Test
    @DisplayName("Получение персональных данных с несуществующего листа из Excel файла")
    public void getPersonFromMissingSheetTest() {
        List<Person> people = FileHelper.getPersonsFromExcel("src/main/java/homework/lesson11/task4/persons.xlsx", "FFF");
        Assertions.assertNull(people);
    }

    @Test
    @DisplayName("Получение персональных данных из несуществующего Excel файла")
    public void getPersonFromMissingFileTest() {
        List<Person> people = FileHelper.getPersonsFromExcel("src/main/java/homework/lesson11/task4/FFF.xlsx", "FFF");
        Assertions.assertNull(people);
    }
}
