package homework.lesson9.task3.Figures;

import homework.lesson9.task3.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure {
    @Override
    public double getArea() {
        return parameter1 * parameter2 / 2;
    }

    @Override
    public double getLength() {
        return parameter1 + parameter2 + getHypotenuse();
    }

    public double getHypotenuse() {
        return Math.sqrt(parameter1 * parameter1 + parameter2 * parameter2);
    }
}
