package CollectionFramework.OnlineStore;


import java.util.*;

public class OnlineStore {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(101, "Laptop", 75000));
        productList.add(new Product(102, "Smartphone", 30000));
        productList.add(new Product(103, "Headphones", 2000));
        productList.add(new Product(104, "Keyboard", 1500));

        System.out.println("Product Catalog:");
        productList.forEach(System.out::println);

        System.out.println();
        searchProductById(productList,102);

        System.out.println();
        searchProductById(productList,110);

        // Set - Unique customer emails
        Set<String> customerEmails = new HashSet<>();
        customerEmails.add("john@example.com");
        customerEmails.add("alice@example.com");
        customerEmails.add("bob@example.com");
        customerEmails.add("john@example.com"); // Duplicate entry

        System.out.println("\nUnique Customer Emails:");
        customerEmails.forEach(System.out::println);

        // Map - Product stock
        Map<Integer, Integer> productStock = new HashMap<>();
        productStock.put(101, 10);
        productStock.put(102, 5);
        productStock.put(103, 20);
        productStock.put(104, 15);

        System.out.println("\nProduct Stock:");
        productStock.forEach((id, stock) -> {
            System.out.println("Product ID: " + id + " | Stock: " + stock);
        });

        // Queue - Order processing
        Queue<String> orderQueue = new LinkedList<>();
        orderQueue.add("Order#1 - Laptop");
        orderQueue.add("Order#2 - Smartphone");
        orderQueue.add("Order#3 - Headphones");

        System.out.println("\nProcessing Orders:");
        while (!orderQueue.isEmpty()) {
            System.out.println("Processing: " + orderQueue.poll());
        }

        Collections.sort(productList, Comparator.comparing(Product::getPrice));
        System.out.println("\nSorted Product Catalog (by Price):");
        productList.forEach(System.out::println);

        System.out.println("\nTotal number of unique customers: " + customerEmails.size());
    }

    private static void searchProductById(List<Product> products, int id) {
        products.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Product not found!")
                );
    }
}
