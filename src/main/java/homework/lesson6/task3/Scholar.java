package homework.lesson6.task3;

import java.util.List;
import java.util.Map;

public class Scholar {
    private Map<DayOfWeek, List<Lesson>> diary;

    public Map<DayOfWeek, List<Lesson>> getDiary() {
        return diary;
    }

    public void setDiary(Map<DayOfWeek, List<Lesson>> diary) {
        this.diary = diary;
    }
}
