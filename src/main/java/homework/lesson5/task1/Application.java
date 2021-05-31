package homework.lesson5.task1;

import java.util.Random;

public class Application {

    public static void main(String[] args) {

        Random random = new Random();
        final int[] dividends = new int[random.nextInt(6) + 5];
        for (int i = 0; i < dividends.length; i++) {
            dividends[i] = random.nextInt(6) + 4;
        }

        final int[] dividers = new int[random.nextInt(6) + 5];
        for (int i = 0; i < dividers.length; i++) {
            dividers[i] = random.nextInt(4);
        }

        int[][] result = new int[dividers.length][dividends.length];
        for (int i = 0; i < dividends.length; i++) {
            for (int j = 0; j < dividers.length; j++) {
                try {
                    result[j][i] = dividends[i] / dividers[j];
                } catch (ArithmeticException exception) {
                    result[j][i] = -1;
                }
            }
        }

        System.out.println("Массив dividends");
        for (int value : dividends) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Массив dividers");
        for (int value : dividers) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Двумерный массив result");
        for (int i = 0; i < dividends.length; i++) {
            for (int j = 0; j < dividers.length; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}
