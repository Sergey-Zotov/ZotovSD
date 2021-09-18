package homework.lesson14.model;

public class Passport {
    private String series;
    private String number;
    private String issuer;
    private String issueDate;
    private String issuerCode;

    public Passport() {
    }

    public Passport(String series, String number, String issuer, String issueDate, String issuerCode) {
        this.series = series;
        this.number = number;
        this.issuer = issuer;
        this.issueDate = issueDate;
        this.issuerCode = issuerCode;
    }

    public String getSeries() {
        return series;
    }

    public Passport setSeries(String series) {
        this.series = series;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public Passport setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getIssuer() {
        return issuer;
    }

    public Passport setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public Passport setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    public String getIssuerCode() {
        return issuerCode;
    }

    public Passport setIssuerCode(String issuerCode) {
        this.issuerCode = issuerCode;
        return this;
    }
}
