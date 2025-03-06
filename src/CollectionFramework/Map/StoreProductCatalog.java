package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class StoreProductCatalog {

    public static void main(String[] args) {
        Map<String,Double> products = new HashMap<>();

        products.put("Laptop", 1200.00);
        products.put("Smartphone", 800.00);
        products.put("Headphones", 150.00);
        products.put("Tablet", 300.00);

        showProducts(products);

        Map<String,Double> newproducts = new HashMap<>();
        products.put("Smart TV", 1000.00);
        products.put("AC", 8000.00);

        products.putAll(newproducts);

        System.out.println("Add some other products. Updated catalog is : ");
        showProducts(products);

        System.out.println("Smart TV is Available : " + products.containsKey("Smart TV"));
        System.out.println("camera is Available : " + products.containsKey("camera"));

        System.out.println("Remove a AC from catalog : ");
        products.remove("AC");

        System.out.println("Show Updated catalog");
        showProducts(products);

        System.out.println("Total number of products : " + products.size());
    }

    public static void showProducts(Map<String,Double> products) {
        if (products.isEmpty()) {
            System.out.println("Your Catalog is empty please add products");
        } else {
            for (Map.Entry<String,Double> entry : products.entrySet()) {
                System.out.println(entry.getKey() + " : Rs." + entry.getValue());
            }
        }
    }
}
