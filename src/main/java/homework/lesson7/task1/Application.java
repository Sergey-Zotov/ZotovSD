package homework.lesson7.task1;

public class Application {

    public static void main(String[] args) {

        MyArrayList<String> strings = new MyArrayList<>();

        strings.add("HodDog1");
        strings.add("HodDog2");
        strings.add("HodDog3");
        strings.add("HodDog4");
        strings.add(2, "NewHotdog3");
        strings.add(15, "NewHotdog16");
        strings.size();
        strings.contains("HodDog3");
        strings.contains("HodDog5");
        strings.get(0);
        strings.get(10);
    }
}
