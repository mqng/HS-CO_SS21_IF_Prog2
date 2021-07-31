public class OrtTest {
    public static void main(String[] args) {
        Ort<String> Ort1 = new Ort<String>(1);
        Ort<String> Ort2 = new Ort<String>(10);
        Ort1.hinzufügen("Laptop");
        Ort2.entnehmen();
        System.out.println(Ort1 +"\n"+ Ort2);

        System.out.println();
    } 
}
