package homework.lesson8.task3;

public class TinkoffTerminal extends Terminal {

    private double minAmount;

    public TinkoffTerminal(String address) {
        super(address);
        company = Company.TINKOFF;
        tax = 9;
        noTaxLimit = 600;
        minAmount = 100;
    }

    @Override
    public void pay(String phone, double amount) {
        if (amount >= minAmount) {
            super.pay(phone, amount);
        } else {
            System.out.printf("Внесена не достаточная сумма для пополнения баланса. Минимальния сумма пополнения %.2f.%n", minAmount);
        }

    }
}
