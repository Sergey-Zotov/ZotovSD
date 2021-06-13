package homework.lesson5.task4;

public class Application {

    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        int index = 0;

        while (index < cats.length) {
            try {
                cats[index] = new Cat(Cat.getRandomCatName(), Cat.getRandomCatAge());
            } catch (AgeTooHighException exceptions) {
                cats[index] = null;
                System.out.println("Слишком большой возраст для кота");
            } finally {
                index++;
            }
        }

        for (Cat cat : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
            } catch (NullPointerException exception) {
                System.out.println("Ошибка вывода данных");
            }
        }

    }
}
