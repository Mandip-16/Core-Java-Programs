package Threading;

public class EmailNotification implements Runnable{
    private String recipient;

    public EmailNotification(String recipient) {
        this.recipient = recipient;
    }

    public void run() {
        System.out.println("Sending email to: " + recipient);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Email sent to: " + recipient);
    }

    public static void main(String[] args) {
        Thread email1 = new Thread(new EmailNotification("user1@example.com"));
        Thread email2 = new Thread(new EmailNotification("user2@example.com"));

        email1.start();
        email2.start();
    }
}
