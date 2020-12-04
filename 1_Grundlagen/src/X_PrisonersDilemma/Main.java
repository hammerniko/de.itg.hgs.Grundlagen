package X_PrisonersDilemma;

import java.util.ArrayList;

public class Main {

	public static boolean entscheidung1(boolean[] pIch, boolean[] pGegner) {
		return Prisoner_JS.entscheidung(pIch, pGegner);
	}
	
	public static boolean entscheidung2(boolean[] pIch, boolean[] pGegner) {
		return PrisonerNoah.entscheideAnastasia(pIch, pGegner);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	private static boolean[] getArray(ArrayList<Boolean> playerOne) {
		Boolean[] _b1 = new Boolean[playerOne.size()];
		playerOne.toArray(_b1);
		boolean[] b1 = new boolean[playerOne.size()];
		for (int j = 0; j < b1.length; j++) {
			b1[j] = _b1[j];
		}
		return b1;
	}
	
	public static void main(String[] args) {
		ArrayList<Boolean> playerOne = new ArrayList<>();
		ArrayList<Boolean> playerTwo = new ArrayList<>();
		
		int scoreP1 = 0;
		int scoreP2 = 0;
		
		for (int i = 0; i < 400; i++) {
			boolean[] p1Bools = getArray(playerOne);
			boolean[] p2Bools = getArray(playerTwo);

			boolean p1 = entscheidung1(p1Bools, p2Bools);
			boolean p2 = entscheidung2(p2Bools, p1Bools);
			playerOne.add(p1);
			playerTwo.add(p2);
			
			if(p1 == true && p2 == true)
				continue;
			if(p1 != p2) {
				if(p1 == true) {
					scoreP1 += 2;
				} else {
					scoreP2 += 2;
				}
				continue;
			}
			scoreP1 += 1;
			scoreP2 += 1;
		}
		
		System.out.println("PlayerOne: " + scoreP1);
		System.out.println("PlayerTwo: " + scoreP2);
	}
	
}
