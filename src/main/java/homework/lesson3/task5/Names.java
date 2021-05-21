package homework.lesson3.task5;

import java.util.Random;

public class Names {
    static final String[] humanName = {"Олег", "Даша", "Мария", "Ваня", "Игорь", "Денис", "Антон", "Костя"};
    static final String[] catName = {"Барсик", "Мурка", "Макс", "Филя", "Соня", "Зюзя", "Жак", "Дюма"};
    static final String[] dogName = {"Рекс", "Кондл", "Бес", "Барон", "Фараон", "Топтыга", "Стрела", "Белка"};

    static String randomHumanName() {
        return humanName[new Random().nextInt(humanName.length)];
    }

    static String randomCatName() {
        return catName[new Random().nextInt(catName.length)];
    }

    static String randomDogName() {
        return dogName[new Random().nextInt(dogName.length)];
    }
}
