package A6_Operatoren;

public class Bogenmass {

	public static void main(String[] args) {
			
		//Winkel
		double alpha = 45;
		
		//Umrechnung in Bogenmass
		double bmAlpha = alpha * 2.0*Math.PI /360;
		
		//Winkelfunktion vom Bogenmass
		double sin = Math.sin(bmAlpha);
		System.out.println(sin);

		
		//und umgekehrt
		double bm = Math.asin(sin);
		double alphaBerechnet = bm *360 / (2*Math.PI);
		System.out.println(alphaBerechnet);		
		
	}

}
