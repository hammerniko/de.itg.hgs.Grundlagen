package E1_Methoden;

import java.util.Scanner;

public class ggT {

	
		 /*
		  * Berechnung des ggT zweier Zahlen 
		  * nach dem Euklidischen Algorithmus
		  */
		 private static int ggt(int zahl1, int zahl2) {
		   while (zahl2 != 0) {
		     if (zahl1 > zahl2) {
		       zahl1 = zahl1 - zahl2;
		     } else {
		       zahl2 = zahl2 - zahl1;
		     }
		   }
		   return zahl1;
		 }
		 
		 /*
		  * Hauptprogramm:
		  */
		 public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
		   System.out.print("Erste Zahl:\t");
		  int ersteZahl = s.nextInt();
		  
		  System.out.print("Zweite Zahl:\t");
		  int zweiteZahl = s.nextInt();
		 
		   // berechne ggT mit der Funktion "ggt()"
		   int ergebnis = ggt(ersteZahl, zweiteZahl);
		 
		   // Ausgabe des Ergebnisses:
		   System.out.println("Der ggT von "  + ersteZahl + 
		       " und " + zweiteZahl + " ist: " + ergebnis);
		 }
		

}
