package java17.VarKeyword;

import java.util.ArrayList;

public class LibraryManagement {

    public static void main(String[] args) {
        var books = new ArrayList<Book>();

        books.add(new Book("Clean Code", "Robert C. Martin"));
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("The Pragmatic Programmer", "Andrew Hunt"));

        var searchAuthor = "Joshua Bloch";
        System.out.println("Books by " + searchAuthor + ":");

        for (var book : books) {
            if (book.author.equals(searchAuthor)) {
                book.displayInfo();
            }
        }
    }
}
