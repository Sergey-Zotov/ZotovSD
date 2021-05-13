package homework.lesson1.task2;

public class Difference {

    public static void main(String[] args) {

        Difference difference = new Difference();
        System.out.println(difference.getDifference(2, 7));
        System.out.println(difference.getDifference(6, 5));
        System.out.println(difference.getDifference(6, 3));
    }

    boolean getDifference(int a, int b) {
        int s = a * b;
        int p = (a + b) * 2;
        return s > p;
    }
}
