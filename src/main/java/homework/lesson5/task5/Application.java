package homework.lesson5.task5;

import homework.lesson5.task5.exceptions.*;

public class Application {

    public static void main(String[] args) {
        createPassport("1234", "567890");
        createPassport("", "");
        createPassport("12-34", "567890");
        createPassport("12-34", "567890");
        createPassport(null, "123456");
        createPassport("12-34", null);
        createPassport(null, null);

    }

    private static Passport createPassport(String series, String number) {
        try {
            return new Passport(series, number);
        } catch (PassportNumberNullPointerException | PassportSeriesNullPointerException |
                PassportNumberArgumentException | PassportSeriesArgumentException exception) {
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException exception) {
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}
