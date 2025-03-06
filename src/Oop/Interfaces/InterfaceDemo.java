package Oop.Interfaces;

public class InterfaceDemo {

    public static void main(String[] args) {
        Payment payment;

        // Normal case
        payment = new CreditCardPayment();
        payment.makePayment(100);
        payment.cancelPayment();

        payment = new PayPalPayment();
        payment.makePayment(50);
        payment.cancelPayment();

        // Edge case: Null reference
        payment = null;
        if (payment != null) {
            payment.makePayment(200);
        } else {
            System.out.println("Payment object is null");
        }
    }
}
