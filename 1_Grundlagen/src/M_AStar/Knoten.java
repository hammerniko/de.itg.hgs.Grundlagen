package M_AStar;

public class Knoten {

	

	// Position des Knoten im Gitter
	int x, y;

	//Knoten kommt von
	Knoten parent;

	public Knoten(int posX, int posY, Knoten parent) {
		this.parent = parent;
		x = posX;
		y = posY;
	}

	// direkte Entfernung von Hier bis zum Ziel bestimmen
	public int getH() {
		int kosten = 0;

		return kosten;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Knoten getParent() {
		return parent;
	}

	public void setParent(Knoten parent) {
		this.parent = parent;
	}
	
	

}
