package Oop.Interfaces;

public class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Credit card payment of " + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("CreditCardPayment cancelled");
    }
}
