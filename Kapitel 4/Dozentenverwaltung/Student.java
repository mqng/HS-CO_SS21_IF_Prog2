public class Student extends Person{

    private final int matrikelnummer;    
    
    public Student(String vorname, String nachname, String strassenname, String hausnummer, int plz, String ort, int matrikelnummer, int gehalt) {
        super(vorname, nachname, strassenname, hausnummer, plz, ort, gehalt);
        this.matrikelnummer = matrikelnummer;
    }

    public String toString(){
        return "" + super.toString() + " Matrikelnummer: " + matrikelnummer;
    }
}
