package homework.lesson2.task8;

public class SwitchNoBreaks {

    public static void main(String[] args) {
        switchNoBreaks(-1);
        switchNoBreaks(2);
        switchNoBreaks(4);
        switchNoBreaks(7);
        switchNoBreaks(0);
    }

    static void switchNoBreaks(int a) {

        switch (a) {
            default:
                System.out.print("A");
            case 4:
                System.out.print("A");
            case 3:
                System.out.print("A");
            case 2:
                System.out.print("A");
            case 1:
                System.out.print("A");
        }
        System.out.println();
    }
}
