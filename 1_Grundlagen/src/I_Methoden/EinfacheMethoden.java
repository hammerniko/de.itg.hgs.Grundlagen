package I_Methoden;


public class EinfacheMethoden {
	
	public static void main(String[] args) {
		
		long z = gibFakultaet(19);
		System.out.println(z);

	}
	
	public static double gibQuadratWurzel(double Zahl){
		double ergebnis=-1;
		ergebnis = Math.sqrt(Zahl);
		return ergebnis;
	}
	
	public static double gibSinus(double Zahl){
		double ergebnis = -1;
		ergebnis = Math.sin(Zahl);
		return ergebnis;
		
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
	
	
	
	

}
