package test.homework.lesson11.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorMultiplicationTest extends CalculatorTest {

    @Test
    @DisplayName("Умножение 2 чисел")
    public void testMulti1() {
        int result = calculator.multiplication(3, 2);
        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("Перемножение 6 чисел")
    public void testMulti2() {
        int result = calculator.multiplication(1, 2, 3, 4, 5, 6);
        Assertions.assertEquals(720, result);
    }
}
