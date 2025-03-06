package java17.SealedClasses_Interfaces;

sealed class Transaction permits CreditCardPayment, PayPalPayment, UpiPayment {

    String transactionId;
    double amount;

    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void showTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
    }
}
