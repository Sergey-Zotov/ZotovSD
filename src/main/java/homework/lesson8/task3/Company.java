package homework.lesson8.task3;

public enum Company {
    QIWI("ООО \"Киви\""),
    ELEKSNET("ООО \"Элекснет\""),
    TINKOFF("АО \"Тиньков\"");

    private String name;

    Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
