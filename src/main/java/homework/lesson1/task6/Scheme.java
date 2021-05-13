package homework.lesson1.task6;

public class Scheme {

    public static void main(String[] args) {

        Scheme scheme = new Scheme();
        System.out.println(scheme.getScheme(false, false, false, false));
        System.out.println(scheme.getScheme(true, true, true, true));
        System.out.println(scheme.getScheme(false, true, false, true));
        System.out.println(scheme.getScheme(true,false,true,false));
        System.out.println(scheme.getScheme(true,true,false,false));
    }

    boolean getScheme(boolean a, boolean b, boolean c, boolean d){

        return (a && b) && !(c || d);
    }
}
