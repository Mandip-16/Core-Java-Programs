package Oop.Interfaces;

public class PayPalPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paypal payment of " + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("PayPalPayment cancelled");
    }
}
