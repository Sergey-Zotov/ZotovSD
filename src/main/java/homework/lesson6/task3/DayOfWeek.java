package homework.lesson6.task3;

public enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота");

    private String dayOfWeekName;

    DayOfWeek(String dayOfWeekName){
        this.dayOfWeekName = dayOfWeekName;
    }

    public String getDayOfWeekName(){
        return dayOfWeekName;
    }
}
