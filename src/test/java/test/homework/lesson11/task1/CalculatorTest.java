package test.homework.lesson11.task1;

import homework.lesson11.task1.Calculator;
import org.junit.jupiter.api.BeforeEach;

public class CalculatorTest {

    protected Calculator calculator;

    @BeforeEach
    public void prepare() {
        calculator = new Calculator();
    }
}

