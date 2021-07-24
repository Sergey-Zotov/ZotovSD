package homework.lesson9.task2;

public class Action {

    public static void action(Object o) {
        if (o instanceof Drawable) {
            Drawable drawable = (Drawable) o;
            drawable.draw();
        }
        if (o instanceof Movable) {
            Movable movable = (Movable) o;
            movable.move();
        }
    }
}
