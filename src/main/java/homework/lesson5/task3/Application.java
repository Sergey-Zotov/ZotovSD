package homework.lesson5.task3;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int total = random.nextInt(501) + 500;
        for (int i = 0; i < total; i++) {
            int m = random.nextInt(5);
            int n = random.nextInt(5);
            try {
                int a = m / n;
            } catch (ArithmeticException exception) {
                count++;
            }
        }
        System.out.printf("Из %d операций деления %d было выполнено с ошибкой.", total, count);
    }
}
