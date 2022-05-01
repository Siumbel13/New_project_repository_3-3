public class CreditPaymentService {

    public double monthlyPayment(double amount, double years) {
        double month = years * 12; // количесвто
        double monthlyPercent = 9.99 / (100 * 12); // месячная процентная ставка
        double monthlyPayment = amount * monthlyPercent / (1 - Math.pow((1 + monthlyPercent), ((-1) * month)));

        return monthlyPayment;
    }

}
