package homework.lesson8.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            persons.add(new Person());
        }

        Set<Person> repeatPersons = new HashSet<>();
        for (int i = 0; i < persons.size(); i++) {
            for (int j = i + 1; j < persons.size(); j++) {
                Person person1 = persons.get(i);
                Person person2 = persons.get(j);
                if (person1.equals(person2)) {
                    repeatPersons.add(person1);
                }
            }
        }
        System.out.println(repeatPersons);

        Set<Person> uniquePersons = new HashSet<>();
        for (int i = 0; i < 2000; i++) {
            uniquePersons.add(new Person());
        }
        System.out.println(uniquePersons.size());
    }
}
