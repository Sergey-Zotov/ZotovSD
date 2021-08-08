package test.homework.lesson11.task2;

import homework.lesson11.task2.Human;
import org.junit.jupiter.api.BeforeEach;

public class HumanTest {

    protected Human human;

    @BeforeEach
    public void prepare() {
        human = new Human();
    }
}
