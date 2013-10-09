package D1_Arrays;
public class Aufgabe1 {

	
	public static void main(String[] args) {
		
		//Direkte initialisierung und Deklaration
		String himmelsrichtung[] = {"Nord","Ost","SŸd","West"};
		
		
		//System.out.println(himmelsrichtung[3]);
		himmelsrichtung[1]="Osten";
		
		
		//Ausgabe des ganzen Arrays
		for (int i = 0; i < himmelsrichtung.length; i++) {
            System.out.println(himmelsrichtung[i]);
        }
		
		
	}

}
