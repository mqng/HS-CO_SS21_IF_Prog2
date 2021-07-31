public class Zaehler {

    private int einerStelle = 0, zehnerStelle = 0;

    public Zaehler() {
    }

    public void erhoeheUmEins() throws EinerUeberlaufException {
        einerStelle += 1;
        if (einerStelle > 9)
            throw new EinerUeberlaufException();
        
    }

    public void erhoeheUmZehn() throws UeberlaufException{
        zehnerStelle += 1;
        if (zehnerStelle > 9) {
            einerStelle = 0;
            zehnerStelle = 0;
            throw new UeberlaufException();
        }
    }

    public void zaehlen() throws UeberlaufException {
        try {
            erhoeheUmEins();
        } catch (EinerUeberlaufException e1) {
            einerStelle = 0;
            try {
            erhoeheUmZehn();}
            catch(UeberlaufException e){
                zehnerStelle = 0;
                throw new UeberlaufException();
            }
        }
        

    }
    public int getEiner() {
        return einerStelle;
    }
    public int getZehner() {
        return zehnerStelle;
    }
}

