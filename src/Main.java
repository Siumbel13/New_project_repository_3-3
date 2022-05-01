public class Main {

    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        double monthlyPayment1 = creditPaymentService.monthlyPayment(1_000_000, 1);
        long payment1 = (long)monthlyPayment1;
        System.out.println("Ежемесячный платеж : " + payment1 + "руб");

        double monthlyPayment2 = creditPaymentService.monthlyPayment(1_000_000,2);
        long payment2 = (long)monthlyPayment2;
        System.out.println("Ежемесячный платеж : " + payment2 + "руб");

        double monthlyPayment3 = creditPaymentService.monthlyPayment(1_000_000,3);
        long payment3 = (long)monthlyPayment3;
        System.out.println("Ежемесячный платеж : " + payment3 + "руб");

    }

}
