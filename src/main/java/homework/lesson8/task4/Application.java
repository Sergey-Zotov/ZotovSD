package homework.lesson8.task4;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Entity> entities = new ArrayList<>();
        entities.add(new Client("ООО ОЗОН", "г. Москва, ул. Петрозаводская 31"));
        entities.add(new Client("ОАО Перекресток", "г. Москва, ул. Петрозаводская 30"));
        entities.add(new Client("ОАО Дикси", "г. Москва, ул. Петрозаводская 32"));
        entities.add(new Client("ООО Пегас", "г. Москва, ул. Петрозаводская 33"));
        entities.add(new User("Василий", "Повар"));
        entities.add(new User("Петр", "Учитель"));
        entities.add(new User("Антон", "Механик"));
        entities.add(new User("Игорь", "Артист"));
        entities.add(new Branch("Центральный офис1", "г. Москва"));
        entities.add(new Branch("Центральный офис2", "г. Москва"));
        entities.add(new Branch("Центральный офис1", "г. Москва"));
        entities.add(new Branch("Центральный офис3", "г. Москва"));
        entities.add(new Account("Расчетный счет ФЛ", "401548542524544569"));
        entities.add(new Account("Расчетный счет ФЛ", "401548542524544569"));
        entities.add(new Account("Расчетный счет ФЛ", "401548542524543256"));
        entities.add(new Account("Расчетный счет ФЛ", "401548542524541403"));

        for (Entity entity : entities) {
            entity.validate();
        }
    }
}
