package A5_Eingabe;

public interface Laengeneinheiten {

	    //Einheiten bezogen auf Meter
	    final double METER_IN_MILLIMETER = 1000;
		final double METER_IN_ZENTIMETER = 100;
		final double METER_IN_KILOMETER = 1.0/1000;
		
		final double METER_IN_INCH = 1.0/2.54e-2;  //1 inch (Zoll) = 2,54cm
		final double METER_IN_FOOT = 1.0/30.48e-2; //1 foot = 30,48cm
		final double METER_IN_YARD = METER_IN_FOOT/3; //1 yard = 3 FOOT
		final double METER_IN_MILE = 1.0/1609; //1 mile = 1609m
		final double METER_IN_SEEMEILE = 1.0/1852.01; //1Seemeile = 1852,01m
		
}
