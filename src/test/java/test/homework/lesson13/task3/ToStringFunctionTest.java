package test.homework.lesson13.task3;

import homework.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToStringFunctionTest {

    @Test
    @DisplayName("результат выполнения метода toString() у объекта Object")
    void testToStringObject() {
        Object object = new Object();
        String expectedToString = object.getClass().getName() + "@" + Integer.toHexString(object.hashCode());
        Assertions.assertEquals(expectedToString, Functions.toStringFunction.execute(object));
    }

    @Test
    @DisplayName("результат выполнения метода toString() у объекта String")
    void testToStringString() {
        Assertions.assertEquals("123qwe", Functions.toStringFunction.execute("123qwe"));
    }

    @Test
    @DisplayName("результат выполнения метода toString() у объекта Cat")
    void testToStringCat() {
        class Cat {
            private String name;
            private int age;

            public Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return String.format("Имя: %s, Возраст: %d", name, age);
            }
        }

        Cat cat = new Cat("Pushok", 7);
        Assertions.assertEquals("Имя: Pushok, Возраст: 7", Functions.toStringFunction.execute(cat));
    }
}
