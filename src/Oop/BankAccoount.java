package Oop;

public class BankAccoount {

    private int bankAccountNumber;
    private double balance;

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }

    public void displayInfo(){
        System.out.println("Bank Account Number: "+bankAccountNumber);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        BankAccoount ba = new BankAccoount();
        ba.setBankAccountNumber(123456);
        ba.setBalance(100000);
        ba.displayInfo();

        ba.setBalance(-100000);
        System.out.println(ba.getBalance());
    }
}
