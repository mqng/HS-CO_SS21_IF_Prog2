public class FahrzeugSimulation {
	
	public static void main(String[] args) {
		final int TIME_MAX = 5;						// minuten
		final int STRECKE_MAX = 30;					// km
		
		Fahrzeug[] autos = new Fahrzeug[5];
		Fahrzeug golf = new Pkw("Golf1");
		Fahrzeug bmw = new Pkw("Bmw1");
		Fahrzeug kaefer = new PkwOAbs("Kaef1");
		Lkw lkw1 = new Lkw(40,"Lkw1");
		
        lkw1.beladen(40);
		
		Lkw lkw2 = new Lkw(40,"Skw2");	

		autos[0] = golf;
		autos[1] = bmw;
		autos[2] = kaefer;
		autos[3] = lkw1;
		autos[4] = lkw2;
		
		// Beschleunigen und Fahren 1 min
		for (int i= 0; i < autos.length; i++) {
			if (autos[i] instanceof Lkw) {
				autos[i].beschleunigen(30);
				autos[i].fahren(0.5);
			}
			else {
				autos[i].beschleunigen(15);
				autos[i].fahren(0.75);
			}
			System.out.println("Beschleunigung: " + autos[i].name + " v=" + autos[i].geschwindigkeit + " km/h  pos=" + autos[i].position + " km\n\n");
		}
		
		// Fahren
		for (int t = 1; t < TIME_MAX; t++) {
			
			System.out.println("Time = " + t + " min");
			for (int i = 0; i < STRECKE_MAX; i++)
				System.out.print(String.format("%-3d",i ));
			for (int i = 0; i < autos.length;i++) {
				printPos(autos[i].name, autos[i].position);
				autos[i].fahren(1);
			}

		}
		
		// Stoppen
		System.out.println("\nTime = " + TIME_MAX + "min\n" +
				"Stoppen alle Fahrzeuge\n");
		
		for (int i = 0; i < autos.length;i++) {
			System.out.print(autos[i].name + " v=" + autos[i].geschwindigkeit + " km/h  pos=" + autos[i].position + " km ");
			System.out.println("Anhalteweg: " +  autos[i].stoppen() + " m" + " pos= " + autos[i].position);
		}
		
	}

	public static void printPos(String s, double pos) {	
		System.out.println();
		int p = (int) ((pos * 10) / 10);
		for (int i = 0; i < p; i++)
			System.out.print("---");
		System.out.println(s.charAt(0));
	}

}
