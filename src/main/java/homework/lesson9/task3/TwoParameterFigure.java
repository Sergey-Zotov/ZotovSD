package homework.lesson9.task3;

import java.util.Random;

public abstract class TwoParameterFigure extends Figure {
    protected int parameter1;
    protected int parameter2;

    public TwoParameterFigure() {
        parameter1 = new Random().nextInt(10) + 1;
        parameter2 = new Random().nextInt(10) + 1;
    }

    public int getParameter1() {
        return parameter1;
    }

    public int getParameter2() {
        return parameter2;
    }
}
