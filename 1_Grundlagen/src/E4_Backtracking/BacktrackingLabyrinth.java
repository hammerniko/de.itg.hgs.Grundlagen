package E4_Backtracking;

public class BacktrackingLabyrinth {
	
	//Start
	public static final int S = 2;
	
	
	
	

	public static void main(String[] args) {
		int[][] lab = { 
				{ 1, 0, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 0, 1, 0, 0, 0, 0, 1 },
				{ 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 },
				{ 1, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 0, 1, 0, 1 }, { 1, 0, 0, 1, 1, 1, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, { 1, 0, 0, 1, 1, 0, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0, 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0, 0, 0, 0, 0, 1 },
				{ 1, 0, 0, 1, 0, 0, 1, 1, 0, 1 }, { 1, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, { 1, 0, 0, 1, 0, 1, 0, 1, 0, 1 },
				{ 1, 0, 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 0, 1, 1, 1, 0, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, { 1, 0, 1, 1, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 1, 0, 0, 1, 0, 0, 0, 1 }, { 1, 0, 1, 0, 1, 1, 0, 1, 0, 1 }, { 1, 1, 1, 0, 0, 0, 0, 1, 0, 1 },
				{ 1, 0, 0, 0, 1, 1, 1, 1, 0, 1 }, { 1, 0, 1, 0, 0, 0, 0, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 0, 1, 0, 0 } };

		int x = 1;
		int y = 0;
		boolean end = navigate(lab, y, x);

		if (end) {
			System.out.println("Es wurde ein Ausweg gefunden!");
		} else {
			System.out.println("Es wurde kein Ausweg gefunden!");
		}

		for (int k = 0; k < lab.length; k++) {
			for (int l = 0; l < lab[k].length; l++) {
				System.out.print(lab[k][l] + "  ");
			}
			System.out.println();
		}
	}

	public static boolean navigate(int[][] lab, int y, int x) {
		boolean way = true;

		int right = x + 1;
		int left = x - 1;
		int down = y + 1;
		int up = y - 1;

		// Wenn Ziel erreicht
		if (y == lab.length - 1 || x == lab[0].length - 1) {
			return way;
		}

		else {
			//Wenn rechts frei
			if (lab[y][right] == 0) {
				lab[y][right] = 8;
				return navigate(lab, y, right);
			}
			
			//Wenn unten frei
			if (lab[down][x] == 0) {
				lab[down][x] = 8;
				return navigate(lab, down, x);
			}
			
			//Wenn links frei 
			if (lab[y][left] == 0) {
				lab[y][left] = 8;
				return navigate(lab, y, left);
			}
			
			//Wenn oben frei
			if (lab[up][x] == 0) {
				lab[up][x] = 8;
				return navigate(lab, up, x);
			}
		}

		//Wenn in Sackgasse
		return false;
	}
}