import java.util.Arrays;

public class CardGame {
    private Card[] cards;

    public CardGame(int n) {
        this.cards = new Card[n];
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        for (int i = 0; i < n; i++) {
            cards[i] = new Card(suits[(int) (Math.random() * suits.length)],
                    values[(int) (Math.random() * values.length)]);
        }
    }

    public void mix() {
        for (int i = 0; i < cards.length; i++) {
            int r = (int) (Math.random() * (cards.length - 1));
            Card swap = cards[r];
            cards[r] = cards[i];
            cards[i] = swap;
        }
    }

    public void sort() {
        Arrays.sort(cards);
    }
    
    public void addCards(CardGame cg) {
        Card[] temp = this.cards;
        this.cards = new Card[temp.length + cg.cards.length];
        System.arraycopy(temp, 0, cards, 0, temp.length);
        System.arraycopy(cg.cards, 0, cards, temp.length, cg.cards.length);
    }

    public String toString() {
        return Arrays.toString(cards);
    }
}
