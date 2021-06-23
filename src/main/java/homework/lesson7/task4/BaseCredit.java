package homework.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class BaseCredit {
    protected double amount;  // сумма
    protected double rate;    // %
    protected int duration;   // срок

    BaseCredit(double amount, double rate, int duration) {
        this.amount = amount;
        this.rate = rate;
        this.duration = duration;
    }

    public List<Double> getMonthPayments() {
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            result.add(amount / duration);
        }
        return result;
    }

    public Double calculateOverpayment() {
        Double result = 0d;
        for (Double payment : getMonthPayments()) {
            result += payment;
        }
        result = result - this.amount;
        return result;
    }
}
