package java17.SealedClasses_Interfaces;

sealed interface Payment permits  CreditCardPayment, PayPalPayment, UpiPayment {

    void processPayment();
}
