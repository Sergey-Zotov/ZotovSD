package test.homework.lesson11.task3;

import homework.lesson11.task3.Generator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GeneratorIntegerTest extends GeneratorTest {
    @Test
    @DisplayName("Тестирование генерации случайных чисел")
    public void randomNumberTest() {
        for (int i = 0; i < LENGTH; i++) {
            int result = Generator.randomInteger(start, end);
            Assertions.assertEquals(999, result, 1000);
        }
    }
}