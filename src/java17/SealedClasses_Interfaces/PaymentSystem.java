package java17.SealedClasses_Interfaces;

public class PaymentSystem {

    public static void main(String[] args) {
        Payment creditCardPayment = new CreditCardPayment("TXN001", 150.0, "1234-5678-9876-5432");
        Payment payPalPayment = new PayPalPayment("TXN002", 200.0, "user@example.com");
        Payment upiPayment = new UpiPayment("TXN003", 75.0, "user@upi");

        creditCardPayment.processPayment();
        System.out.println();
        payPalPayment.processPayment();
        System.out.println();
        upiPayment.processPayment();
    }
}
