package G5_LoginKeygenerator;

import java.util.ArrayList;
import java.util.Set;

/**
 * Fuer eine Website mit Feedbacks werden regelm�ssig neue Passwoerter fuer
 * ganze Gruppen benoetigt. Das Passwort soll sicherstellen, dass jedes Feedback
 * nur einmalig ausgefuehrt werden kann.
 * 
 * Der Code soll 4 Stellen haben. Gueltige Ziffern sind A-Z, a-z und 1-9.
 * 
 * Da ueber die Login-Methode alle Passwoerter ueberpruefbar sein sollen, ist ein
 * Algorithmus dafuer notwendig. Hier sollen Codes mit der gleichen Quersumme
 * des ASCII-Codes der 4 Zeichen den Zugang erlauben.
 * 
 * Die Methode generateLoginKeys(int anzahl) soll im Gegenzug eine definierte
 * Anzahl von Login Keys erzeugen, welche dann an eine Gruppe gegeben werden
 * kann. Es reicht aus, die generierten LoginKeys �ber die Konsole auszugeben.
 * 
 * Der Code hat noch einige Schw�chen.
 * So k�nnen z.B. doppelte Codes vorkommen.
 * Desweiteren kann es passieren, dass nicht genuegend Codes zur Verfuegung stehen.
 * W�re der erste zuf�llige Code = "0000" g�be es nur eine M�glichkeit. 
 * @author hr
 *
 */
public class Login {

	public static void main(String[] args) {

		 //zeigeAlleAssciiCodes();


		// Teste login mit Quersumme

		// Teste login mit Quersumme 15
		// System.out.println(login("XLEM"));
		// System.out.println(login("z000"));

		generateLoginKeys(10);

	}

	public static boolean login(String key) {

		boolean loginOk = false;

		// Laenge pruefen
		if (key.length() != 4) {
			return false; // Abbruch
		}

		// Pruefen obe Pruefsumme stimmt
		// Minimale Pruefsumme = 48+48+48+48 = 192 -> 0000
		// Maximale Pruefsumme = 122+122+122+122 = 488 -> zzzz
		// System.out.println(summeASCIIZahlen);

		if (getPruefsumme(key) == 310) {
			loginOk = true;
		}

		return loginOk;
	}

	
	
	
	
	
	
	
	
	public static void generateLoginKeys(int anzahl) {
		int pruefsumme = 0;
		int wertZufallsCode = 0;
		int anzahlVersuche = 0;
		

		// Alle Ziffern 62
		int ziffern[] = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
				78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107,
				108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };

		/*
		 * Liste fuer zu erstellende LoginKeys Diese k�nnten auch als Rueckgabewert
		 * eingesetzt werden. Evtl. ein Set verwenden, um doppelte Eintraege zu
		 * vermeiden.
		 */
		ArrayList<char[]> keys = new ArrayList<char[]>();

		// erstelle 4 zuf�llige Positionen aus der Ziffernliste
		int z = 0; 					// Position im Ziffernarray
		int assci = 0;				// ascii Wert an der Position z
		char[] chars = new char[4]; // CharArray f�r generierten Key

		
		do {
			
			for (int i = 0; i < 4; i++) {
				// Bilde zufaelligen Code
				z = (int) (Math.random() * ziffern.length);
				
				//Bilde zufaelligen Code
				z = (int) (Math.random() * ziffern.length - 1);
				int ascii = ziffern[z];
				chars[i] = (char) ascii;
			}

			// Der erste generierte Code bestimmt die Quersumme
			if (pruefsumme == 0) {
				pruefsumme = getPruefsumme(chars);
				System.out.println("Pruefsumme:" + pruefsumme);
			}
				// Pr�fe ob es genug m�gliche Kombinationen
				// gibt, um die notwendige Anzahl von Keys
				// zu erzeugen
				// ????
			

			// Wenn die ermittelte Pruefsumme des
			// generierten Codes stimmt uebernehme ihn
			// in die Liste

			if (getPruefsumme(chars) == pruefsumme) {
				keys.add(chars);
				System.out.print(chars);
				System.out.println(" AnzVersuche:" + anzahlVersuche);
				anzahlVersuche = 0;
			} else {
				// genrieren neuen Code
				anzahlVersuche++;
			}
			// Wenn die ermittelte Pruefsumme des
			// generierten Codes stimmt uebernehme ihn
			// in die Liste
			if (getPruefsumme(chars) == pruefsumme) {
				keys.add(chars);
				System.out.print(chars);
				System.out.println(" AnzVersuche:"+anzahlVersuche);
				anzahlVersuche = 0;
			}
			else {
				//genrieren neuen Code
				anzahlVersuche++;
			}
			
			
		} while (keys.size() < anzahl);

	}

	private static int getPruefsumme(String code) {
		// Den String in einzelne charwerte umwandeln
		// um an den ASCII Code zu kommen
		char[] chars = code.toCharArray();

		// Aus den charwerten die ASCII Code Werte ermitteln
		// 0 -> 48, 1 -> 49 ...
		// A -> 65, B -> 66 ...
		// a -> 97, b -> 98 ...
		int[] asciiValues = new int[chars.length];
		int summeASCIIZahlen = 0;

		for (int i = 0; i < chars.length; i++) {
			asciiValues[i] = chars[i];

			// Quersumme bilden
			// Anstatt der Quersumme k�nnte hier auch ein
			// komplexerer Algorithmus verwendet werden
			summeASCIIZahlen = summeASCIIZahlen + asciiValues[i];
		}
		return summeASCIIZahlen;
	}

	
	

	private static int getPruefsumme(char[] chars) {
		String strChars = "";

		for (int i = 0; i < chars.length; i++) {
			strChars = strChars + chars[i];
		}

		int summeASCIIZahlen = getPruefsumme(strChars);
		return summeASCIIZahlen;

	}

	public static void zeigeAlleAssciiCodes() {
		char z;
		for (int i = 0; i < 127; i++) {
			z = (char) i;

			System.out.println(i + " -> " + z);
		}
	}

}
