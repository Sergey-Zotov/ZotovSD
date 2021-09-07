package test.homework.lesson13.task3;

import homework.lesson13.task3.Functions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Objects;

public class OnlyEqualsObjectsTest {

    @Test
    @DisplayName("результат выполнения метода OnlyEquals у объекта Object")
    void testOnlyEqualsObject() {
        Object object = new Object();
        Object object1 = new Object();
        Object object2 = object;
        Object object3 = object;
        Object object4 = object;
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList(object, object2, object3, object4)));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList(object, object2, object1, object4)));
    }

    @Test
    @DisplayName("результат выполнения метода OnlyEquals у пустого List")
    void testOnlyEqualsList() {
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList()));
    }

    @Test
    @DisplayName("результат выполнения метода OnlyEquals у объекта String")
    void testOnlyEqualsString() {
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList("qwerty",
                "qwerty", "qwerty", "qwerty")));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList("qwerty",
                "qwerty", "ytrewq")));
    }

    @Test
    @DisplayName("результат выполнения метода OnlyEquals у объекта Cat")
    void testOnlyEqualsCat() {
        class Cat {
            private String name;
            private int age;

            public Cat(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Cat)) return false;
                Cat cat = (Cat) o;
                return age == cat.age &&
                        Objects.equals(name, cat.name);
            }

            @Override
            public int hashCode() {
                return Objects.hash(name, age);
            }
        }

        Cat cat = new Cat("Zuzu", 9);
        Cat cat1 = new Cat("Zuzu", 9);
        Cat cat2 = new Cat("Zuzu", 9);
        Cat cat3 = new Cat("Zuzubastik", 95);
        Assertions.assertTrue(Functions.onlyEqualsObjects.execute(Arrays.asList(cat, cat1, cat2)));
        Assertions.assertFalse(Functions.onlyEqualsObjects.execute(Arrays.asList(cat1, cat2, cat, cat3)));
    }
}
