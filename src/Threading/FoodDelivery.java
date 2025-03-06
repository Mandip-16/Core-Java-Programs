package Threading;

public class FoodDelivery {

    public static void main(String[] args) throws InterruptedException {
        Thread order = new Thread(() -> {
            System.out.println("Order PLACED");
            try {
                Thread.sleep(3000);
                System.out.println("Order PREPARING");
                Thread.sleep(2000);
                System.out.println("Order OUT FOR DELIVERY");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Order state: " + order.getState());
        order.start();
        Thread.sleep(1000);
        System.out.println("Order state: " + order.getState());
        order.join();
        System.out.println("Order state: " + order.getState());
    }
}
