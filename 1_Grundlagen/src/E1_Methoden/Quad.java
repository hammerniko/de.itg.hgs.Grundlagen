package E1_Methoden;

public class Quad {
	public static void main(String[] args) {
		// Eingabe
		double a, b, c, d;
		double x1 = 0, x2 = 0;
		double dis;
		String ergebnis = "";
		a = 2;
		b = -3.5;
		c = 1;
		d = 9;

		// Verarbeitung
		ergebnis = berechneQuadGleichung(a, b, c, d);

		// Ausgabe
		ausgabeGleichung(a, b, c, d);
		System.out.println(ergebnis);
	}

	private static String berechneQuadGleichung(double a, double b, double c,
			double d) {
		double x1;
		double x2;
		double dis;
		String ergebnis;
		// Nullform
		c = c - d;
		d = 0;

		// Normalisieren
		// x^2+...
		b = b / a;
		c = c / a;
		d = d / a;
		a = 1;

		// Diskriminante bilden
		dis = (b * b / 4) - c;

		// Diskriminante prüfen
		if (dis > 0) {
			x1 = -b / 2 + Math.sqrt(dis);
			x2 = -b / 2 - Math.sqrt(dis);
			x1 = getRoundedNumber(x1, 3);
			x2 = getRoundedNumber(x2, 3);
			ergebnis = "\nEs gibt zwei Lösungen: \nx1 = " + x1 + "\nx2 = " + x2;
		} else if (dis == 0) {
			x1 = getRoundedNumber(-b / 2, 3);
			ergebnis = "\nEs gibt eine Lösung: x = " + x1;
		} else {
			ergebnis = "\nEs gibt keine Loesung";
		}
		return ergebnis;
	}

	private static void ausgabeGleichung(double a, double b, double c, double d) {
		String s1 = " + ";
		String s2 = " + ";
		String strA = "" + a;
		String strB = "" + b;
		String strC = "" + c;
		String strD = "" + d;
		String strX2 = "x²";

		if (b < 0) {
			s1 = "";
		}
		if (c < 0) {
			s2 = "";
		}
		if (a == 1) {
			strA = "";
		} else if (a == (int) a) {
			int a1 = (int) a;
			strA = "" + a1;
		}
		if (b == (int) b) {
			int b1 = (int) b;
			strB = "" + b1;
		}
		if (c == (int) c) {
			int c1 = (int) c;
			strC = "" + c1;
		}
		if (d == (int) d) {
			int d1 = (int) d;
			strD = "" + d1;
		}
		if (a == 0) {
			strA = "";
			s1 = "";
			strX2 = "";
		}
		System.out.println(strA + strX2 + s1 + strB + "x" + s2 + strC + " = "
				+ strD);
	}

	// Liefert eine Zahl mit einer festgelegten Anzahl von Nachkommastellen
	// Es kann entweder gerunded oder abgeschnitten werden
	private static double getRoundedNumber(double pZahl, int pAnzahlStellen) {

		// Komma verschieben um Anzahl Stellen
		pZahl = pZahl * Math.pow(10, pAnzahlStellen);

		// letzte Dezimalstelle ab 0.5 aufrunden, sonst abrunden
		pZahl = pZahl + 0.5;

		// Nachkommateil abschneiden
		pZahl = (int) pZahl;

		// Komma zurückschieben
		pZahl = pZahl / Math.pow(10, pAnzahlStellen);

		return pZahl;
	}

}
