package X_PrisonersDilemma;

import java.util.ArrayList;
import java.util.Random;

public class Prisoner_Andre extends Prisoner {
	
	private static int debug1 = 0;
	private static int debug2 = 0;
	private static int debug3 = 0;
	private static int debug4 = 0;	
	
	private int analyse = 0;
	private int status = 50;
	
	public void main(String[] args) {
		
		ArrayList<Boolean> spieler = new ArrayList<>();
		ArrayList<Boolean> gegner = new ArrayList<>();
		
		spieler.add(entscheidung(toList(spieler), toList(gegner)));
		gegner.add(new Random().nextBoolean());
		
		for (int i = 0; i < 400; i++) {
			spieler.add(entscheidung(toList(spieler), toList(gegner)));
			gegner.add(new Random().nextBoolean());
			//gegner.add(false);
			//System.out.println(analyse);
		}
		
		int punkteSpieler = 0;
		int punkteGegner = 0;
		for (int i = 0; i < spieler.size(); i++) {
			if(!spieler.get(i) && !spieler.get(i)) {
				punkteSpieler++;
				punkteGegner++;
			} else if(!spieler.get(i) && gegner.get(i)) {
				punkteGegner+=2;
			} else if(spieler.get(i) && !gegner.get(i)) {
				punkteSpieler+=2;
			}
		}
		//System.out.println("Spieler: " + punkteSpieler + " Gegener: " + punkteGegner);
		//System.out.println(debug1 + " " + debug2 + " " + debug3 + " " + debug4);
	}
	
	public boolean entscheidung(boolean[] spieler, boolean[] gegner) {
		if(spieler.length > status) {
			int punkteSpieler = 0;
			int punkteGegner = 0;
			for(int i = 0; i < spieler.length; i++) {
				if(spieler[i]) {
					punkteSpieler++;
				}
				if(gegner[i]) {
					punkteGegner++;
				}
			}
			debug4 = punkteSpieler - punkteGegner;
			if(punkteGegner < status * 0.8) {
				analyse = 1;
			} else if(punkteGegner > status * 0.2) {
				analyse = 2;
			} else {
				analyse = 0;
			}
			status += 50;
		}
		
		if(analyse == 1) {
			return true;
		} else if(analyse == 2) {
			return true;
		}
		
		if(spieler.length == 0) {
			return new Random().nextBoolean();
		} else if(spieler.length >= 2 && spieler[spieler.length - 1] == true && spieler[spieler.length - 2] == false) {
			debug1++;
			return true;
		} else if(spieler.length >= 3 && spieler[spieler.length - 1] == false && spieler[spieler.length - 2] == false && spieler[spieler.length - 3] == false) {
			debug2++;
			return true;
		} else {
			debug3++;
			return new Random().nextBoolean();
		}
	}
	
	public static boolean[] toList(ArrayList<Boolean> array) {
		boolean list[] = new boolean[array.size()];
		for (int i = 0; i < array.size(); i++) {
			list[i] = array.get(i);
		}
		return list;
	}

}
