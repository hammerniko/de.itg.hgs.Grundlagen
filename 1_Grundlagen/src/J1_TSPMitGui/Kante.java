package J1_TSPMitGui;

public class Kante {
	
	private Knoten k1;
	private Knoten k2;
	private int distanz;
	private boolean istLoesung;
	
	public boolean istLoesung() {
		return istLoesung;
	}

	public void setIstLoesung(boolean istLoesung) {
		this.istLoesung = istLoesung;
	}

	public int getDistanz() {
		return distanz;
	}

	public Kante(Knoten k1, Knoten k2){
		this.k1 = k1;
		this.k2 = k2;
		calcDistanz();
	}

	public int calcDistanz() {
		
		int dX = Math.abs(k1.getX()-k2.getX());
		int dY = Math.abs(k1.getY()-k2.getY());
		distanz = (int) Math.sqrt(dX*dX+dY*dY);
		
		return distanz;
	}

	public Knoten getK1() {
		return k1;
	}

	public Knoten getK2() {
		return k2;
	}

	@Override
	public String toString() {
		return "\nKante [k1=" + k1.getName() + ", k2=" + k2.getName() + ", distanz=" + distanz + "]";
	}

	

}
