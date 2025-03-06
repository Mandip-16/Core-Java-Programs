package Stream;

public class Product {
    private String name;
    private double price;
    private boolean available;
    private boolean discounted;

    public Product(String name, double price, boolean available, boolean discounted) {
        this.name = name;
        this.price = price;
        this.available = available;
        this.discounted = discounted;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public boolean isDiscounted() {
        return discounted;
    }

    @Override
    public String toString() {
        return name + " - Rs." + price + (discounted ? " (Discounted)" : "");
    }
}
