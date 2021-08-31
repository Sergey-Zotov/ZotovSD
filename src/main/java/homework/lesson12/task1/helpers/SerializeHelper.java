package homework.lesson12.task1.helpers;

import homework.lesson12.task1.model.Generatable;

public interface SerializeHelper<T extends Generatable> {

    T deserialize(String data, Class<T> clazz);

    String serialize(T object);

}
