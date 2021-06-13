package homework.lesson5.task5;

import homework.lesson5.task5.exceptions.*;

import java.util.LinkedList;
import java.util.List;

public class Passport {
    private String series;
    private String number;
    private static List<Passport> passports = new LinkedList<>();

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public Passport(String series, String number) throws PassportAlreadyExistsException, PassportIllegalArgumentException, PassportNullPointerException {
        if (series == null) {
            throw new PassportSeriesNullPointerException();
        }
        if (number == null) {
            throw new PassportNumberNullPointerException();
        }
        if (!series.matches("^(\\d{2})-(\\d{2})$")) {
            throw new PassportSeriesArgumentException();
        }
        if (!number.matches("^\\d{6}$")) {
            throw new PassportNumberArgumentException();
        }
        for (Passport passport : passports) {
            if (passport.getSeries().equals(series) && passport.getNumber().equals(number)) {
                throw new PassportAlreadyExistsException();
            }
        }
        passports.add(this);
        this.series = series;
        this.number = number;
        System.out.printf("Паспорт с серией %s и номером %s успешно создан%n", series, number);
    }
}
