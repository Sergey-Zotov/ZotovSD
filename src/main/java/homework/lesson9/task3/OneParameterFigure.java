package homework.lesson9.task3;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {
    protected int parameter1;


    public OneParameterFigure() {
        parameter1 = new Random().nextInt(10) + 1;
    }

    public int getParameter1() {
        return parameter1;
    }
}
