package L1_2048;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class Spielstein extends JLabel {
	
	int wert;
	
	//Konstruktor
	public Spielstein(int wert) {
		
		setBackground(Color.YELLOW);
		setOpaque(true);
		setPreferredSize(new Dimension(50,50));
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
		setFont(font);
		setHorizontalAlignment(JLabel.CENTER);
		setWert(wert);
		
	}
	
	
	//Spielstein zeichnen
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		//g.drawLine(0, 0, 100, 200);
	}
	
	public void setWert(int wert) {
		
		//Farbe setzen
		switch (wert) {
		case 2: setBackground(Color.LIGHT_GRAY);break;
		case 4: setBackground(Color.CYAN);break;

		default:
			break;
		}
		
		setText(""+wert);
		
		
	}
	

}
