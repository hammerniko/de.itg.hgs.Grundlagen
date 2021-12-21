package A4_Konstante;

public class KonstanteAusFunktionen {

	public static void main(String[] args) {
		
		//Flaeche eines Kreises
		//Eingabe
		double radius = 1.5;
		double kreisFlaeche;
		double kreisUmfang;
		
		//Verarbeitung
		kreisFlaeche = Math.PI * Math.pow(radius, 2);
		kreisUmfang = 2 * Math.PI * radius;
				
		//Ausgabe
		System.out.println("Kreisflaeche\t= "+kreisFlaeche);
		System.out.println("Kreisumfang\t= "+kreisUmfang);
		

	}

}
