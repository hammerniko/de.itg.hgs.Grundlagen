package M_AStar;

public class Grid {
	
	
	public static final int FREI = 0;
	public static final int HINDERNIS = 1;
	public static final int START = 2;
	public static final int ZIEL = 3;

	int anzX, anzY;
	int[][] map;

	public Grid(int x, int y) {
		anzX = x;
		anzY = y;
		map = new int[anzX][anzY];
		initMap();
	}

	public void initMap() {
		for (int reihe = 0; reihe < anzY; reihe++) {
			for (int spalte = 0; spalte < anzX; spalte++) {
				map[spalte][reihe] = 0;
			}
		}
	}

	public void addHindernis(int x, int y) {
		if (x <= anzX && y <= anzY) {
			map[x][y] = HINDERNIS;
		}
	}

	public void ausgabeGrid() {
		for (int reihe = 0; reihe < anzY; reihe++) {
			System.out.println();
			for (int spalte = 0; spalte < anzX; spalte++) {
				System.out.print(map[spalte][reihe] + " ");
			}
		}
	}

	
	
	

	public void setZiel(Knoten ziel) {
		map[ziel.getX()][ziel.getY()]=ZIEL;
	}

	public void setStart(Knoten start) {
		map[start.getX()][start.getY()]=START;
	}
}
