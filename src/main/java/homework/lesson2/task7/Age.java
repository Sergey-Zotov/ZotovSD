package homework.lesson2.task7;

public class Age {
    public static void main(String[] args) {

        ageCandidate(32);
        ageCandidate(52);
        ageCandidate(66);
        ageCandidate(82);
        ageCandidate(25);
        ageCandidate(44);
        ageCandidate(60);
        ageCandidate(75);
        ageCandidate(22);
        ageCandidate(119);

    }
    static void ageCandidate(int a){
        if (a >= 25 && a < 44){
            System.out.println("молодой возраст");
        }
        if (a >= 44 && a < 60){
            System.out.println("средний возраст");
        }
        if (a >= 60 && a < 75){
            System.out.println("пожилой возраст");
        }
        if (a >= 75 && a < 90){
            System.out.println("старческий возраст");
        }
        if (a < 25 || a > 90){
            System.out.println("неизвестный возраст");
        }
    }
}
