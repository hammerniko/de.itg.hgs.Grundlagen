package A3_Variablen;

/**
 * v = s/t 
 * 
 * s -> Strecke
 * t -> zeit
 * v -> aktuelle Geschwindigkeit (m/s und km/h)
 * @author hr
 *
 */
public class Geschwindigkeit {
	
	public static void main(String[] args) {
		
		//Eingabe
		double strecke=50;  //in m
		double zeit=1;		//in s
		double geschwindigkeitMeterProSekunde; // in m/s
		double geschwindigkeitKilometerProStunde;
		String meldung="Die Geschwindigkeit :";
		
		
		//Verarbeitung
		geschwindigkeitMeterProSekunde = strecke / zeit;
		geschwindigkeitKilometerProStunde = 3.6 * geschwindigkeitMeterProSekunde;
		meldung = meldung + geschwindigkeitKilometerProStunde;
		
		
		
		//Ausgabe
		System.out.println(meldung);
		
	}

}
