public class Ort<E> {

    private final int ortsID;
    private E element;

    public Ort(int ortsID) {
        this.ortsID = ortsID;
    }

    public E entnehmen() {
        this.element = null;
        return element;
    }

    public void hinzufügen(E e) {
        this.element = e;
    }

    E getElement() {
        return element;
    }

    public boolean istBelegt() {
        if (element != null)
            return true;
        else
            return false;
    }

    int getID() {
        return ortsID;
    }

    public String toString() {
        return "OrtsID: " + getID() + " " + getElement();
    }
}