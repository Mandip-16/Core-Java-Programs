package Threading;

public class OrderProcessor extends Thread {
    private String orderName;

    public OrderProcessor(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        System.out.println(orderName + " is being processed by " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(orderName + " is ready for delivery!");
    }

    public static void main(String[] args) {
        OrderProcessor order1 = new OrderProcessor("Order #1");
        OrderProcessor order2 = new OrderProcessor("Order #2");
        OrderProcessor order3 = new OrderProcessor("Order #3");

        order1.start();
        order2.start();
        order3.start();
    }
}
