package homework.lesson3.task5;

import java.util.Random;

public class Names {
    private static final String[] HUMAN_NAMES = {"Олег", "Даша", "Мария", "Ваня", "Игорь", "Денис", "Антон", "Костя"};
    private static final String[] CAT_NAMES = {"Барсик", "Мурка", "Макс", "Филя", "Соня", "Зюзя", "Жак", "Дюма"};
    private static final String[] DOG_NAMES = {"Рекс", "Кондл", "Бес", "Барон", "Фараон", "Топтыга", "Стрела", "Белка"};

    static String randomHumanName() {
        return HUMAN_NAMES[new Random().nextInt(HUMAN_NAMES.length)];
    }

    static String randomCatName() {
        return CAT_NAMES[new Random().nextInt(CAT_NAMES.length)];
    }

    static String randomDogName() {
        return DOG_NAMES[new Random().nextInt(DOG_NAMES.length)];
    }
}
