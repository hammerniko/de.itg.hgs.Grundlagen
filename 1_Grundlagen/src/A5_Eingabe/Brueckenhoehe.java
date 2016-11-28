package A5_Eingabe;
import java.util.Scanner;
/**
 * Berechnet werden soll die Höhe einer Brücke mit der 
 * Formel s = 0.5 at². Die Erdfallbeschleunigung soll aus dem 
 * Interface "Physik" der letzten Stunde verwendet werden.
 * 
 * 1.) Kopieren Sie das Interface "Physik" der letzen Stunde 
 *     in das Paket A5...
 * 
 * 2.) Binden Sie das Interface in der Klasse "Brueckenhoehe"
 *     ein.
 * 
 * 3.) Deklarieren Sie die Variablen weg, zeit als
 *     Kommazahlen.
 * 
 * 4.) Zeit über Tastatur mit Hinweistext "Zeit:" einlesen.
 * 
 * 5.) Brückenhöhe berechnen und der Variablen weg zuweisen.
 * 
 * 6.) Ergebnis ausgeben.
 *     
 *   
 * @author hr
 *
 */






public class Brueckenhoehe implements Physik{
	
	public static void main(String[] args) {
		
		
		//EINGABE
		Scanner sc = new Scanner(System.in);
				
		//Deklaration
		double weg,zeit; // in m
				
		System.out.print("Zeit: ");
		zeit=sc.nextDouble();
				
		//Verarbeitung
		weg = 0.5 * ERDFALLBESCHLEUNIGUNG * zeit * zeit;
		
		
		//Ausgabe
		System.out.println("Die Bueck ist "+weg+ " m hoch");
		
		
		
	
	}
	
	

}
