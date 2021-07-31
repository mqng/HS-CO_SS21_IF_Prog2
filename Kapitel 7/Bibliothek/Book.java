public class Book {
    private final String author;
    private final String isbn;
    private final String titel;

    public Book(String isbn, String author, String titel) {
        this.isbn = isbn;
        this.author = author;
        this.titel = titel;
    }
    public int compareTo(Book b) {
        return this.compareTo(b);
    }
    public String get_isbn() {
        return this.isbn;
    }
    public String get_author() {
        return this.author;
    }
    public String get_titel() {
        return this.titel;
    }

    public String toString() {
        return "\nISBN: " + isbn + " Author: " + author + " Titel: " + titel;
    }
}
