package AccessModifiers;

class Book {
    public String title;
    protected String author;
    int yearPublished;
    private String id;

    public Book(String title, String author, int yearPublished, String id) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Id: " + getId());
    }
}

