package D1_Arrays;
/**
 * Mit der sequentliellen Suche werden Felder / Listen nach
 * einem gesuchten Wert durchsucht. Wird der Wert in der Liste
 * gefunden, wird der Index an welchem der Wert gefunden wurde zurueckgegeben.
 * 
 * Für die Suche in Listen mir verschiedenen Datentypen kann die
 * Methode suche(..) ueberladen werden. Dies bedeutet, dass die Methode
 * denselben Namen hat, aber sich in den Uerbgabeparametern / dem Rueckgabewert
 * unterscheidet.
 * Ueberladen wird in der OOP auch als statische Polymorphie
 * bezeichnet. D.h. der Compiler erkennt welche Methode
 * er ausführen muss, bereits vor der Ausführung des Codes.
 */

public class SequentielleSuche {
	

	public static void main(String[] args) {
		
		//An welcher Position steht in der 
		//Liste z1 die 0, z2 die 4, z3 die 3.5 und land 
		//der Wert "Russland".
		//Ermitteln Sie den Index jeweils mit der sequentiellen Suche
		int[] 		z1 		= {5,5,1,3,9,0,12,16,5};
		int[] 		z2 		= {1,2,3,4,5,6};
		double[] 	z3		= {2.1, 3.5, 4.1}; 
		String[]    land 	= {"Deutschland", "Russland", "Kasachstan"};
		
		//2.) index ermitteln
		int index1 = suche(0, z1);
		int index2 = suche(4, z2);
		int index3 = suche(3.5, z3);
		int index4 = suche("Russland", land);
		
		
		//3.) index ausgeben
		System.out.println("0   in z1 steht bei index="+index1);
		System.out.println("4   in z2 steht bei index="+index2);
		System.out.println("3.5 in z3 steht bei index="+index3);
		System.out.println("Russland in land steht bei index="+index4);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//1.) Methode für sequentlielle Suche
	public static int suche(int gesWert, int[] liste) {
		
		//Durchsuche die gesamte Liste
		for (int index = 0; index < liste.length; index=index+1) {
			
			//Wenn der gesuchte Wert gefunden wird
			if(liste[index] == gesWert) {
				
				//gib den Index zurück
				return index;
			}
		}
		
		
		//Wenn kein Wert gefunden wurde
		return -1;
	}
	
	
	//überladene Methode für sequentlielle Suche
	public static int suche(double gesWert, double[] liste) {
			
			//Durchsuche die gesamte Liste
			for (int index = 0; index < liste.length; index=index+1) {
				
				//Wenn der gesuchte Wert gefunden wird
				if(liste[index] == gesWert) {
					
					//gib den Index zurück
					return index;
				}
			}
			
			
			//Wenn kein Wert gefunden wurde
			return -1;
		}
		
		
		
		
		//überladene Methode für sequentlielle Suche (Texte)
		public static int suche(String gesWert, String[] liste) {
					
					//Durchsuche die gesamte Liste
					for (int index = 0; index < liste.length; index=index+1) {
						
						//Wenn der gesuchte Wert gefunden wird
						if(liste[index].equals(gesWert)) {
							
							//gib den Index zurück
							return index;
						}
					}
					
					
					//Wenn kein Wert gefunden wurde
					return -1;
				}	
		
		
		
		

}
