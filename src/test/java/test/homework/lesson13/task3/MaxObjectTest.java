package test.homework.lesson13.task3;

import homework.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MaxObjectTest {

    @Test
    @DisplayName("результат выполнения метода maxObject у объекта Double")
    void testMaxObjectDouble() {
        Assertions.assertEquals(12.25, Functions.maxObject.execute(Arrays.asList(1.12, 6.456, -11.5, 12.24, 5.4589632, 12.25, -110.0)));
    }

    @Test
    @DisplayName("результат выполнения метода maxObject у объекта String")
    void testMaxObjectString() {
        Assertions.assertEquals("zzzz", Functions.maxObject.execute(Arrays.asList("asdf", "attt", "aaaaaaaaaa", "zzzz", "ggggg")));
    }
}
