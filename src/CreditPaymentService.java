public class CreditPaymentService {

    //monthPercent процентная ставка в месяц
    //k Коэффициент аннуитета
    public double calculate(int creditAmount, double percent, int month) {
        double monthPercent = percent / 12 / 100;
        double x = 1 +  monthPercent;
        double y = Math.pow(x, month);
        double k = monthPercent * y / (y - 1);
        double monthPayment = creditAmount * k;

        return monthPayment;
    }
}
