public class Person {
    
    private String vorname;
    private String nachname;
    private String strassenname;
    private String hausnummer;
    private String ort;
    private int plz;
    private int gehalt;
    
    public Person(String vorname, String nachname, String strassenname, String hausnummer, int plz, String ort, int gehalt){
        this.vorname = vorname;
        this.nachname = nachname;
        this.strassenname = strassenname;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.gehalt = gehalt;
    }
    public int getGehalt(){
        return gehalt;
    }

    public String toString(){
        return vorname + " " + nachname + " " + strassenname + " " + hausnummer
                + " " + plz + " " + ort;
    }

}
