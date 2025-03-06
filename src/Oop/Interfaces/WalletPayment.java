package Oop.Interfaces;


// Multiple inheritance
public class WalletPayment implements Payment, Refundable {
    @Override
    public void makePayment(double amount) {
        System.out.println("Wallet payment of " + amount);
    }

    @Override
    public void cancelPayment() {
        System.out.println("Wallet Payment canceled");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of: $" + amount);
    }
}
