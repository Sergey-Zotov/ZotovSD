package test.homework.lesson11.task3;

import homework.lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneratorStringTest extends GeneratorTest {

    @Test
    @DisplayName("Тестирование генерации случайных строк")
    public void randomStringsTest() {
        for (int i = 0; i < LENGTH; i++) {
            String randomString = Generator.randomString(start, end);
            Assertions.assertTrue(randomString.matches("^[А-Яа-я]{0,1999}$"));
        }
    }
}
