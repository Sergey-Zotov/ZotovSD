package homework.lesson3.task4;

public class Application {
    public static void main(String[] args) {
        Human sergey = new Human("Сергей");
        Human michail = new Human("Михаил");
        Human egor = new Human("Егор");
        Human alexandr = new Human("Александр");
        Human valeriy = new Human("Валерий");
        Human stanislav = new Human("Станислав");
        Human georgiy = new Human("Георгий");

        sergey.friendship(valeriy);
        sergey.friendship(georgiy);
        valeriy.friendship(stanislav);
        stanislav.friendship(michail);
        michail.friendship(alexandr);
        alexandr.friendship(egor);
        alexandr.friendship(georgiy);
        egor.friendship(georgiy);

        System.out.println(areFriends(sergey, georgiy));
        System.out.println(areFriends(sergey, alexandr));
        System.out.println(areFriends(stanislav, michail));
        System.out.println(areFriends(michail, valeriy));
    }

    static boolean areFriends(Human first, Human second) {
        for (Human firstFriend : first.friends) {
            if (firstFriend == second) {
                return true;
            }
        }
        return false;
    }
}
