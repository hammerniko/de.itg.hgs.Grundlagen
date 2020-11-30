package X_PrisonersDilemma;

import E1_Methoden.ggT;

public class PrisonerHammer {
	
	/**
	 * Wertung: Verräter beklommt 2 Punkte 
	 *          Beide verraten nicht  -> Jeder bekommt einen Punkt
	 *          Beide verraten -> keiner bekommt einen Punkt 
	 * 
	 * 
	 * @param pIch
	 * @param pGegner
	 * @return
	 */
	public static boolean entscheidung(boolean[] pIch, boolean[] pGegner) {
		//true  verraten
		//false nicht verraten
		int maxIterates = 400;
		
		//anzahl der bisherigern Durchläufe
		int anz = pIch.length;
				
		//Wenn Gegener mehr als 50% aller iterationen Verrät
		if(gibAnzahlTrue(pGegner)>= 0.51 * anz ) {
			return true;
		}
		
		return false;
		
	}
	
	public static int gibAnzahlTrue(boolean[] p) {
		int anzahl = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i]=true) {
				anzahl++;
			}
		}
		
		return anzahl;
	}

}
