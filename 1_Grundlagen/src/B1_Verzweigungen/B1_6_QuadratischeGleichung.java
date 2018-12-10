
package B1_Verzweigungen;

import java.util.Scanner;

public class B1_6_QuadratischeGleichung {

	public static void main(String[] args) {
		// ***************Eingabe
		String ergebnis = "";
		double a, b, c, d, x1, x2, dis;
		String gleichung, str_a, str_b, str_c, str_d, str_dis = "";

		Scanner s = new Scanner(System.in);

		System.out.println("Bitte geben Sie eine quadratische Gleichung");
		System.out.println("der Form ax^2+bx+c=d ein:");

		System.out.print("a:\t");
		a = s.nextDouble();
		System.out.print("b:\t");
		b = s.nextDouble();
		System.out.print("c:\t");
		c = s.nextDouble();
		System.out.print("d:\t");
		d = s.nextDouble();

		// ******************VERARBEITUNG
		System.out.println("\nIhre Gleichung:\t\t\t" + ausgabeGleichung(a, b, c, d));

		// Nullform
		c = c - d;
		d = 0;
		System.out.println("Ihre Gleichung in Nullform:\t" + ausgabeGleichung(a, b, c, d));

		// Normalform
		if (a != 0) {
			b = b / a;
			c = c / a;
			a = 1;
			System.out.println("Ihre Gleichung in Normalform:\t" + ausgabeGleichung(a, b, c, d));

			// Diskriminante
			dis = (b * b / 4) - c;

			if (dis < 0) {
				str_dis = "Die Diskriminante ist < 0 -> Es gibt keine Lösung!";
				ergebnis = "Es gibt keine Loesung";
			} else if (dis == 0) {
				str_dis = "Die Diskriminante ist = 0 -> Es gibt eine Lösung!";
				x1 = -b / 2;
				ergebnis = "x = " + x1;
			} else {
				str_dis = "Die Diskriminante ist > 0 -> Es gibt zwei Lösungen!";
				x1 = -b / 2 + Math.sqrt(dis);
				x2 = -b / 2 - Math.sqrt(dis);
				ergebnis = "x1 = " + x1 + " \t x2= " + x2;
			}

		} else {
			// Wenn a = 0 ist
			c = c / b;
			d = d + c;
			ergebnis = ergebnis = "x = " + c;

		}

		// ********************AUSGABE
		System.out.println("\n" + str_dis);
		System.out.println("\n" + ergebnis);
	}

	private static String ausgabeGleichung(double a, double b, double c, double d) {
		String gleichung;
		String str_a;
		String str_b;
		String str_c;
		// Kontrollausgabe der Gleichung
		// a
		if (Math.abs(a) == 1) {
			str_a = "\tx²\t";
		} else {
			str_a = "\t" + a + "x²\t";
		}

		// b
		if (b >= 0) {
			str_b = " +\t" + b + "x ";
		} else if (Math.abs(b) == 1) {
			str_b = b + "x";
		} else {
			str_b = b + "x";
		}

		// c
		if (c >= 0) {
			str_c = " +\t" + c;
		} else {
			str_c = "\t" + c;
		}

		// gleichung
		gleichung = str_a + str_b + str_c + " = " + d;
		return gleichung;
	}
}
