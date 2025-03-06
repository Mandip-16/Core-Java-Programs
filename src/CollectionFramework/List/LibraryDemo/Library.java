package CollectionFramework.List.LibraryDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Step 1: Add books to the library
        books.add(new Book("The Alchemist", "Paulo Coelho", 350.00));
        books.add(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 400.00));
        books.add(new Book("Atomic Habits", "James Clear", 500.00));
        books.add(new Book("Java Programming", "Herbert Schildt", 600.00));

        System.out.println("Library Catalog:");
        displayBooks(books);

        // Search for a book by title
        String searchTitle = "Atomic Habits";
        boolean found = books.stream().anyMatch(book -> book.getTitle().equalsIgnoreCase(searchTitle));
        System.out.println("\nIs '" + searchTitle + "' available? " + found);

        // Sort books by price
        Collections.sort(books, Comparator.comparingDouble(Book::getPrice));
        System.out.println("\nBooks sorted by price:");
        displayBooks(books);

        // Remove a book
        books.removeIf(book -> book.getTitle().equalsIgnoreCase("Java Programming"));
        System.out.println("\nAfter removing 'Java Programming':");
        displayBooks(books);

        // Count total books
        System.out.println("\nTotal books in library: " + books.size());
    }

    public static void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Library is empty!");
        } else {
            books.forEach(System.out::println);
        }
    }
}
