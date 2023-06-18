public class Main {
    public static void main(String[] args) {

        //int creditAmount сумма кредита
        //double percent процентная ставка
        //int month количество месяцев на которые взят кредит

        CreditPaymentService service = new CreditPaymentService();

        int monthPayment = (int) service.calculate(1_000_000, 9.99, 12);
        System.out.println("Кредит на 1 год, ежемесячный платёж: " + monthPayment);

        System.out.println();
        monthPayment = (int) service.calculate(1_000_000, 9.99, 24);
        System.out.println("Кредит на 2 года, ежемесячный платёж: " + monthPayment);

        System.out.println();
        monthPayment = (int) service.calculate(1_000_000, 9.99, 36);
        System.out.println("Кредит на 3 года, ежемесячный платёж: " + monthPayment);

    }
}