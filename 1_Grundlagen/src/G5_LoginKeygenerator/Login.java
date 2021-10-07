package G5_LoginKeygenerator;

import java.util.ArrayList;

public class Login {

	public static void main(String[] args) {

		// zeigeAlleAssciiCodes();

		// Teste login mit Quersumme 15
		// System.out.println(login("x002"));
		// System.out.println(login("y001"));
		// System.out.println(login("z000"));
		// System.out.println(login("6801"));
		// System.out.println(login("9213"));

		generateLoginKeys(20);

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

		if (getPruefsumme(key) == 266) {
			loginOk = true;
		}

		return loginOk;
	}

	public static void generateLoginKeys(int anzahl) {

		// generiere zufaelligen Pruefsumme zw. 192-488
		int pruefsumme = (int) (Math.random() * (488 - 192) + 192);
		System.out.println("Prüfumme:"+pruefsumme);

		// Alle Ziffern 62
		int ziffern[] = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77,
				78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107,
				108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };

		// Liste fuer zu erstellende LoginKeys
		ArrayList<char[]> keys = new ArrayList<char[]>();

		// erstelle 4 zufällige Positionen aus der Ziffernliste
		int z = 0; // Position im Ziffernarray
		int assci = 0; // ascii Wert an der Position z
		char[] chars = new char[4]; // CharArray für generierten Key

		do {

			for (int i = 0; i < 4; i++) {
				z = (int) (Math.random() * ziffern.length - 1);
				int ascii = ziffern[z];
				chars[i] = (char) ascii;
			}

			keys.add(chars);
			System.out.println(chars);
			
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

			summeASCIIZahlen = summeASCIIZahlen + asciiValues[i];
		}
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
