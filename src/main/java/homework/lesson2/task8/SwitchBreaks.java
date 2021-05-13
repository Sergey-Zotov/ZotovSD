package homework.lesson2.task8;

public class SwitchBreaks {

    public static void main(String[] args) {

        switchBreaks(-1);
        switchBreaks(2);
        switchBreaks(4);
        switchBreaks(7);
        switchBreaks(0);
    }

    static void switchBreaks(int a) {
        switch (a) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }
}
