package A4_Konstante;

public class Einheitenrechner implements Laengeneinheiten{

	public static void main(String[] args) {
		//Eingabe
		double messwert = 1609; //in metern
		double inch, foot, yard, miles,seemeile,millimeter, zentimeter,kilometer;
				
		//Verarbeitung
		inch = messwert / INCH;
		foot = messwert / FOOT;
		yard = messwert / YARD;
		miles = messwert / MILE;
		seemeile = messwert / SEEMEILE;
		zentimeter = messwert / ZENTIMETER;
		millimeter = messwert / MILLIMETER;
		kilometer = messwert / KILOMETER;
		
		//Ausgabe
		System.out.println("Messwert:\t"+messwert+" m");
		System.out.println("----------------------------------");
		System.out.println("in Kilometer:\t"+kilometer+" km");
		System.out.println("in Zentimeter:\t"+zentimeter+" cm");
		System.out.println("in Millimeter:\t"+millimeter+" mm");
		System.out.println("in Inch:\t"+inch+" in");
		System.out.println("in Foot:\t"+foot+" ft");
		System.out.println("in Yards:\t"+yard+" yd");
		System.out.println("in Miles:\t"+miles+" miles");
		System.out.println("in Seemeilen:\t"+seemeile+" NM");
		
		
		

	}

}
