package A3_Variablen;

public class Kraftberechnung {

	public static void main(String[] args) {
		
		//EINGABE
		double masse = 45;
		double erdfallbeschleunigung = 9.81;
		double kraft;

		
		//VERARBEITUNG
		kraft = masse * erdfallbeschleunigung;
		
		
		//AUSGABE
		System.out.println();
		System.out.println("Berechnung der Kraft F=m*a");
		System.out.println("-------------------------------------------------------");
		System.out.println("Masse \t\t\tm = "+masse);
		System.out.println("Erdfallbeschleunigung \tg = "+erdfallbeschleunigung+"m/s²");
		System.out.println("Kraft \t\t\tF = m*a = "+kraft+" N");
//		
	}

}
