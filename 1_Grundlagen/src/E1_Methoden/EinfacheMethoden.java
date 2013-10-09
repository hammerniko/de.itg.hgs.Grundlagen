package E1_Methoden;

import java.math.BigInteger;


public class EinfacheMethoden {
	
	public static void main(String[] args) {
		
		BigInteger z = fak(20150);
		System.out.println(z);

	}
	
	public static double gibQuadratWurzel(double Zahl){
		double ergebnis=-1;
		ergebnis = Math.sqrt(Zahl);
		return ergebnis;
	}
	
	public static double gibSinus(double zahl){
		double winkel =  zahl* Math.PI / 180d ;
		double sinus = Math.sin(winkel);
		return sinus;
	}
	
	public static double gibXhochY(double x, double y){
		double ergebnis=-1;
		ergebnis = Math.pow(x,y);
		return ergebnis;
				
	}
	
	public static long  gibFakultaet(int zahl){
		int ergebnis = 1;
		for (int i = 2; i <= zahl; i++) {
			ergebnis = i * ergebnis;
		}
		return ergebnis;
	}
	
	public static double negieren(double zahl){
	    return zahl *-1;
	}
	
	public static double betrag(double zahl){
	    return Math.abs(zahl);
	}
	
	public static BigInteger fak( int n )
	  {
	    BigInteger big = BigInteger.ONE;
	    if ( n == 0 || n == 1 )
	      return big;
	    if ( n > 1 )
	      for ( int i = 1; i <= n; i++ )
	        big = big.multiply( BigInteger.valueOf(i) );
	    return big;
	  }
	 
	}
	
	



