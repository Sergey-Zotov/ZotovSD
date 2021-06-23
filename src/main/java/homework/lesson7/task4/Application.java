package homework.lesson7.task4;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        BaseCredit annuity = new AnnuityCredit(300000, 16.9d, 12);
        BaseCredit base = new BaseCredit(300000, 16.9d, 12);
        BaseCredit def = new DifferentiateCredit(300000, 16.9d, 12);

        List<Double> annuityPayment = annuity.getMonthPayments();
        List<Double> basePayment = base.getMonthPayments();
        List<Double> defPayment = def.getMonthPayments();

        for (int i = 0; i < annuityPayment.size(); i++) {
            System.out.printf("%d %.2f %.2f %.2f%n", i + 1, basePayment.get(i),
                    defPayment.get(i), annuityPayment.get(i));
        }


        System.out.printf("Переплата: %.2f %.2f %.2f", base.calculateOverpayment(),
                def.calculateOverpayment(), annuity.calculateOverpayment());
    }
}
