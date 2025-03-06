package java17.SealedClasses_Interfaces;

non-sealed class PayPalPayment extends Transaction implements Payment {
    String email;

    public PayPalPayment(String transactionId, double amount, String email) {
        super(transactionId, amount);
        this.email = email;
    }

    @Override
    public void processPayment() {
        showTransactionDetails();
        System.out.println("Processing PayPal payment for email: " + email);
    }
}
