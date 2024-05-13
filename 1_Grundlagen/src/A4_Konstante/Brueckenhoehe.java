package A4_Konstante;

import java.util.Scanner;

/**
 * Um die Konstanten aus einem Interface zuverwenden,
 * wird dieses über den Befehl implements zugaenglich gemacht.
 * Mit der Codevervollständigung von Eclipse (Strg + Leertaste)
 * können die Konstanten dann ausgewaehlt und eingefuegt werden.
 * @author hr
 *
 */
public class Brueckenhoehe implements Physik{
	
	public static void main(String[] args) {

		//EINGABE
		double fallzeit, brueckenhoehe;
		fallzeit = 1.5; //sekunden	
				
		//VERABEITUNG
		//hier mit der Konstanten aus dem Interface Physik
		//s=1/2 a t²
		brueckenhoehe = 0.5 * NORMALFALLBESCHLEUNIGUNG * fallzeit*fallzeit;
		
		
		
		//AUSGABE
		System.out.print("Fallzeit:"+fallzeit);
		System.out.println(brueckenhoehe);
		
	}
}
