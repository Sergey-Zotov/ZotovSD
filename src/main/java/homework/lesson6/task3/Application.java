package homework.lesson6.task3;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scholar scholar = new Scholar();

        Map<DayOfWeek, List<Lesson>> diary = new TreeMap<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            diary.put(day, Lesson.generate());
        }
        scholar.setDiary(diary);

        Set<Map.Entry<DayOfWeek, List<Lesson>>> entrySet = scholar.getDiary().entrySet();
        for (Map.Entry<DayOfWeek, List<Lesson>> dayEntry : entrySet) {
            String day = dayEntry.getKey().getDayOfWeekName();
            String text = day + ": ";
            for (Lesson lessons : dayEntry.getValue()) {
                String lesson = lessons.getLessonName();
                text += lesson + ", ";
            }
            System.out.println(text.substring(0, text.length() - 2));
        }
        Map<Lesson, Integer> lessonCounters = new HashMap<>();
        for (Lesson lesson : Lesson.values()) {
            lessonCounters.put(lesson, 0);
        }
        for (List<Lesson> lessons : scholar.getDiary().values()) {
            for (Lesson lesson : lessons) {
                lessonCounters.put(lesson, lessonCounters.get(lesson) + 1);
            }
        }

        int maxLessonAmount = Collections.max(lessonCounters.values());
        int minLessonAmount = Collections.min(lessonCounters.values());
        for (int i = maxLessonAmount; i >= minLessonAmount; i--) {
            for (Map.Entry<Lesson, Integer> entry : lessonCounters.entrySet()) {
                if (entry.getValue() == i)
                    System.out.printf("%s: %d%n", entry.getKey().getLessonName(), entry.getValue());
            }
        }


    }
}
