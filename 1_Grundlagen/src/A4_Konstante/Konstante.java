package A4_Konstante;

import java.util.Scanner;

public class Konstante implements Physik{
	
	public static void main(String[] args) {

		//************************************EINGABE
		double weg, fallzeit, hoehe;
		Scanner s = new Scanner(System.in);
		System.out.print("Fallzeit:");
		fallzeit = s.nextDouble();
				
		//************************************VERABEITUNG
		hoehe = 0.5 * FALLBESCHLEUNIGUNG * fallzeit*fallzeit;
		
		
		//************************************AUSGABE
		System.out.println(hoehe);
		
	}
}
