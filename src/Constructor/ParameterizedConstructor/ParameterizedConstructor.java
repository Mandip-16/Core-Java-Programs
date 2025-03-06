package Constructor.ParameterizedConstructor;

public class ParameterizedConstructor {

    public static void main(String[] args) {
        Book book = new Book("Java Programming", 29.99);
        System.out.println("Book: " + book.title + ", Price: $" + book.price);
    }
}
