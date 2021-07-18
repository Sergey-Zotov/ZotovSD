package homework.lesson8.task4;

import java.util.HashSet;
import java.util.Set;

public class ValidatorStub {

    private static Set<Entity> entities = new HashSet<>();
    private static int countUUID = 1;

    public static void validateEntity(Entity entity) {
        System.out.println("Сущьность до валидации: " + entity);
        if (entities.contains(entity)) {
            for (Entity entity1 : entities) {
                if (entity1.equals(entity)) {
                    entity.setUuid(entity1.getUuid());
                    break;
                }
            }
        } else {
            entity.setUuid(Integer.toString(countUUID++));
            entities.add(entity);
        }
        System.out.println("Сущьность после валидации: " + entity);
    }
}
