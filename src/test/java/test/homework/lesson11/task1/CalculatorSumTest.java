package test.homework.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorSumTest extends CalculatorTest {

    @Test
    @DisplayName("Сложение двух чисел")
    public void testSum1() {
        int result = calculator.sum(5, 3);
        Assertions.assertEquals(8, result);
    }

    @Test
    @DisplayName("Сложение 6 чисел")
    public void testSum2() {
        int result = calculator.sum(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(21, result);
    }
}
