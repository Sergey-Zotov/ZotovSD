package homework.lesson13.task2;

public class Modifiers {

    public static final Modifier<Boolean> invert = value -> !value;
    public static final Modifier<Integer> absolute = Math::abs;
    public static final Modifier<String> revers = value -> new StringBuilder(value).reverse().toString();
}
