package A6_Operatoren;
/**
 * Ein rechtwinkliges Dreieck mit a=7, b=5 ist gegeben
 * Berechnen Sie c und den Winkel Alpha
 * @author hr
 *
 */
public class A64_Winkelfunktionen_Dreieck {
	
	public static void main(String[] args) {
		//Eingabe
		double a=7;
		double b=5;
		double c;
		double alpha;
		double beta;
		double alphaBogenmass;
		
		//Verarbeiten
		c=Math.sqrt(a*a + b*b);
		alphaBogenmass = Math.atan(b/a);
		alpha = alphaBogenmass *360 / (2*Math.PI);
		beta = 90-alpha;
		
		//Ausgabe
		System.out.println("Die Seite \ta\t="+a);
		System.out.println("Die Seite \tb\t="+b);
		System.out.println("Die Seite \tc\t="+c);
		System.out.println("Winkel \t\tAlpha\t="+alpha);
		System.out.println("Winkel \t\tBeta\t="+beta);
	}

}
