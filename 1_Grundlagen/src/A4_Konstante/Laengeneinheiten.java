package A4_Konstante;

public interface Laengeneinheiten {

	   //EInheiten bezogen auf Meter
		final double ZENTIMETER = 0.01;
		final double MILLIMETER = ZENTIMETER/10;
		final double KILOMETER = 1000;
	
	
		final double INCH = 2.54e-2;  //1 inch (Zoll) = 2,54cm
		final double FOOT = 30.48e-2; //1 foot = 30,48cm
		final double YARD = 3*FOOT; //1 yard = 3 FOOT
		final double MILE = 1609; //1 mile = 1609m
		final double SEEMEILE = 1852.01; //1Seemeile = 1852,01m
		
}
