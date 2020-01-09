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
		Graphics2D g2d = (Graphics2D) g;
		
		
		
		//Zeichnen in der Komponente
		g2d.drawLine(0,0, 100, 100);
		g2d.drawOval(50, 50, 100, 100);
		
	}
	
	
	

}
