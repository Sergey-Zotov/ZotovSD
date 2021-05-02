package homework.lesson2.task6;

import java.util.Random;

public class Inversion {
    public static void main(String[] args) {

        Random random = new Random();
        final int a = random.nextInt(10) + 3;
        final int b = random.nextInt(10) + 3;

        int[][] original = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                original[i][j] = random.nextInt(2);
            }
        }
        final int x = 1 + random.nextInt(a - 2);
        final int y = 1 + random.nextInt(b - 2);

        original[x][y] = 2;

        int two = 0;

        int[][] reconstruction = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (original[i][j] == 2){
                    two = 2;
                    reconstruction[i][j] = 2;
                    continue;
                }else {
                    reconstruction[i][j] = (two == 2 ? (original[i][j] + 1) % 2 : original[i][j]);
                }
            }
        }
        System.out.println("Оригинал");

        for (int[] line: original){
            System.out.println();
            for (int element : line){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Реконструкция");

        for (int[] line: reconstruction){
            System.out.println();
            for (int element : line){
                System.out.print(element + " ");
            }
        }
    }
}
