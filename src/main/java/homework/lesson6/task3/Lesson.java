package homework.lesson6.task3;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public enum Lesson {
    MATHEMATICS("Математика"),
    PHYSICS("Физика"),
    PROGRAMMING("Програмирование"),
    HISTORY("История"),
    BIOLOGY("Биология"),
    GEOGRAPHY("География");

    private String lessonName;

    Lesson(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonName() {
        return lessonName;
    }

    public static List<Lesson> generate() {
        List<Lesson> result = new LinkedList<>();
        int length = new Random().nextInt(3) + 4;
        for (int i = 0; i < length; i++) {
            result.add(values()[new Random().nextInt(values().length)]);
        }
        return result;
    }
}
