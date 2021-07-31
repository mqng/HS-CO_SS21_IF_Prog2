
public class PkwOAbs extends Pkw{
	
	public PkwOAbs(String name) {
		super(name);
	}
	
	public double stoppen () {
		// Formel: Bremsweg + Reaktionsweg
		double anhalteweg = (Math.pow(super.geschwindigkeit/10,2) 
			    + (super.geschwindigkeit/10 *3));
		position += anhalteweg / 1000;	
		super.geschwindigkeit = 0;
		return anhalteweg;
	}
	
	public double hoechstGeschwindigkeit() {
		return 140.0;
	}
}
 