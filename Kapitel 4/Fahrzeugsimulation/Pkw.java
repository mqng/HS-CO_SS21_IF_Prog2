public class Pkw extends Fahrzeug {
	
	static final double PKW_A = 2.0; // m/sec^2
	
	public Pkw() {super();}
	
	
	public Pkw(String name) {
		super(name);
		
	}
	
	public double beschleunigen(double sekunden) {
		return super.beschleunigen(PKW_A, sekunden);
		
	}
	
	
	
	public double stoppen () {
		// Formel: Bremsweg + Reaktionsweg
		double anhalteweg = (0.5 * Math.pow(super.geschwindigkeit/10,2) 
			    + (super.geschwindigkeit/10 *3));						// Faustformel
		position += anhalteweg / 1000;	
		super.geschwindigkeit = 0;
		return anhalteweg;
	}
	
	public double hoechstGeschwindigkeit() {
		return 160.0;
	}
}
    
