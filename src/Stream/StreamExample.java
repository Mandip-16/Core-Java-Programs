package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 60000, true, false));
        products.add(new Product("Smartphone", 30000, true, true));
        products.add(new Product("Tablet", 20000, false, false)); // Unavailable product
        products.add(new Product("Smartwatch", 10000, true, false));
        products.add(new Product("Headphones", 5000, true, true));

        // Filter available products
        List<Product> availableProducts = products.stream()
                .filter(Product::isAvailable)
                .collect(Collectors.toList());

        System.out.println("Available Products:");
        availableProducts.forEach(System.out::println);

        // Sort products by price
        List<Product> sortedProducts = availableProducts.stream()
                .sorted((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()))
                .collect(Collectors.toList());

        System.out.println("\nSorted Products by Price:");
        sortedProducts.forEach(System.out::println);

        // Map product names
        List<String> productNames = sortedProducts.stream()
                .map(Product::getName)
                .collect(Collectors.toList());

        System.out.println("\nProduct Names for Email:");
        productNames.forEach(System.out::println);

        // Calculate total price
        double totalPrice = sortedProducts.stream()
                .mapToDouble(Product::getPrice)
                .sum();

        System.out.println("\nTotal Price: Rs." + totalPrice);

        // Check if any product is discounted
        boolean hasDiscount = sortedProducts.stream()
                .anyMatch(Product::isDiscounted);

        System.out.println("\nAre there any discounted products? " + (hasDiscount ? "Yes" : "No"));

        // Find the cheapest product (Optional)
        Optional<Product> cheapestProduct = sortedProducts.stream()
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));

        cheapestProduct.ifPresent(product ->
                System.out.println("\nCheapest Product: " + product)
        );
    }
}