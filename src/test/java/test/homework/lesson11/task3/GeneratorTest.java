package test.homework.lesson11.task3;

import homework.lesson11.task3.Generator;
import org.junit.jupiter.api.BeforeEach;

import java.util.Random;

public class GeneratorTest {

    protected final int LENGTH = 10000;
    protected int start;
    protected int end;
    protected Generator generator;

    @BeforeEach
    private void prepare() {
        generator = new Generator();
        start = new Random().nextInt(1000);
        end = new Random().nextInt(1000) + 1000;
    }
}
