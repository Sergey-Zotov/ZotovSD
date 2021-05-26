package homework.lesson4.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        Human human = new Human();
        human.setLastName("Крекшин");
        human.setLastName("Ку");
        human.setLastName("абрамов");
        human.setLastName("Куница5");
        human.setLastName("Sidorof");
        human.setLastName("");

        human.setFirstName("Павел");
        human.setFirstName("Ра");
        human.setFirstName("николай");
        human.setFirstName("Сава1");
        human.setFirstName("Dasha");
        human.setFirstName("");

        human.setBirthDate(LocalDate.of(1989, 9, 18));
        human.setBirthDate(LocalDate.of(2025, 5, 27));

        System.out.printf("Меня завут %s %s я родился %s%n", human.getLastName(), human.getFirstName(), human.getBirthDate().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}
