package homework.lesson4.task4;

public class Application {
    public static void main(String[] args) {

        Passport correct = new Passport().setSeries("1111").setNumber("256321");
        Passport repeat = new Passport().setSeries("1111").setNumber("256321");
        Passport inCorrect1 = new Passport().setSeries("11471").setNumber("2564753321");
        Passport inCorrect3 = new Passport().setSeries("111").setNumber("2521");
        Passport inCorrect4 = new Passport().setSeries("").setNumber("");

        Passport nullPassport = new Passport();
        System.out.printf("NullPassport: %s %s%n", nullPassport.getSeries(), nullPassport.getNumber());

        Passport onlySeriesPassport = new Passport().setSeries("5412");
        Passport onlyNumberPassport = new Passport().setNumber("456321");

        Human human = new Human().setAge(25).setFirstName("Иванов").setLastName("Андрей").setPassport(correct);

        human.setPassport(onlyNumberPassport).setPassport(onlySeriesPassport);


    }
}
