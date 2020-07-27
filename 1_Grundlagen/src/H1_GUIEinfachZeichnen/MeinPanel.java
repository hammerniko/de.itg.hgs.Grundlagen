package H1_GUIEinfachZeichnen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {
	
	
	//Konstruktor
	public MeinPanel(){
		setBackground(Color.yellow);
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		
		//Methode der Oberklasse ausfuehren
		super.paintComponent(g);
		
		//Mehr 2d Möglichkeiten
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(Color.green);
		
		//Zeichnen in der Komponente
		g2d.drawLine(0,0, 100, 100);
		
		g2d.fillOval(200, 200, 50, 70);
		
		g2d.setColor(Color.BLUE);
		
		g2d.fillRect(50, 50, 100, 100);		
		
		
	}
	
	
	
}
