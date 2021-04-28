package homework.lesson2.task2;

public class Chess_board {

    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];

        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j <chessBoard.length; j++)
                chessBoard[i][j] = (i + j) % 2;
        }
        System.out.println("Вывод массива через For");
        for (int i = 0; i < chessBoard.length; i++){
            for (int j = 0; j < chessBoard.length; j++)
                System.out.print(chessBoard[i][j]);
            System.out.println("");
        }
        System.out.println("Вывод массива через ForEach");
        for (int[] i : chessBoard){
            for (int j : i)
                System.out.print(j);
            System.out.println("");

        }
        System.out.println("Вывод массива через While");
        int i = 0;
        int j = 0;
        while (i < chessBoard.length){
            while (j < chessBoard.length) {
                System.out.print(chessBoard[i][j]);
                j++;
            }
            i++;
            j = 0;
            System.out.println("");
        }
    }
}
