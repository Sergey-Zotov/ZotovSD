package test.homework.lesson11.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HumanAgeTest extends HumanTest {

    @Test
    @DisplayName("Тестирование корректного возраста 0")
    public void testHumanAge1() {
        human.setAge(0);
        Assertions.assertEquals(0, human.getAge());
    }

    @Test
    @DisplayName("Тестирование корректного возраста 60")
    public void testHumanAge2() {
        human.setAge(60);
        Assertions.assertEquals(60, human.getAge());
    }

    @Test
    @DisplayName("Тестирование корректного возраста 120")
    public void testHumanAge3() {
        human.setAge(120);
        Assertions.assertEquals(120, human.getAge());
    }

    @Test
    @DisplayName("Тестирование корректного возраста -1")
    public void testHumanAge4() {
        try {
            human.setAge(-1);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректый возраст: -1", e.getMessage());
        }
    }

    @Test
    @DisplayName("Тестирование корректного возраста 121")
    public void testHumanAge5() {
        try {
            human.setAge(121);
            Assertions.fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Некорректый возраст: 121", e.getMessage());
        }
    }
}
