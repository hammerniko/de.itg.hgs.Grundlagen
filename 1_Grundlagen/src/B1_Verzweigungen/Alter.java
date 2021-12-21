package B1_Verzweigungen;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Alter {

	public static void main(String[] args) {
		//********* EINGABE
		Scanner s = new Scanner(System.in);
		
		System.out.println("Geburtsjahr:\t");
		int gebjahr = s.nextInt();
		
		System.out.println("Geburtsmonat:\t");
		int gebMonat = s.nextInt();
		
		System.out.println("Geburtstag:\t");
		int gebTag = s.nextInt();
		
		//Geburtsdatum erzeugen
		LocalDate gebDatum = LocalDate.of(gebjahr,gebMonat,gebTag);
		
		//Aktuelles Datum
		LocalDate heute = LocalDate.now();
		
		
		// ******* VERARBEITUNG
		//Alter berechnen
		int alter = calculateAge(gebDatum, heute);
		
		// ******** AUSGABE
		System.out.println("Alter:"+alter);
	}
	
	public static int calculateAge(
			  LocalDate birthDate,
			  LocalDate currentDate) {
			    // validate inputs ...
		return Period.between(birthDate, currentDate).getYears();
	}

}
