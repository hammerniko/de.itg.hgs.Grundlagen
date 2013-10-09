package A3_Variablen;
import java.util.Scanner;

public class Brueckenhoehe {
	
	public static void main(String[] args) {
		
		//EINGABE
		Scanner sc = new Scanner(System.in);
				
		//Deklaration
		double weg; // in m
				
		System.out.print("Geben Sie die Zeit ein: ");
		double zeit=sc.nextDouble();
		double beschleunigung = 9.81; //Erdbeschleunigung in m/s^2
		
		//Verarbeitung
		weg = 0.5 * beschleunigung * zeit * zeit;
		
		
		//Ausgabe
		System.out.println("Der Sprung war "+weg+ " m hoch");
		
		
		
	
	}
	
	

}
