package Constructor.DefaultConstructor;

import Constructor.DefaultConstructor.Author;

public class DefaultConstructor {

    public static void main(String[] args) {
        Author author = new Author();
        System.out.println("Author: " + author.name + ", Country: " + author.country);
    }
}
