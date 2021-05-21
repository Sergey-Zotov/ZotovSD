package homework.lesson3.task5;

public class Application {
    public static void main(String[] args) {
        Human[] humans = new Human[20];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human();
        }

        for (Human otherHuman : humans) {
            for (Human twoHuman : humans) {
                if (otherHuman != twoHuman && otherHuman.dogs.length == twoHuman.dogs.length && otherHuman.cats.length == twoHuman.cats.length) {
                    System.out.printf("%s содержит %d кошки и %d сабаки%n", twoHuman.name, twoHuman.cats.length, twoHuman.dogs.length);
                }
            }
        }
    }
}
