package A4_Konstante;

public class Einheitenrechner implements Laengeneinheiten{

	public static void main(String[] args) {
		//Eingabe
		double messwert = 1000; //in metern
		double inch, foot, yard, miles,seemeile,millimeter, zentimeter,kilometer;
				
		//Verarbeitung
		inch = messwert * METER_IN_INCH;
		foot = messwert * METER_IN_FOOT;
		yard = messwert * METER_IN_YARD;
		miles = messwert * METER_IN_MILE;
		seemeile = messwert * METER_IN_SEEMEILE;
		zentimeter = messwert * METER_IN_ZENTIMETER;
		millimeter = messwert * METER_IN_MILLIMETER;
		kilometer = messwert * METER_IN_KILOMETER;
		
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
