public class TestZaehler {
    public static void main(String[] args) {
        Zaehler z = new Zaehler();
        while (true) {
            try {

                System.out.println(z.getZehner() + "" + z.getEiner());
                z.zaehlen();
            }

            catch (UeberlaufException e) {
                System.out.println("Überlauf");
            }
        }
    }
}
