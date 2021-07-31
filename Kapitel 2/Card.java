public class Card implements Comparable<Card>{
    
    private final Suit s;
    private final Value v;

    public Card(Suit s, Value v){
          this.s = s;
          this.v = v;
    }

    @Override
    public int compareTo(Card c) {
        return Integer.compare(this.s.ordinal(), c.s.ordinal());
    }

    public String toString() {
        return s + " " + v;
    }
}
