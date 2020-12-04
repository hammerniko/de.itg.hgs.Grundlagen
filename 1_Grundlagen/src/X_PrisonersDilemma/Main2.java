package X_PrisonersDilemma;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.stream.FileImageOutputStream;

public class Main2 {

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
		final int arrlen = 11;
		final int nMatches = 5;
		StringBuilder s = new StringBuilder();
		
		for (int n = 0; n < nMatches; n++) {
			for (int i = 0; i < arrlen - 1; i++) {
				for (int j = i+1; j < arrlen; j++) {
					Prisoner prisoners[] = {
							new Prisoner_BenjaminS(),
							new Prisoner_DQ(),
							new Prisoner_JS(),
							new Prisoner_julius(),
							new Prisoner_Specht(),
							new PrisonerHammer(),
							new PrisonerJC(),
							new PrisonerNoah(),
							new Prisoner_Andre(),
							new Prisoner_Simon_Schlude_test(),
							new Prisoner_Tobi()
					};
					s.append(playMatch(prisoners[i], prisoners[j]) + "\n");
				}
			}
		}
		try {
			new FileWriter("out.csv").write(s.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static String playMatch(Prisoner prisoner1, Prisoner prisoner2) {
		ArrayList<Boolean> playerOne = new ArrayList<>();
		ArrayList<Boolean> playerTwo = new ArrayList<>();
		
		int scoreP1 = 0;
		int scoreP2 = 0;
		
		for (int i = 0; i < 400; i++) {
			boolean[] p1Bools = getArray(playerOne);
			boolean[] p2Bools = getArray(playerTwo);
			boolean p1,p2;
			try {
				p1 = prisoner1.entscheidung(p1Bools, p2Bools);
			} catch (Exception e) {
				e.printStackTrace();
				scoreP1 = -1;
				break;
			}
			try {
				p2 = prisoner2.entscheidung(p1Bools, p2Bools);
			} catch (Exception e) {
				e.printStackTrace();
				scoreP2 = -1;
				break;
			}
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
		return prisoner1.getClass().getSimpleName()+"," + scoreP1+","+prisoner2.getClass().getSimpleName()+"," + scoreP2;
	}
	
}
