package homework.lesson13.task3;

@FunctionalInterface
public interface Func<K, V> {

    V execute(K value);
}
