public class Dozent extends Person{
    private String lehrgebiet;

    public Dozent(String vorname, String nachname, String strassenname, String hausnummer,  int plz, String ort, String lehrgebiet, int gehalt) {
        super(vorname, nachname, strassenname, hausnummer, plz, ort, gehalt);
        this.lehrgebiet = lehrgebiet;
    }
    public String toString(){
        return "" + super.toString() + " Lehrgebiet: " + lehrgebiet;
    }
}
