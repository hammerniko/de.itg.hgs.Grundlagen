package A6_Operatoren;

public class A64a_Winkelfunktionen_Winkel_in_Bogenmass {

	public static void main(String[] args) {
			
		//Winkel
		double alpha = 50;
				
		//Umrechnung in Bogenmass
		double bmAlpha = alpha * 2.0*Math.PI /360;
		
		//Winkelfunktion vom Bogenmass
		double sin = Math.sin(bmAlpha);
		
		//und umgekehrt
		double bm = Math.asin(sin);
		double alphaBerechnet = bm *360 / (2*Math.PI);
		
		
		System.out.println("Alpha="+alpha);
		System.out.println("Bm von Alpha="+bmAlpha);
		System.out.println("Sinus von 50 Grad im Deg modus"+sin);		
		System.out.println(alphaBerechnet);		
		
	}

}
