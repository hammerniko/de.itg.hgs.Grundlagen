package J1_TSPMitGui;

public class Kante {
	
	private Knoten k1;
	private Knoten k2;
	private int distanz;
	
	public Kante(Knoten k1, Knoten k2){
		this.k1 = k1;
		this.k2 = k2;
	}

	public int getDistanz() {
		
		int dX = Math.abs(k1.getX()-k2.getX());
		int dY = Math.abs(k1.getY()-k2.getY());
		distanz = (int) Math.sqrt(dX*dX+dY*dY);
		
		return distanz;
	}

	

}
