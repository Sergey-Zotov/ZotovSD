package test.homework.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanFirstNameTest extends HumanTest {

    @Test
    @DisplayName("Тестирование корректного имени Иван")
    public void testHumanName1() {
        human.setFirstName("Иван");
        Assertions.assertEquals("Иван", human.getFirstName());
    }

    @Test
    @DisplayName("Тестирование не корректного имени Ив")
    public void testHumanName2() {
        try {
            human.setFirstName("Ив");
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: Ив", e.getMessage());
        }
    }

    @Test
    @DisplayName("Тестирование не корректного имени Ивансдлиннымименем")
    public void testHumanName3() {
        try {
            human.setFirstName("Ивансдлиннымименем");
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: Ивансдлиннымименем", e.getMessage());
        }
    }

    @Test
    @DisplayName("Тестирование не корректного имени Иван5аа")
    public void testHumanName4() {
        try {
            human.setFirstName("Иван5аа");
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректное имя: Иван5аа", e.getMessage());
        }
    }
}
