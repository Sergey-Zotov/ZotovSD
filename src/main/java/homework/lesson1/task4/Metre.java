package homework.lesson1.task4;

public class Metre {

    public static void main(String[] args) {
        Metre metre = new Metre();
        System.out.println(metre.getMetre(115));
        System.out.println(metre.getMetre(800));
        System.out.println(metre.getMetre(278));
    }
    int getMetre(int sm){
        int m = sm / 100;
        return m;
    }
}
