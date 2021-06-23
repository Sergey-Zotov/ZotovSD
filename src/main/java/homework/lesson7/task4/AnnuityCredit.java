package homework.lesson7.task4;

import java.util.ArrayList;
import java.util.List;

public class AnnuityCredit extends BaseCredit {

    public AnnuityCredit(double amount, double rate, int duration){
    super(amount, rate, duration);
    }

    @Override
    public List<Double> getMonthPayments() {
        Double p = rate / 100 / 12;
        Double payment = amount * (p + (p / (Math.pow((1 + p), duration) - 1)));
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < duration; i++) {
            result.add(payment);
        }
        return result;
    }
}
