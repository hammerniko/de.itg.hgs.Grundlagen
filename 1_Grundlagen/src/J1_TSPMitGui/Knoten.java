package J1_TSPMitGui;

public class Knoten {
	
	
	private String name;
	private int x;
	private int y;
	private static int anzahl=0;
	private final char FIRST_CHAR = 'A';
	
	public Knoten(int x, int y){
		
		this.name = ""+(char)(FIRST_CHAR+anzahl);
		this.x = x;
		this.y = y;
		anzahl++;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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



	public static void setAnzahl(int anzahl) {
		Knoten.anzahl = anzahl;
	}
	
	

}
