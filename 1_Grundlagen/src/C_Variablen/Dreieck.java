package C_Variablen;

import java.util.Scanner;

public class Dreieck {

	
	public static void main(String[] args) {
		//**********************************EINGABE
		Scanner s = new Scanner(System.in);
		
		System.out.print("Höhe: \t\t");
		double hoehe=s.nextDouble();
		
		System.out.print("Grundseite:\t");
		double grundseite = s.nextDouble();
		
		double flaeche;
		
		//********************************VERARBEITUNG
		flaeche = 0.5 * hoehe * grundseite;
		
		
				
		
		//*********************************AUSGABE
		System.out.println("Die Fläche des Dreicks:"+flaeche+" cm^2");
		
	}

}
