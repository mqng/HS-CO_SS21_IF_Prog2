public class JeansLagerTest {
    
    public static void main(String[] args) {
        Artikellager<Jeans> jeansLager = new Artikellager<Jeans>(2);
        Jeans j1 = new Jeans(36,Jeans.Farbe.SCHWARZ, "Levis 501",340);
        Jeans j2= new Jeans(36,Jeans.Farbe.SCHWARZ, "Jeans Wrangler 50",380);
    
        jeansLager.einlagern(j1);
        jeansLager.einlagern(j2);

        System.out.println(jeansLager.bestandSuchen("56740736"));

       
        System.out.println(jeansLager.bestandSuchen("56740736"));
       

    }

}
