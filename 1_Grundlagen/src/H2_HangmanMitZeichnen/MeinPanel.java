package H2_HangmanMitZeichnen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {

	// Objektvariablen
	private int aktuelleStufe; // Zustand des Hangman 0-15
	private int b, h;

	// Konstruktor
	public MeinPanel() {
		aktuelleStufe = 11;
		setBackground(Color.yellow);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// G2D
		Graphics2D g2 = (Graphics2D) g;

		// Liniendicke ändern
		g2.setStroke(new BasicStroke(5));

		// Methode der Oberklasse ausführen
		super.paintComponent(g2);

		// aktuelle Breite und Höhe speichern
		b = getWidth();
		h = getHeight();

		// Zeichnet den Hangman abhängig von der Stufe
		zeichneLinien(aktuelleStufe, g2);
	}

	private void zeichneLinien(int s, Graphics g) {
		switch (s) {
		case 11:
			g.drawLine(b / 2 + b / 4, 130, b / 2 + b / 4 + 40, 170);
		case 10:
			g.drawLine(b / 2 + b / 4, 130, b / 2 + b / 4 - 40, 170);
		case 9:
			g.drawLine(b / 2 + b / 4, 80, b / 2 + b / 4, 130);
		case 8:
			g.drawLine(b / 2 + b / 4, 80, b / 2 + b / 4 + 40, 120);
		case 7:
			g.drawLine(b / 2 + b / 4, 80, b / 2 + b / 4 - 40, 120);
		case 6:
			g.drawLine(b / 2 + b / 4, 70, b / 2 + b / 4, 80);
			g.setColor(Color.red);
		case 5:
			g.fillOval(b / 2 + b / 4 - 20, 30, 40, 40);
			g.setColor(Color.black);
		case 4:
			g.drawLine(b / 2 + b / 4, 10, b / 2 + b / 4, 30);
		case 3:
			g.drawLine(b / 2, h - b / 2, b / 2 + b / 8, 10);
		case 2:
			g.drawLine(b / 2, 10, b / 2 + b / 4, 10);
		case 1:
			g.drawLine(b / 2, 10, b / 2, h - 10);
		case 0:
			g.drawOval(b / 2 - b / 8, h - 10, b / 4, b / 8);
			break;
		}
	}

	public void erhoeheStufe() {
		aktuelleStufe++;
	}

}
