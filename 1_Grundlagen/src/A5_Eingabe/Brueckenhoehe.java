package A5_Eingabe;
import java.util.Scanner;
/**
 * Berechnet werden soll die H�he einer Br�cke mit der 
 * Formel s = 0.5 at�. Die Erdfallbeschleunigung soll aus dem 
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
 * 4.) Zeit �ber Tastatur mit Hinweistext "Zeit:" einlesen.
 * 
 * 5.) Br�ckenh�he berechnen und der Variablen weg zuweisen.
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
				
		//Deklaration s=1/2 a t�
		double weg,zeit; // in m
				
		System.out.print("Zeit: ");
		zeit=sc.nextDouble();
				
		//Verarbeitung
		weg =1.0/2 * ERDFALLBESCHLEUNIGUNG * zeit * zeit;
				
		
		
		//Ausgabe
		System.out.println("Die gemessene Zeit ist "+zeit+" sekunden.");
		System.out.println("Die Bruecke ist "+weg+ " m hoch");
		
		
		
	
	}
	
	

}
