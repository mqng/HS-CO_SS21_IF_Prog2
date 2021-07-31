/* Das Java-Praktikum, dpunkt Verlag 2008, ISBN 978-3-89864-513-3
 * Aufgabe: Mobiles
 * Entwickelt mit: Sun Java 6 SE Development Kit
 */
package mobile;

/**
 * Definiert ein St�bchen des Mobiles.
 * Composite im design pattern "composite".
 *
 * @author Klaus K�hler, koehler@hm.edu
 * @author Reinhard Schiedermeier, rs@cs.hm.edu
 * @version 15.06.2008
 */
public class Wire implements Mobile {
    /**
     * Erster Kindknoten.
     */
    private final Mobile first;

    /**
     * Zweiter Kindknoten.
     */
    private final Mobile second;

    /**
     * Arml�nge des ersten Kindknotens.
     */
    private double distanceFirst;

    /**
     * Arml�nge des zweiten Kindknotens.
     */
    private double distanceSecond;

    /**
     * Erzeugt ein St�bchen mit zwei daran h�ngenden Mobiles.
     * @param fst erstes Mobile
     * @param snd zweites Mobile
     * @param ln L�nge des St�bchens
     */
    public Wire(final Mobile fst, final Mobile snd, final double ln) {
        if(fst == null  || snd == null)
            throw new NullPointerException("null mobile");
        first = fst;
        second = snd;
        distanceFirst = 0;
        distanceSecond = ln;
    }

    public double weight() {
        return first.weight() + second.weight();
    }

    public void balance() {
        first.balance();
        second.balance();
        final double w1 = first.weight();
        final double w2 = second.weight();
        final double length = distanceFirst + distanceSecond;
        distanceFirst = w2*length/(w1 + w2);
        distanceSecond = w1*length/(w1 + w2);
    }

    @Override
    public String toString() {
        return String.format("Mobile[%g:%s, %g:%s]",
                             distanceFirst,
                             first.toString(),
                             distanceSecond,
                             second.toString());
    }
}
