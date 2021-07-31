import java.util.*;

public class Pair<T, U> {
    private final T first;

    private final U second;

    public Pair(final T fst, final U snd) {
        first = fst;
        second = snd;
    }

    public T first() {
        return first;
    }

    public U second() {
        return second;
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(final Object x) {
        if(x == null)
            return false;
        if(x.getClass() != getClass())
            return false;
        final Pair other = (Pair)x;
        if(!nullEquals(first, other.first()))
            return false;
        if(!nullEquals(second, other.second()))
            return false;
        return true;
    }

    private static boolean nullEquals(final Object x, final Object y) {
        if(x == null)
            return y == null;
        return x.equals(y);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if(first != null)
            hash = 41*hash + first.hashCode();
        if(second != null)
            hash = 41*hash + second.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return String.format("(%s, %S)", first, second);
    }

    public static class FirstComparator <T extends Comparable <? super T> , U> implements
                Comparator<Pair<T, U>> {
        public int compare(final Pair<T, U> p0, final Pair<T, U> p1) {
            if(p0.first() == null)
                return p1.first() == null?  0:  -1;
            if(p1.first() == null)
                return 1;
            return p0.first().compareTo(p1.first());
        }

    }

    public static class SecondComparator <T, U extends Comparable <? super U>> implements
                Comparator<Pair<T, U>> {
        public int compare(final Pair<T, U> p0, final Pair<T, U> p1) {
            if(p0.second() == null)
                return p1.first() == null?  0:  -1;
            if(p1.second() == null)
                return 1;
            return p0.second().compareTo(p1.second());
        }

    }

    public static void main(final String[] args) {
        final List<Pair<String, Integer>> list = new ArrayList<Pair<String, Integer>>();
        list.add(new Pair<String, Integer>("I", 1));
        list.add(new Pair<String, Integer>("V", 5));
        list.add(new Pair<String, Integer>("C", 100));
        list.add(new Pair<String, Integer>("II", 2));
        list.add(new Pair<String, Integer>("IX", 9));
        System.out.println(list);
        Collections.sort(list, new Pair.FirstComparator<String, Integer>());
        System.out.println(list);
        Collections.sort(list, new Pair.SecondComparator<String, Integer>());
        System.out.println(list);
    }

}
