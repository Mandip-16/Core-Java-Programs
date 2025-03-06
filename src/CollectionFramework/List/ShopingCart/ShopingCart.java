package CollectionFramework.List.ShopingCart;

import java.util.ArrayList;
import java.util.List;

public class ShopingCart {

    public static void showCart(List<Product> cart){
        if(cart.isEmpty()) {
            System.out.println("Crt is empty please add item");
        } else {
            for(Product product : cart) {
                System.out.println(product);
            }
        }
    }

    public static double calculateTotal(List<Product> cart) {
        double total = 0;
        for (Product product : cart) {
            total += product.price;
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Product("Laptop", 800.00));
        cart.add(new Product("Smartphone", 500.00));
        cart.add(new Product("Headphones", 150.00));

        List<Product> newcart = new ArrayList<>();
        newcart.add(new Product("Smartphone", 500.00));
        newcart.add(new Product("Tablet", 300.00));

        cart.addAll(newcart);

        System.out.println("After adding the newcart item in a cart");
        showCart(cart);

        System.out.println("getting a first item in a cart : " + cart.get(0));

        System.out.println("Updating the price of a smartphone in cart");
        cart.set(1,new Product("Smartphone",4000.00));

        System.out.println("is tablet in a cart? : " + cart.contains(new Product("Tablet",300.00)));

        System.out.println("Updated cart");
        showCart(cart);

        System.out.println("Total price of cart");
        calculateTotal(cart);

        System.out.println("Total items in a cart: " + cart.size());

        System.out.println("Clearing the cart");
        cart.clear();
        System.out.println("cart is empty or not : " + cart.isEmpty());

    }
}
