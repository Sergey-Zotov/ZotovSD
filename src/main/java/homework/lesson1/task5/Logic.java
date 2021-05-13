package homework.lesson1.task5;

public class Logic {

    public static void main(String[] args) {

        Logic logic = new Logic();
        System.out.println(logic.getLogicOr(false, false) + " " + logic.getLogicAnd(false, false));
        System.out.println(logic.getLogicOr(false, true) + " " + logic.getLogicAnd(false, true));
        System.out.println(logic.getLogicOr(true, false) + " " + logic.getLogicAnd(true, false));
        System.out.println(logic.getLogicOr(true,true) + " " + logic.getLogicAnd(true, true));
    }

    boolean getLogicOr(boolean a, boolean b){
        return !(a || b);
    }
    boolean getLogicAnd(boolean a, boolean b){
        return !a && !b;
    }
}
