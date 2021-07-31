public class WordCollTest {
    public static void main(String[] args) {
        String[] chapter0 = {
                "Thomas Mann, der jüngere Bruder von Heinrich Mann (1871–1950), war Sohn des Kaufmanns und Lübecker Senators Thomas Johann Heinrich Mann.",
                "Seine Mutter Julia (geborene da Silva-Bruhns) war mütterlicherseits brasilianischer Herkunft. Aus der Ehe gingen noch die Kinder " };

        WordColl wc = new WordColl(chapter0);
        System.out.println(wc);
        System.out.println(wc.top());
    }
}
