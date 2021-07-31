public class LibTest {
    public static void main(String[] args) {
        Lib library = new Lib();
        Book[] books = { new Book("6423781", "James", "Coffee"),
                new Book("9784898645133", "Reinhard Schiedermeier", "Java Praktikum"),
                new Book("01303451517", "Harvey Deitel", "How to program Java"),
                new Book("0136290310", "Bertrand Meyer", "Object Oriented Software Construction"),
                new Book("9783642018558", "Bertrand Meyer",
                        "Software Engineering Approaches for Offshore and Outsourced Development"),
                new Book("9783897214484", "Kathy Sierra", "Java von Kopf bis Fuss") };
        for (Book b : books) {
            library.add(b);
        }
        //System.out.println(library);
        System.out.println(library.booksByAuthor("Bertrand Meyer"));
    }
}
