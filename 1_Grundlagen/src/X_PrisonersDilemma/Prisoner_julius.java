package X_PrisonersDilemma;

public class Prisoner_julius extends Prisoner {
	
	boolean vertrauensvorsprung_getroffen = false;
	int vertrauensvorsprung;
	boolean erste_runde = true;
	int erste_runde_entscheidung;
	
	
	public boolean entscheidung (boolean[] ich, boolean [] gegner) {
		
		if (vertrauensvorsprung_getroffen == false) {
			vertrauensvorsprung = (int) (Math.random() *5 +1);
			vertrauensvorsprung_getroffen = true;
		}
		
		if (erste_runde == true) {
			erste_runde = false;
			erste_runde_entscheidung = (int)(Math.random() *2);
			if (erste_runde_entscheidung == 0) {
				return false;
			}
			else if (erste_runde_entscheidung == 1) {
				return true;
			}
			else {
				return false;
			}
		}
		
		if (gegner[gegner.length-1] == true) {
			vertrauensvorsprung --;	
			
		}if ( vertrauensvorsprung > 0) {
			return false;
		}else if (vertrauensvorsprung == 0) {
			vertrauensvorsprung_getroffen = false;
			return true;
		}else {
			return false;
		}
			
	}

}

