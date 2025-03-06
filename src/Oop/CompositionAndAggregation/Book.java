package Oop.CompositionAndAggregation;

public class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBookInfo() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}
