package homework.lesson8.task2;

import java.util.HashSet;
import java.util.Set;

public class Application {

    public static void main(String[] args) {
        for (int group = 10; group <= 30; group++) {
            int duplicates = 0;
            for (int i = 0; i < 100000; i++) {
                Set<Person> persons = new HashSet<>();
                for (int j = 0; j < group; j++) {
                    persons.add(new Person());
                }
                if (persons.size() != group) {
                    duplicates++;
                }
            }
            double duplicateChance = (100.0f * duplicates) / 100000;
            System.out.printf("%d: %.2f %%%n", group, duplicateChance);
        }
    }
}
