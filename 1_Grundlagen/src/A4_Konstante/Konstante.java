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
public class Konstante implements Physik{
	
	public static void main(String[] args) {

		//************************************EINGABE
		double fallzeit, hoehe;
		
		System.out.print("Fallzeit:");
		fallzeit = 1.5; //sekunden
				
		//************************************VERABEITUNG
		//hier mit der Konstanten aus dem Interface Physik
		hoehe = 0.5 * ERDFALLBESCHLEUNIGUNG * fallzeit*fallzeit;
		
		
		//************************************AUSGABE
		System.out.println(hoehe);
		
	}
}
