package homework.lesson3.task2;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        Cat[] cats = new Cat[5];
        cats[0] = new Cat(2, 5, "Барсик");
        cats[1] = new Cat(3, 11, "Мурзик");
        cats[2] = new Cat(7, 2, "Матильда");
        cats[3] = new Cat(1, 3, "Леопольд");
        cats[4] = new Cat(11, 4, "Базилио");

        String[] catsName = new String[5];
        catsName[0] = cats[0].name;
        catsName[1] = cats[1].name;
        catsName[2] = cats[2].name;
        catsName[3] = cats[3].name;
        catsName[4] = cats[4].name;
        Arrays.sort(catsName);

        for (int i = 0; i < catsName.length; i++) {
            for (int j = 0; j < cats.length; j++) {
                if (cats[j].name.equals(catsName[i])) {
                    System.out.printf("Имя: %s, Возраст: %d, Вес: %d%n", cats[j].name, cats[j].age, cats[j].weight);
                }
            }
        }
    }
}
