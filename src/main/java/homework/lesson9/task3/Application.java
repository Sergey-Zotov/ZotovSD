package homework.lesson9.task3;

import homework.lesson9.task3.Figures.RightTriangle;

import java.util.ArrayList;
import java.util.List;

/*
    Для фигур с одним параметром: <Класс фигуры> [<Значение параметра>]: Длина - <длина>, Площадь - <площадь>
    Для фигур с двумя параметрами:
    <Класс фигуры> [<Значение параметра 1>, <Значение параметра 2>]: Длина - <длина>, Площадь - <площадь>.
	После вывода данных о всех фигурах необходимо вывести данные о прямоугольных треугольниках в формате:
    Гипотенуза треугольника [<Параметр1>, <Параметр2>] равна <Длина гипотенузы>.
	Для всех чисел с дробной частью выводить только один знак после разделителя.

 */
public class Application {
    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < 18; i++) {
            figures.add(Generator.generate());
        }

        for (Figure figure : figures) {
            if (figure instanceof OneParameterFigure) {
                System.out.printf("%s [%d]: Длина - %.1f, Площадь - %.1f%n",
                        figure.getClass().getSimpleName(),
                        ((OneParameterFigure) figure).parameter1,
                        figure.getLength(),
                        figure.getArea());
            }
            if (figure instanceof TwoParameterFigure) {
                System.out.printf("%s [%d, %d]: Длина - %.1f, Площадь - %.1f.%n",
                        figure.getClass().getSimpleName(),
                        ((TwoParameterFigure) figure).getParameter1(),
                        ((TwoParameterFigure) figure).getParameter2(),
                        figure.getLength(),
                        figure.getArea());
            }
        }
        for (Figure figure : figures) {
            if (figure instanceof RightTriangle) {
                System.out.printf("Гипотенуза треугольника [%d, %d] равна %.1f.%n",
                        ((RightTriangle) figure).getParameter1(),
                        ((RightTriangle) figure).getParameter2(),
                        ((RightTriangle) figure).getHypotenuse());
            }
        }


    }
}
