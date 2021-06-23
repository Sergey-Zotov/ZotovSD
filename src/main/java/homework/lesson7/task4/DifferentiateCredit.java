package homework.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class DifferentiateCredit extends BaseCredit {

    public DifferentiateCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        List<Double> result = new ArrayList<>();
        double remainder = amount;
        for (int i = 0; i < duration; i++) {
            double percentPayment = remainder * rate / 100 / 12;
            double payment = amount / duration + percentPayment;
            remainder = remainder - payment + percentPayment;
            result.add(payment);
        }
        return result;
    }
}
