package C_Variablen;

import java.util.Scanner;

public class Dreieck {

    
 
	
	public static void main(String[] args) {
	    //**********************************EINGABE
	    Scanner s = new Scanner(System.in);
	    //
	    
	    
	    //Deklaration
	    double hoehe, grundseite, flaeche;
	    
	    //Initialisierung (hier nicht zwingend notwendig)
	    hoehe = 0; grundseite = 0; flaeche = 0;
	    
	    System.out.print("Höhe: \t\t");
	    hoehe=s.nextDouble();
	    
	    System.out.print("Grundseite:\t");
	    grundseite = s.nextDouble();
	    
	    
	    
	    //********************************VERARBEITUNG
	    flaeche = 0.5 * hoehe * grundseite;
	    
	    
	            
	    
	    //*********************************AUSGABE
	    System.out.println("Die Fläche des Dreicks:"+flaeche+" cm^2");
		
	}//ende main

}//ende class
