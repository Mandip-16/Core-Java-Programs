package java17.RecordDemo;

import java.util.List;

// Record for customer details
record Customer(String name, String address, String email) {}

// Record for order details
record Order(Customer customer, List<String> items, double totalAmount) {}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        // Create an order
        Customer customer = new Customer("John Doe", "123 Main St", "john@example.com");
        List<String> items = List.of("Pizza", "Pasta", "Garlic Bread");
        Order order = new Order(customer, items, 29.99);

        // Print order details
        System.out.println("Order Details:");
        System.out.println(order);

        // Access individual fields
        System.out.println("\nCustomer Name: " + order.customer().name());
        System.out.println("Total Amount: $" + order.totalAmount());
    }
}
