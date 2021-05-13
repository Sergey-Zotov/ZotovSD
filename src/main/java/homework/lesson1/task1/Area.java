package homework.lesson1.task1;

public class Area {

    public static void main(String[] args) {
        Area area = new Area();
        System.out.println(area.getArea(0));
        System.out.println(area.getArea(2));
        System.out.println(area.getArea(100));
        System.out.println();
    }

    double getArea(int radius) {
        final double pi = 3.14;
        return pi * radius * radius;
    }
}
