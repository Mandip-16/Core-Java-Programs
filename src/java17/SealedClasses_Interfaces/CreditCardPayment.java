package java17.SealedClasses_Interfaces;

final class CreditCardPayment extends Transaction implements Payment {
    String cardNumber;

    public CreditCardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        showTransactionDetails();
        System.out.println("Processing credit card payment with card: " + cardNumber);
    }
}
