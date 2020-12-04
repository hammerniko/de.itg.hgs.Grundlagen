package X_PrisonersDilemma;

import java.util.Random;

public class Prisoner_Specht extends Prisoner {
	public boolean entscheidung(boolean[] movePlayer, boolean[] moveEnemy) {
		int trueCount = 0;
		float avg = 50;
		for (int i = 0; i < moveEnemy.length; i++) {
			trueCount += moveEnemy[i] ? 1 : 0;
		}
		try {
			avg = (float) (((float)trueCount / (float)moveEnemy.length) * 100.0);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//System.out.println("Enemy chance of snitching " + avg + "%");
		if (avg > 50) {			
			if (new Random().nextInt(100) < (int)avg) {
				return true;
			} else
				return false;
		}else {
			if (new Random().nextInt(100) > (int)avg) {
				return true;
			} else
				return false;
		}
	}
}
