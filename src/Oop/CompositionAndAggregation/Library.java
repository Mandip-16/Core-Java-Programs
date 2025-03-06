package Oop.CompositionAndAggregation;

public class Library {
    Book[] books;

    Library(Book[] books) {
        this.books = books;
    }

    void displayLibrary() {
        if (books == null || books.length == 0) {
            System.out.println("Library is empty or uninitialized");
        } else {
            for (Book book : books) {
                if (book != null) {
                    book.displayBookInfo();
                } else {
                    System.out.println("Null book reference found");
                }
            }
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith");
        Book b2 = new Book("Advanced Java", "Jane Doe");

        Library library = new Library(new Book[]{b1, b2, null});
        library.displayLibrary();

        // Edge case: Uninitialized library
        Library emptyLibrary = new Library(null);
        emptyLibrary.displayLibrary();
    }
}
