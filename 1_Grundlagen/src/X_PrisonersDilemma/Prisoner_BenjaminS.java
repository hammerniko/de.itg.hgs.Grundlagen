package X_PrisonersDilemma;

public class Prisoner_BenjaminS extends Prisoner {
	public boolean entscheidung(boolean[] p, boolean[] q) {
		if(p.length>0)
			return !(p[p.length-1] == q[q.length-1]) | true;
		return true;
	}
}

