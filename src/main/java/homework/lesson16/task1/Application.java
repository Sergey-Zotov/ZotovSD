package homework.lesson16.task1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

    public static void main(String[] args) throws Exception {
        Airplane airplane = new Airplane();
        makeAppropriateSpeed(airplane);
        makeInspected(airplane);
        doFlight(airplane);
    }

    private static void makeAppropriateSpeed(Airplane airplane) throws NoSuchFieldException, IllegalAccessException {
        Class clazz = airplane.getClass();
        Field speedField = clazz.getDeclaredField("speed");
        speedField.setAccessible(true);
        speedField.set(airplane, 700);
    }

    private static void makeInspected(Airplane airplane) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = airplane.getClass();
        Method inspectMethod = clazz.getDeclaredMethod("inspect");
        inspectMethod.setAccessible(true);
        inspectMethod.invoke(airplane);
    }

    private static void doFlight(Airplane airplane) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class clazz = airplane.getClass();
        Method flyMethod = clazz.getDeclaredMethod("fly");
        flyMethod.setAccessible(true);
        flyMethod.invoke(airplane);
    }
}
