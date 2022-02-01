package B1_Verzweigungen;

import java.util.Scanner;

public class SwitchCaseEinfach {
	
	public static Scanner s = new Scanner(System.in);

	public static int eingabeInt(String text) {
		System.out.print(text + "\t");
		int value = s.nextInt();
		return value;
	}

	public static void main(String[] args) {

		// Eingabe
		int monat = eingabeInt("Monat");
		int jahr = eingabeInt("Jahr");
		int tage;
	
		tage = gibAnzahlTageDesMonats(monat, jahr);

		// Ausgabe
		System.out.println("Der Monat " + monat + " im Jahr " + jahr + " hat " + tage + " tage");
		s.close();
	}

	
	
	
	
	
	
	
	
	
	private static int gibAnzahlTageDesMonats(int monat, int jahr) {
		int tage;
		// Verarbeitung
		switch (monat) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			tage = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			tage = 30;
			break;

		case 2:
			if (istDasJahrEinSchaltjahr(jahr)) {
				tage = 29;
			} else {
				tage = 28;
			}
			break;
		default:
			tage = -1;
			break;
		}
		return tage;
	}

	private static boolean istDasJahrEinSchaltjahr(int jahr) {
		boolean istSchaltjahr;
		
		if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0))	istSchaltjahr=true;
		else istSchaltjahr = false;
		
		return istSchaltjahr;
	}

}
