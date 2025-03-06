package Constructor.CopyConstructor;

public class CopyConstructor {

    public static void main(String[] args) {
        AuthorCopy original = new AuthorCopy("George Orwell", "UK");
        AuthorCopy copy = new AuthorCopy(original);
        System.out.println("Original Author: " + original.name + ", Country: " + original.country);
        System.out.println("Copied Author: " + copy.name + ", Country: " + copy.country);
    }
}
