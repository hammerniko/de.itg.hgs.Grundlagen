package X_PrisonersDilemma;
import java.util.Random;

public class PrisonerNoah extends Prisoner {

	// true / true 0/0
	// false / true 0/2
	// false/false 1/1

	public static boolean entscheideNoah(boolean[] pIch, boolean[] pGegner) {

		if (pIch.length == 0 && pGegner.length == 0) {
			return true;
		} else if (pIch.length > 370) {
			return true;
		} else {
			return pGegner[pGegner.length - 1];
		}

	}
	
	
	public boolean entscheidung(boolean[] pIch, boolean[] pGegner) {

		Random r = new Random();
		int random = r.nextInt(10);
		
		if(random < 7) {
			return true;
		}else {
			return false;
		}

	}
	

}
