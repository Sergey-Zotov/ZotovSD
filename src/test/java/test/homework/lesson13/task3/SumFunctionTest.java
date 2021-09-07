package test.homework.lesson13.task3;

import homework.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumFunctionTest {

    @Test
    @DisplayName("результат выполнения метода sumFunction()")
    void testSumFunction() {
        Assertions.assertEquals(30, Functions.sumFunction.execute(Arrays.asList(5, -5, 10, -10)));
    }
}
