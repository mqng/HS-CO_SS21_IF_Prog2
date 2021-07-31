import java.util.*;

public class Lib {
    private Collection<Book> books;

    public Lib() {
        books = new LinkedList<Book>();
    }

    public boolean add(Book b) {
        return books.add(b);
    }

    public Collection<Book> searchByAuthor(String author) {
        ArrayList<Book> temp = new ArrayList<>();
        for(Book b : books) {
            if (b.get_author().equals(author))
                temp.add(b);
        }
        return temp;
    }

    public Map<String,Collection<String>> booksByAuthor(String author) {
        Map<String,Collection<String>> map = new TreeMap<>();
        LinkedList<String> ll = new LinkedList<>();
        for(Book b : books) {
            if (b.get_author().equals(author)) {
                ll.add(b.get_titel());
            }
            map.put(author, ll);
        }
        return map;
    }

    public Book searchByIsbn(String isbn) {
        for(Book b : books) {
            if(b.get_isbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public Collection<Book> sortBooks(Comparator<Book> comp) {
        ArrayList<Book> temp = new ArrayList<Book>();
        Collections.sort(temp,comp);
        return temp;
    }
    public String toString() {
        return books.toString();
    }
}
