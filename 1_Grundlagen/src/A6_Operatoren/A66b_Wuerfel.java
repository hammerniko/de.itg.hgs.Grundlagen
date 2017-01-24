package A6_Operatoren;

public class A66b_Wuerfel {

	public static void main(String[] args) {
		//Eingabe
		double zufallszahl = Math.random();
		
		//Verarbeitung
		int wuerfelzahl = (int) (zufallszahl * 6+1);
		
		//Ausgabe
		System.out.println(wuerfelzahl);		
		
		
	}

}
