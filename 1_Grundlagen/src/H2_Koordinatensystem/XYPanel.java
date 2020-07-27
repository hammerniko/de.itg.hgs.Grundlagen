package H2_Koordinatensystem;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class XYPanel extends JPanel {

	private static final float LINIENDICKE_STARK = 2;
	private static final float LINIENDICKE_DUENN = 1;
	
	private int breite;
	private int hoehe;
	private int skalierung;
	private int skalierungkaro;

	public XYPanel() {
		skalierung = 40;
		skalierungkaro = 20;
		setBackground(Color.WHITE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// Ausführen der originalen Mehtode in der Oberklasse
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		// Liniendicke Aendern
		g2.setStroke(new BasicStroke(LINIENDICKE_DUENN));

		breite = getWidth();
		hoehe = getHeight();

		// KaroMuster
		g.setColor(Color.lightGray);
		for (int x = breite / 2; x < breite; x = x + skalierungkaro) {
			g.drawLine(x, 0, x, hoehe);
		}

		for (int x = breite / 2; x > 0; x = x - skalierungkaro) {
			g.drawLine(x, 0, x, hoehe);
		}

		for (int y = hoehe / 2; y < hoehe; y = y + skalierungkaro) {
			g.drawLine(0, y, breite, y);
		}

		for (int y = hoehe / 2; y > 0; y = y - skalierungkaro) {
			g.drawLine(0, y, breite, y);
		}

		g.setColor(Color.BLACK);

		

		// Liniendicke Aendern
		g2.setStroke(new BasicStroke(LINIENDICKE_STARK));
		// x-Linie zeichnen
		g2.drawLine(0, hoehe / 2, breite, hoehe / 2);

		// y-Linie zeichnen
		g2.drawLine(breite / 2, 0, breite / 2, hoehe);

		// Pfeilspitze in x-Richtung
		g.drawString("x", breite - 20, (hoehe / 2) + 20);
		g.drawLine(breite - 10, (hoehe / 2) - 5, breite, hoehe / 2);
		g.drawLine(breite - 10, (hoehe / 2) + 5, breite, hoehe / 2);

		// Pfeilspitze in y-Richtung
		g.drawString("y", (breite / 2) - 20, 20);
		g.drawLine(breite / 2 - 5, +10, breite / 2, 0);
		g.drawLine(breite / 2 + 5, +10, breite / 2, 0);

		// Skalierung in X-Richtung
		for (int x = breite/2; x < breite; x=x+skalierung) {
			g.drawLine(x, (hoehe/2)+5, x, (hoehe/2)-5);
			
		}

		// Skalierung in y-Richtung

	}

}
