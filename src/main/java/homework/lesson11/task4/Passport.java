package homework.lesson11.task4;

import java.util.Objects;

public class Passport {

    private String series;
    private String number;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return getSeries().equals(passport.getSeries()) &&
                getNumber().equals(passport.getNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSeries(), getNumber());
    }
}
