package homework.lesson14.model;

public class Card {
    private String type;
    private String cardNumber;
    private String endDateMonth;
    private String endDateYear;
    private String code;
    private String accountNumber;

    public Card() {
    }

    public Card(String type, String cardNumber, String endDateMonth, String endDateYear, String code, String accountNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
        this.endDateMonth = endDateMonth;
        this.endDateYear = endDateYear;
        this.code = code;
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public Card setType(String type) {
        this.type = type;
        return this;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Card setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }

    public String getEndDateMonth() {
        return endDateMonth;
    }

    public Card setEndDateMonth(String endDateMonth) {
        this.endDateMonth = endDateMonth;
        return this;
    }

    public String getEndDateYear() {
        return endDateYear;
    }

    public Card setEndDateYear(String endDateYear) {
        this.endDateYear = endDateYear;
        return this;
    }

    public String getCode() {
        return code;
    }

    public Card setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Card setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
}
