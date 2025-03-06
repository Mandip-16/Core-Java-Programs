package Threading;

public class BankAccount {

    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            account.deposit(500);
            account.withdraw(200);
        });

        Thread t2 = new Thread(() -> {
            account.withdraw(800);
            account.deposit(300);
        });

        t1.start();
        t2.start();
    }
}
