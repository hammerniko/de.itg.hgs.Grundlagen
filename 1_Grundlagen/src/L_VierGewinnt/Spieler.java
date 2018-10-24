package L_VierGewinnt;

import java.awt.Color;

/*
 * Jeder Spieler hat einen Namen und 21 Spielsteine
 */
public class Spieler {
	
	String name;
	Stein steine[];
	Color steinfarbe;
	
	public Spieler(String name, Color farbe) {
		this.name = name;
		steinfarbe = farbe;
		erzeugeSteine();
		
		
	}

	private void erzeugeSteine() {
		steine = new Stein[21];
		for (int i = 0; i < steine.length; i++) {
			steine[i] = new Stein(steinfarbe, this);
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
