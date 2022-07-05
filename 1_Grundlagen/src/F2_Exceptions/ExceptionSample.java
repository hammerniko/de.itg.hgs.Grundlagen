package F2_Exceptions;
import java.util.Scanner;

public class ExceptionSample {
	
	public static void main(String[] args) {
		//Eingabe
		Scanner s = new Scanner(System.in);
		System.out.println("Zähler:");
		double zaehler=s.nextDouble();
		System.out.println("Nenner:");
		double nenner=s.nextDouble();
		
		double kommazahl=0;
		
			try {
				kommazahl = teile(zaehler, nenner);
			} catch (TeileDurchNullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
       
		System.out.println(kommazahl);
		s.close();
	}
	
	public static double teile(double zaehler, double nenner) throws TeileDurchNullException{
		
		double ergebnis=0;
		if(nenner!=0){
			ergebnis=zaehler/nenner;
		}
		else{
			throw new TeileDurchNullException();
		}		
		return ergebnis;
	}
	
}

class TeileDurchNullException extends Exception{
	
	public TeileDurchNullException() {
	    super("Der Teiler ist 0");
    }
}


