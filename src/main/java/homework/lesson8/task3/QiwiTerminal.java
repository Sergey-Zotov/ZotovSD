package homework.lesson8.task3;

public class QiwiTerminal extends Terminal {
    public QiwiTerminal(String address) {
        super(address);
        company = Company.QIWI;
        tax = 7;
        noTaxLimit = 1000;
    }
}
