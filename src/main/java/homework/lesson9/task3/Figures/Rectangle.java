package homework.lesson9.task3.Figures;

import homework.lesson9.task3.TwoParameterFigure;

public class Rectangle extends TwoParameterFigure {
    @Override
    public double getArea() {
        return parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        return parameter1 * 2 + parameter2 * 2;
    }
}
