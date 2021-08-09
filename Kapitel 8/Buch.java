public class Buch {
    private final String autor;
    private final String isbn;
    private final String titel;

    public Buch(String autor, String isbn, String titel) {
        this.autor = autor;
        this.isbn = isbn;
        this.titel = titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitel() {
        return titel;
    }

    public String toString(){
        return autor + " " + isbn + " " + titel;
    }
}
