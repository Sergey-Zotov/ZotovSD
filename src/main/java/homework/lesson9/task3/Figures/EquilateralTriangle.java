package homework.lesson9.task3.Figures;

import homework.lesson9.task3.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure {
    @Override
    public double getArea() {
        return parameter1 * parameter1 * Math.sqrt(3) / 4;
    }

    @Override
    public double getLength() {
        return parameter1 * 3;
    }
}
