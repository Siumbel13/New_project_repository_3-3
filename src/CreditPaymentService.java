public class CreditPaymentService {

    public void monthlyPayment(int amount, int years) {
        int month = years * 12; // количесвто
        double monthlyPercent = 9.99 / (100 * 12); // месячная процентная ставка
        double monthlyPayment = amount * monthlyPercent / (1 - Math.pow((1 + monthlyPercent), ((-1) * month)));

       System.out.println("Ежемесячный платеж: " + monthlyPayment);
    }

}
