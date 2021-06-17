package homework.lesson6.task1;

import homework.lesson6.task1.generator.AgeGenerator;
import homework.lesson6.task1.generator.NameGenerator;
import homework.lesson6.task1.generator.PhoneGenerator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            humans.add(new Human(NameGenerator.generator(), NameGenerator.generator(),
                    PhoneGenerator.generate(), AgeGenerator.generate()));
        }

        for (Human human : humans) {
            if (human.getAge() == 35) {
                System.out.printf("%s %s, возраст %d, тел. %s%n", human.getLastName(),
                        human.getFirstName(), human.getAge(), human.getPhoneNumber());
            }
        }
    }
}
