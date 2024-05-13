package A6_Operatoren;
/**
 * Ein rechtwinkliges Dreieck mit a=13, b=10 ist gegeben
 * Berechnen Sie c und die Winkel Alpha und Beta
 * @author hr
 *
 */














public class A64b_Winkelfunktionen_Dreieck {
	
	public static void main(String[] args) {
		//Eingabe
		double a=13;
		double b=10;
		double c;
		double alpha;
		double beta;
		double alphaBogenmass;
		
		//Verarbeiten
		c=Math.sqrt(a*a + b*b);
		
		
			
		//alphaBogenmass = Math.atan(b/a);
		//alpha = alphaBogenmass *360 / (2*Math.PI);
		
		alphaBogenmass = Math.asin(b/c); //cosA = a/c
		alpha = alphaBogenmass *360 / (2*Math.PI);
		
		beta = 90-alpha;
		
		//Ausgabe
		System.out.println("Die Seite \ta\t="+a);
		System.out.println("Die Seite \tb\t="+b);
		System.out.println("Die Seite \tc\t="+c);
		System.out.println("Winkel  \tAlpha\t="+alpha);
		System.out.println("Winkel \t\tBeta\t="+beta);
	}
}
