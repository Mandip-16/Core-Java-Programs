package Constructor.CopyConstructor;

class AuthorCopy {
    String name;
    String country;

    public AuthorCopy(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public AuthorCopy(AuthorCopy author) {
        this.name = author.name;
        this.country = author.country;
    }
}