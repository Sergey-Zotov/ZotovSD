package homework.lesson3.task3;

public class Application {
    public static void main(String[] args) {
        Human ivan = new Human(70, "Иван", null, null);
        Human alexsandra = new Human(55, "Александра", null, null);
        Human valeriy = new Human(60, "Валерий", null, null);
        Human sergey = new Human(32, "Сергей", alexsandra, valeriy);
        Human marina = new Human(30, "Марина", null, ivan);
        Human vitaliy = new Human(7, "Виталий", marina, sergey);
        Human elena = new Human(1, "Елена", marina, sergey);

        Human[] olds = new Human[4];
        int index = 0;

        for (int i = 0; i < elena.parents.length; i++) {
            Human[] oldPerents = elena.parents[i].parents;
            for (int j = 0; j < oldPerents.length; j++) {
                olds[index++] = oldPerents[j];
            }
        }

        for (int i = 0; i < olds.length; i++) {
            if (olds[i] != null) {
                System.out.printf("%s %d лет%n", olds[i].name, olds[i].age);
            }
        }
    }
}
