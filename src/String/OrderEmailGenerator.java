package String;

public class OrderEmailGenerator {
    public static void main(String[] args) {
        // Step 1: Create a StringBuilder object for the email template
        StringBuilder email = new StringBuilder();

        // Step 2: Append basic email structure
        email.append("Dear Customer,\n\n");
        email.append("Thank you for shopping with us! Your order details are below:\n\n");

        // Step 3: Append order details dynamically
        email.append("Order Number: #ORD12345\n");
        email.append("Product Name: Wireless Headphones\n");
        email.append("Quantity: 2\n");
        email.append("Total Price: Rs. 3,999\n");

        // Step 4: Insert estimated delivery date
        email.insert(email.indexOf("Total Price"), "Estimated Delivery: 10th March 2025\n");

        // Step 5: Replace the placeholder "Customer" with the actual name
        int startIndex = email.indexOf("Dear Customer");
        email.replace(startIndex + 5, startIndex + 13, "John Doe");

        // Step 6: Convert the entire email content to uppercase (just for testing)
        System.out.println("Email in UPPERCASE:");
        System.out.println(email.toString().toUpperCase());

        // Step 7: Convert it back to normal
        System.out.println("\nFinal Email:");
        System.out.println(email.toString());

        // Step 8: Delete unnecessary details (Removing Quantity if it's a single item)
        if (email.indexOf("Quantity: 1") != -1) {
            int quantityIndex = email.indexOf("Quantity:");
            email.delete(quantityIndex, quantityIndex + 12); // Deletes "Quantity: 1\n"
        }

        // Step 9: Reverse email content (Not useful here, but demonstrating)
        System.out.println("\nReversed Email (for demo purpose):");
        System.out.println(email.reverse());

        // Step 10: Clearing the email to generate another one
        email.setLength(0);
        System.out.println("\nAfter Clearing Email: '" + email + "'");
    }
}

