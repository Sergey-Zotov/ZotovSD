package homework.lesson1.task3;

public class Whole {

    public static void main(String[] args) {
        Whole whole = new Whole();
        System.out.println(whole.getWhole(14));
        System.out.println(whole.getWhole(19));
    }



    boolean getWhole(int a){
        int b = a % 2;
        return b == 1;
    }
}
