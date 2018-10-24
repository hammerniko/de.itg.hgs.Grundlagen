package L_VierGewinnt;

import java.awt.Color;



public class Stein {
	
	Color farbe;
	Spieler spieler;
	
	static int anzahlSteine=0;
	int steinNr;
	
	public Stein(Color farbe, Spieler spieler) {
		super();
		anzahlSteine++;
		steinNr=anzahlSteine;
		
		this.farbe = farbe;
		this.spieler = spieler;
	}
	
	
	

}
