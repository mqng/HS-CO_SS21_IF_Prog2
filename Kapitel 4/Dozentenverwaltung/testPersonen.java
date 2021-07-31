public class testPersonen {
    public static void main(String[] args) {
        Student aStudent = new Student("Peter", "Müller", "Hauptstrasse", "4a", 96450, "Coburg", 455555, 1000);
        Student bStudent = new Student("Lasso", "Dieter", "Lebanonstrasse", "47b", 12345, "Berlin", 437289, 450);
        Dozent aDozent = new Dozent("Hans", "Meyer", "Jenaerstrasse", "21", 96450, "Coburg", "Betriebssysteme", 1000);
        Dozent bDozent = new Dozent("Johannes", "Sigma", "Berlinerstrasse", "7", 53173, "Bonn", "Quantenphysik", 1000);
        Person aPerson = new Person("Bob", "Nielsen", "Oststrasse", "5", 96472, "Rödental", 50);
    
        Person[] personArray = {aStudent, bStudent, aDozent, bDozent, aPerson};

        for (Person p : personArray) {
            System.out.println(p);
            System.out.println(p.getGehalt());
        }

        
    }
}
