package homework.lesson9.task3;

import homework.lesson9.task3.Figures.*;

public class Generator {
    private static int roundRobin = 0;

    public static Figure generate() {
        roundRobin %= 6;
        switch (roundRobin++) {
            case 0:
                return new Circle();
            case 1:
                return new Ellipse();
            case 2:
                return new EquilateralTriangle();
            case 3:
                return new Rectangle();
            case 4:
                return new RightTriangle();
            case 5:
                return new Square();
        }
        return null;
    }
}
