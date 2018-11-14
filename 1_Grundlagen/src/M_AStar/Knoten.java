package M_AStar;

public class Knoten{
	
	//Position
	int x,y;
	
	//bekannte Knoten
	Knoten start;
	Knoten ziel;
	Knoten parent;
	
	public Knoten(Knoten parent, Knoten start, Knoten ziel) {
		this.parent =parent;
		this.start = start;
		this.ziel = ziel;
		
	}
	
	//direkte Entfernung von Hier bis zum Ziel bestimmen
	public double getHeuristikKosten() {
		double kosten=0;
		
		
		double dx = Math.abs(this.x-ziel.x);
		double dy = Math.abs(this.y-ziel.y);
		
		kosten = Math.sqrt(dx*dx+ dy*dy);
		
		return kosten;		
	
	}
	
}
