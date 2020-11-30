package X_PrisonersDilemma;


public class PrisonerPaul {
	
	public static boolean entscheidung(boolean[] pIch, boolean[] pGegner) {
		//true verraten
		//false nicht verraten
		// Wertung:         PIch  |    pGegner  | punkteIch  | punkteGegner
		//               ------------------------------------------------------
		//                  false |    false    |    1       |      1
		//                  false |    true     |    0       |      2
		//                  true  |    false    |    2       |      0
		//                  true  |    true     |    0       |      0
		
		int anzahlGegnerVerraten = 0;
		int anzahlGegnerVerratenderLetzten10 = 0;
		for (int i = 0; i < pGegner.length; i++) {
			if (pGegner[i]) {
				anzahlGegnerVerraten ++;
				if (i >= pGegner.length-10) {
					anzahlGegnerVerratenderLetzten10 ++;
				}
			}
		}
		
		double wahrscheinlichkeitGesammt = 0;
		if (anzahlGegnerVerraten != 0) {
			wahrscheinlichkeitGesammt = anzahlGegnerVerraten/pIch.length;
		}
		double wahrscheinlichkeitletzte10 = 0;
		if (pGegner.length<10 && anzahlGegnerVerraten != 0) {
			wahrscheinlichkeitletzte10 = anzahlGegnerVerratenderLetzten10/pGegner.length;
		}else {
			wahrscheinlichkeitletzte10 = anzahlGegnerVerratenderLetzten10/10;
		}
		if (pGegner.length <= 2) {
			return false;
		}
		if (wahrscheinlichkeitletzte10 <= 0.5 && wahrscheinlichkeitGesammt <= 0.5) {
			return false;
		}
		
		if (anzahlGegnerVerraten == pIch.length || anzahlGegnerVerratenderLetzten10 == 10 || (pGegner.length > 20 && wahrscheinlichkeitGesammt == 1)) {
			return true;
		}
		
		return true;
	}
}
