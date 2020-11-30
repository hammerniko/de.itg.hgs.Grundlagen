package X_PrisonersDilemma;

public class Prisoner_JS {

	public static boolean entscheidung(boolean[] pIch, boolean[] pGegner) {

		int[] array = new int[pIch.length];
		int zwischenwert = 0;
		int wert = 0;

		for (int i = 0; i < pGegner.length; i++) {
			if (pIch[i] == false && pGegner[i] == false) {
				array[i] = 1;
			}
			if (pIch[i] == false && pGegner[i] == true) {
				array[i] = 0;
			}
			if (pIch[i] == true && pGegner[i] == true) {
				array[i] = 0;
			}
			if (pIch[i] == true && pGegner[i] == false) {
				array[i] = 2;
			}
		}

		if (array.length >= 4) {
			for (int i = array.length - 4; i < array.length; i++) {
				zwischenwert = zwischenwert + array[i];
				wert = zwischenwert / 4;
			}
		}

		if (wert > 1.5) {
			return true;
		}
		if (wert > 1 && wert < 1.5) {
			return false;
		}
		if (wert < 1) {
			return true;
		} else
			return false;

	}

}
