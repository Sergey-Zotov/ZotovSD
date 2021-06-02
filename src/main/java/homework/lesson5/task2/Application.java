package homework.lesson5.task2;

public class Application {

    public static void main(String[] args) {

        Cat cat0 = new Cat("Vaska", 5);
        Cat cat1 = new Cat("Barsik", 12);
        Cat cat2 = new Cat("Murka", 1);
        Cat cat3 = new Cat("Max", 21);

        Cat[] cats = {cat0, cat1, null, cat2, cat3};

        for (int i = 0; i < cats.length; i++) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cats[i].getName(), cats[i].getAge());
            } catch (NullPointerException exception) {
                System.out.println("Ошибка: ссылка на null, процес остановлен.");
                break;
            }
        }
    }
}
