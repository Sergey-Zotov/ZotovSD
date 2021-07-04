package homework.lesson8.task3;

public class EleksnetTerminal extends Terminal {
    public EleksnetTerminal(String address) {
        super(address);
        company = Company.ELEKSNET;
        tax = 11;
        noTaxLimit = 300;
    }
}
