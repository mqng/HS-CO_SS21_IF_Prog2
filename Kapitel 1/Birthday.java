import java.text.DateFormat;
import java.util.Locale;

class Birthday {
    private String theDay;

    public Birthday(String s) throws InvalidBirthdayException {

        this.theDay = s;
        checkDay(theDay);

    }

    public void checkDay(String s) throws InvalidBirthdayException {
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT,Locale.GERMANY);
        df.setLenient(false);

        try {
            df.parse(s);
        } catch (Exception e) {
            throw new InvalidBirthdayException("Ungültig");
        }
    }
    
}
