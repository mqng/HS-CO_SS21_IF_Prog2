public abstract class Fahrzeug {
    protected double position; 				// 	km
    protected double geschwindigkeit;		//	km/h
    protected String name;

    public Fahrzeug() {}
    
    protected Fahrzeug(String name) {
		this.name = name;
		
	}
    
    public double fahren( double minuten ) {
        position += geschwindigkeit * minuten/60;
        return position;
    }
    
    public abstract double beschleunigen(double sekunden);
    public abstract double stoppen(); 						// Vollbremsung
    public abstract double hoechstGeschwindigkeit();
    
    protected double beschleunigen(double a, double sekunden) {
    	double v = a * sekunden; 				// m/sekunden
		geschwindigkeit = (v * 3600) / 1000; 	// km/h

		if (geschwindigkeit > hoechstGeschwindigkeit()) {
			geschwindigkeit = hoechstGeschwindigkeit();
			double sek = (geschwindigkeit/3600 * 1000) / a;
			double s = 0.5 * a * Math.pow(sek, 2);
			position = s / 1000;
			return fahren((sekunden-sek) /60);

		} else {

			double s = 0.5 * a * Math.pow(sekunden, 2);
			position = s / 1000;
			return position;
		}
			
    }
    
    public String toString() { return name + " " + position + " " + geschwindigkeit; }
       
}
