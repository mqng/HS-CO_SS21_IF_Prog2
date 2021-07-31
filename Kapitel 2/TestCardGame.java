public class TestCardGame {
    public static void main(String[] args) {
        CardGame game1 = new CardGame(10);
        System.out.println(game1.toString());
        game1.mix();
        System.out.println(game1.toString());
        game1.sort();
        System.out.println(game1);
    }
}
