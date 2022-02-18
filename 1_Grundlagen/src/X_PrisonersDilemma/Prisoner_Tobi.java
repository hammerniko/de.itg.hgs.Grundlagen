package X_PrisonersDilemma;

import java.util.Arrays;
import java.util.Random;

public class Prisoner_Tobi extends Prisoner {

	public boolean entscheidung(boolean[] spieler, boolean[] gegner) {
		final boolean DEBUG = false;
		int res = 0;
		boolean ba[];
		if (gegner.length >= 8) {
			ba = Arrays.copyOfRange(gegner, gegner.length - 8, gegner.length);
			int ggTotalV = 0;

			int lastM8dec = 0;
			int offs = spieler.length - 8 > 0 ? spieler.length - 8 : 0;
			for (; offs < spieler.length; offs++) {
				if (spieler[offs])
					lastM8dec--;
				else
					lastM8dec++;
			}
			if (DEBUG) System.out.println("lastm8: " + lastM8dec);

			for (boolean b : ba) {
				if (b) {
					ggTotalV++;
				} else {
					ggTotalV--;
				}
			}
			if (DEBUG) System.out.println("ggTotalV: " + ggTotalV);
			if (ggTotalV > 5) {
				res++;
			} else if (ggTotalV > 7 && lastM8dec < 3) {
				res--;
			}
		}

		if (res == 0) {
			if (DEBUG) System.out.println("random");
			return new Random().nextBoolean();
		}
		return res > 0;
	}

}
