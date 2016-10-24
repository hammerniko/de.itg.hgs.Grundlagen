package A4_Konstante;

public class Einheitenrechner implements Physik{

	public static void main(String[] args) {
		//Eingabe
		double messwert = 1609; //in metern
		double inch, foot, yard, miles;
				
		//Verarbeitung
		inch = messwert / INCH;
		foot = messwert / FOOT;
		yard = messwert / YARD;
		miles = messwert / MILE;
		
		//Ausgabe
		System.out.println("Messwert:\t"+messwert+" m");
		System.out.println("in Inch:\t"+inch+" in");
		System.out.println("in Foot:\t"+foot+" ft");
		System.out.println("in Yards:\t"+yard+" yd");
		System.out.println("in Miles:\t"+miles+" miles");
		

	}

}
