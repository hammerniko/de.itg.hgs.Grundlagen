package E1_Methoden;

import java.util.Scanner;

//ax^2+bx+c=d
//x1|x2 = -p/2+- Wurzel ( (p/2)^2-q)
//Diskriminante = (p/2)^2-q

//Diskriminate  >0 -> 2 Loesung
//Diskriminante <0 -> keine Loesung
//diskriminante =0 -> 1 Loesung

public class QuadratischeGleichung {

	public static void main(String[] args) {

		// Eingabe
		String ergebnis;

		// Verarbeitung
		ergebnis = loeseQuadratischeGleichung(1, 2, 2, 1);

		// Ausgabe
		System.out.println(ergebnis);

	}

	public static String loeseQuadratischeGleichung(double a, double b, double c, double d) {
		double x1;
		double x2;
		double diskriminante;
		String loesung;

		// bsp: 7x^2+3x-17=5
		// wird umgeformt in 7x^2+3x-22=0
		c = c - d;
		d = 0;

		// x^2 + 3/7x -22/7 = 0
		b = b / a;
		c = c / a;
		a = 1;

		// Diskriminante
		diskriminante = (b * b / 4) - c;

		if (diskriminante > 0) {
			x1 = -b / 2 + Math.sqrt(diskriminante);
			x2 = -b / 2 - Math.sqrt(diskriminante);
			loesung = "x1 = " + x1 + "\nx2 = " + x2;
		} else if (diskriminante == 0) {
			x1 = -b / 2;
			loesung = "x = " + x1;
		} else {
			loesung = "Es gibt keine Lšsung";
		}

		return loesung;
	}

}
