package homework.lesson4.task4;

public class PassportBase {

    private static final Passport[] passportBase = new Passport[100];
    private static int index = 0;

    public static void addPassportBase(Passport passport) {
        passportBase[index++] = passport;
    }

    public static Boolean duplicatePassport(String series, String number) {
        for (int i = 0; i < passportBase.length; i++) {
            if (passportBase[i] == null) {
                break;
            }
            String currentSeries = passportBase[i].getSeries();
            String currentNumber = passportBase[i].getNumber();
            if (currentNumber == null || currentSeries == null) {
                continue;
            }
            if (passportBase[i].getSeries() == series && passportBase[i].getNumber() == number) {
                System.out.printf("Паспорт с такими данными %s %s уже существует%n", passportBase[i].getSeries(), passportBase[i].getNumber());
                return true;
            }
        }
        return false;
    }
}
