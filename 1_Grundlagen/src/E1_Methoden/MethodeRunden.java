package E1_Methoden;

public class MethodeRunden {
	
	public static int ABSCHNEIDEARITHMETIK = 0;
	public static int RUNDUNGSARITHMETIK = 1;
	
	
	
	
	public static void main(String[] args) {
		//Eingabe
		double zahl = 1.3497356865;
		double zahlGerundet, zahlAbgeschnitten;
		int anzahlStellen=2;
						
		//Verarbeitung
		zahlGerundet = getRoundedNumber(zahl, anzahlStellen);
		zahlAbgeschnitten = getRoundedNumber(zahl, anzahlStellen, ABSCHNEIDEARITHMETIK);
		
		//Ausgabe
		System.out.println();
		System.out.println(zahlAbgeschnitten);
	}

	//Liefert eine Zahl mit einer festgelegten Anzahl von Nachkommastellen
	//Es kann entweder gerunded oder abgeschnitten werden
	private static double getRoundedNumber(double pZahl, int pAnzahlStellen) {
				
		//Komma verschieben um Anzahl Stellen
		pZahl = pZahl * Math.pow(10, pAnzahlStellen);
		
		//letzte Dezimalstelle ab 0.5 aufrunden, sonst abrunden
		pZahl = pZahl + 0.5;
		
		//Nachkommateil abschneiden
		pZahl = (int) pZahl;
		
		//Komma zurueckschieben
		pZahl = pZahl / Math.pow(10, pAnzahlStellen);
				
		return pZahl;
	}
	
	
	//Liefert eine Zahl mit einer festgelegten Anzahl von Nachkommastellen
		//Es kann entweder gerunded oder abgeschnitten werden
		private static double getRoundedNumber(double pZahl, int pAnzahlStellen, int pArithmetik) {
					
			//Komma verschieben um Anzahl Stellen
			pZahl = pZahl * Math.pow(10, pAnzahlStellen);
			
			//letzte Dezimalstelle ab 0.5 aufrunden, sonst abrunden
			if(pArithmetik==RUNDUNGSARITHMETIK){
				pZahl = pZahl + 0.5;
			}
			
			
			//Nachkommateil abschneiden
			pZahl = (int) pZahl;
			
			//Komma zur�ckschieben
			pZahl = pZahl / Math.pow(10, pAnzahlStellen);
					
			return pZahl;
		}

}
