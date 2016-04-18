package H1_GUIEinfachZeichnen;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {
	
	
	//Konstruktor
	public MeinPanel(){
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		//Methode der Oberklasse ausführen
		super.paintComponent(g);
		
		//Zeichnen in der Komponente
		g.drawLine(0,0, 100, 100);
		g.drawOval(50, 50, 100, 100);
		
	}
	
	
	

}
