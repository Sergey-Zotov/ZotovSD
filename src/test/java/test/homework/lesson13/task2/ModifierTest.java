package test.homework.lesson13.task2;

import homework.lesson13.task2.Modifiers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ModifierTest {

    @Test
    @DisplayName("Инвертирование переменной")
    void modifierTestBoolean(){
        Assertions.assertFalse(Modifiers.invert.modify(true));
        Assertions.assertTrue(Modifiers.invert.modify(false));
    }

    @Test
    @DisplayName("Абсолютное значение переменной (модуль)")
    void modifierTestInteger(){
        Assertions.assertEquals(111, Modifiers.absolute.modify(-111));
        Assertions.assertEquals(111, Modifiers.absolute.modify(111));
        Assertions.assertEquals(0, Modifiers.absolute.modify(0));
    }

    @Test
    @DisplayName("Возврат строки в обратном порядке")
    void modifierTestString(){
        Assertions.assertEquals("JavaCore", Modifiers.revers.modify("eroCavaJ"));
        Assertions.assertEquals("", Modifiers.revers.modify(""));
    }
}
