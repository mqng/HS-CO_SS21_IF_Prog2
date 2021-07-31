public class Artikellager<E extends Artikel> {
    private Ort<E>[] orte;

    @SuppressWarnings("unchecked")
    public Artikellager(int anzahlOrte) {
        orte = new Ort[anzahlOrte];
        for (int i = 0; i < anzahlOrte; i++) {
            orte[i] = new Ort<E>(i);
        }
    }

    public E auslagern(String artikelnummer) {
        for (Ort<E> o : orte) {
            if (o.istBelegt()) {
                if (o.getElement().artikelNummer().equals(artikelnummer))
                    return o.entnehmen();
            }
        }
        return null;
    }

    public boolean einlagern(E e) {
        for (Ort<E> o : orte) {
            if (!o.istBelegt()) {
                o.hinzufügen(e);
                return true;
            }
        }
        return false;
    }

    public int bestandSuchen(String artikelnummer) {
        int anzahlArtikel = 0;
        for (Ort<E> o : orte) {
            if (o.istBelegt()) {
                if (o.getElement().artikelNummer().equals(artikelnummer))
                    anzahlArtikel++;
            }
        }
        return anzahlArtikel;
    }
    
    public String toString(){
        for (Ort<E> o : orte){
            return o.getElement().artikelNummer() + " " + o.getElement().bezeichnung();
        }
        return "\n";
    }
}
