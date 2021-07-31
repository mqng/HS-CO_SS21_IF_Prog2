public class Lkw extends Fahrzeug {
	
	protected double 	ladung; 		// in t
	protected double 	maxLadung;		// in t
	
	static final double LKW_VERZOEGERUNG_BELADEN 	= 3.0; 	// m/s^2
	static final double LKW_VERZOEGERUNG_UNBELADEN 	= 5.0; 	// m/s^2
	
	static final double LKW_A = 0.5; // m/sec^2
	
	
	public Lkw(double maxL, String name) {
		super(name);
		maxLadung = maxL;
	}
	
	boolean istVollBeladen() { 
		return ((ladung == maxLadung)? true : false);
	}

	public void beladen(double ladungInTonnen) {
		
		if ((ladung + ladungInTonnen) > maxLadung)
			ladung = maxLadung;
		else 
			ladung += ladungInTonnen;
	}
	
	public void entladen(double ladungInTonnen){
		if ((ladung - ladungInTonnen) < 0)
			ladung = 0;
		else 
			ladung -= ladungInTonnen;
	}
	
	public  double hoechstGeschwindigkeit() {
		return 105.0;
	}
	

	@Override
	public double stoppen() {
		double gProSek = ((super.geschwindigkeit/60)*1000)/60;
		double lkwVerzoegerung ;
		
		if (istVollBeladen()) 
			lkwVerzoegerung = LKW_VERZOEGERUNG_BELADEN;
		else 
			lkwVerzoegerung = LKW_VERZOEGERUNG_UNBELADEN; 
		
		double anhalteweg = Math.pow(gProSek,2)/ (2*lkwVerzoegerung) + (super.geschwindigkeit/10 *3); // m
		position += anhalteweg / 1000;																  // km
		super.geschwindigkeit = 0;
		return anhalteweg;
	}

	public double beschleunigen(double sekunden) {
			return super.beschleunigen(LKW_A, sekunden);
	}
}
