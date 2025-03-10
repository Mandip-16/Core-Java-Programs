package java17.SealedClasses_Interfaces;

final class UpiPayment extends Transaction implements Payment {
    String upiId;

    public UpiPayment(String transactionId, double amount, String upiId) {
        super(transactionId, amount);
        this.upiId = upiId;
    }

    @Override
    public void processPayment() {
        showTransactionDetails();
        System.out.println("Processing UPI payment for ID: " + upiId);
    }
}
