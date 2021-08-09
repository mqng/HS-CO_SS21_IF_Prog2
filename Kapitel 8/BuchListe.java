import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BuchListe {
    public static void main(String[] args) {
        Buch[] buchs = { new Buch("Meyer", "7548932", "ABC"), new Buch("Meyer", "4356742534", "CDF"),
                new Buch("Bon", "352", "CDF8") };
        List<Buch> buchListe = Arrays.asList(buchs);

        System.out.println(buchListe.stream().filter(b -> b.getAutor().equals("Meyer")).collect(Collectors.toList()));

        buchListe.forEach(b -> {
            if (b.getAutor().equals("Meyer"))
                System.out.println(b);
        });
    }
}
