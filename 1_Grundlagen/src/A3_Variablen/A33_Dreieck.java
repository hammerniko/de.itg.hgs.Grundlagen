package A3_Variablen;

public class A33_Dreieck {
	
	public static void main(String[] args) {
	    //EINGABE
		
		//Text als Variable
		String flaecheStr = "Die Flaeche des Dreiecks betraegt ";
		
		//Einzelnes Zeichen
		char a = 'a';
		boolean istEsDraussenKalt = true;
		boolean isDRSEnabled = true;
		
 	    int hoehe, grundseite;
 	    double flaeche;  
	    hoehe = 5; 
	    grundseite = 3; 
	    
	    //VERARBEITUNG
	    flaeche = hoehe * grundseite/2.0;
	    
	    //AUSGABE
	    System.out.println(flaecheStr+flaeche+"cm²");
		
	}//ende main
}//ende class
