package homework.lesson2.task5;

import java.util.Random;

public class ChangingAnArray{
    
    public static void main(String[] args) {
        Random random = new Random();
        final int a = random.nextInt(3) + 3;
        final int b = random.nextInt(3) + 3;

        int[][] original = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                original[i][j] = random.nextInt(10);
                System.out.print(original[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        int[][] twin = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                twin[i][j] = original[j][i];
                System.out.print(twin[i][j]);
            }
            System.out.println();
        }
    }
}
