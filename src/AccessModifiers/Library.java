package AccessModifiers;

public class Library {
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "John Doe", 2022, "978-1234567890");

        System.out.println("Book Title (public): " + book.title);

        System.out.println("Author (protected): " + book.author);

        System.out.println("Year Published (default): " + book.yearPublished);

        System.out.println("Id : " + book.getId());

        System.out.println("\nDisplaying Full Book Info:");
        book.displayBookInfo();
    }
}

