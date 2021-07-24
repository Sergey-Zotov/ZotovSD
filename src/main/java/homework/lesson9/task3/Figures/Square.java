package homework.lesson9.task3.Figures;

import homework.lesson9.task3.OneParameterFigure;

public class Square extends OneParameterFigure {
    @Override
    public double getArea() {
        return parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return parameter1 * 4;
    }
}
