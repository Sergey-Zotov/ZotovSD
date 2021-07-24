package homework.lesson9.task3.Figures;

import homework.lesson9.task3.OneParameterFigure;

public class Circle extends OneParameterFigure {
    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 2d * Math.PI * parameter1;
    }
}
