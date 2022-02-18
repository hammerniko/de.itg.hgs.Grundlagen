package X_PrisonersDilemma;

import java.util.Random;

public class Prisoner_Simon_Schlude_test extends Prisoner {

	public static void main(String[] args) {
		int len = 1;
		Random random = new Random();
		boolean[] arr_player = new boolean[len];
		boolean[] arr_enemy = new boolean[len];
		for(int i = 0; i < len; i++) {
		  arr_player[i] = random.nextBoolean();
		  arr_enemy[i] = random.nextBoolean();
		}
		//entscheidung_ss(arr_player, arr_enemy);
	}

	// true = talk
	// false = stay silent

	public boolean entscheidung(boolean[] moves_player, boolean[] moves_enemy) {
		int[] moves_player_calc = new int[moves_player.length];
		int[] moves_enemy_calc = new int[moves_player.length];

		for (int i = 0; i < moves_player.length; i++) {
			moves_player_calc[i] = moves_player[i] == true ? 1 : 0;
			moves_enemy_calc[i] = moves_enemy[i] == true ? 1 : 0;
		}

		int index = moves_player.length - 1;

		Random r = new Random();
		double wp = r.nextDouble();
		double we = r.nextDouble();
		double hi = 0;
		double ot = 0;
		double er = 0;
		double oh = 0;
		int mp;
		int me;

		if (moves_player.length > 1) {
			
			/*
			 * useless code which does not take time into consideration
			 * because it would be to much work.
			 */
			int count = 0;
			
			for (int i = 0; i < moves_player.length - 1; i++) {
				//forward propagation
				mp = moves_player_calc[i];
				me = moves_enemy_calc[i];
				hi = mp * wp + me * we;
				ot = 1 / (1 + Math.pow(Math.E, -hi));			// af = sigmoid
				//System.out.println(ot);
				
				//backpropagation
				er = moves_enemy_calc[i + 1] - ot;
				// System.out.println(er);
				oh = (1 / (1 + Math.pow(Math.E, -hi))) * (1 - 1 / (1 + Math.pow(Math.E, -hi))); // df = sigmodi_deriv
				wp = er * oh * mp *(1);
				we = er * oh * me *(1);
				/*
				if(Math.round(ot) == moves_enemy_calc[i + 1]) {
					count++;
				}
				*/
			}
			//System.out.println(count);
			mp = moves_player_calc[moves_enemy_calc.length - 1];
			me = moves_enemy_calc[moves_enemy_calc.length - 1];
			hi = mp * wp + me * we;
			ot = 1 / (1 + Math.pow(Math.E, -hi));
			return Math.round(ot) == 1 ? true : false;
		}
		
		else {
			return Math.round(r.nextDouble()) == 1 ? true : false;
		}
	}

}
