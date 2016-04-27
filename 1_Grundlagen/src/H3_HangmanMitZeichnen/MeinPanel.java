package H3_HangmanMitZeichnen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

import javax.swing.JPanel;

public class MeinPanel extends JPanel {

	public static final int LINIENDICKE = 5;
	public static final Color COLOR_HINTERGUND = Color.yellow;
	public static final Color COLOR_KOPF = Color.red;
	public static final Color COLOR_HUEGEL = Color.green;
	public static final Color COLOR_BALKEN = new Color(90, 90, 0);
	public static final int KOPFDICKE = 40;
	public static final int KOERPERLAENGE = 50;
	public static final int MIN_STUFE = 0;
	public static final int MAX_STUFE = 11;
	public static final int RAND_OBEN = 10;
	public static final int SEILLAENGE = 30;
	public static final int BEINLAENGE = 40;
	public static final int ARMLAENGE = 40;
	public static final int HALSLAENGE = 10;
	

	// Objektvariablen
	private int aktuelleStufe; // Zustand des Hangman 0-15
	private int b, h;
	private int aktX, aktY, mitte, mitteRechts, mitteLinks, mitteHalbrechts,
			mitteHalblinks;

	// Konstruktor
	public MeinPanel() {
		aktuelleStufe = MIN_STUFE;
		setBackground(COLOR_HINTERGUND);

	}

	@Override
	protected void paintComponent(Graphics g) {
		// G2D
		Graphics2D g2 = (Graphics2D) g;

		// Liniendicke ändern
		g2.setStroke(new BasicStroke(LINIENDICKE));

		// Methode der Oberklasse ausführen
		super.paintComponent(g2);

		// aktuelle Breite und Höhe speichern
		b = getWidth();
		h = getHeight();

		// Zeichnet den Hangman abhängig von der Stufe
		zeichneLinien(g2);
	}

	private void zeichneLinien(Graphics2D g2D) {
		mitte = b / 2;
		mitteRechts = mitte + b / 4;
		mitteHalbrechts = mitte + b / 8;
		mitteHalblinks = mitte - b / 8;

		aktX = mitteRechts;

		switch (aktuelleStufe) {
		case 11:
			// Bein rechts
			aktY =  SEILLAENGE + KOPFDICKE + HALSLAENGE
					+ KOERPERLAENGE;
			g2D.drawLine(aktX, aktY , aktX + 40, aktY+BEINLAENGE);
		case 10:
			// Bein links
			g2D.drawLine(aktX, 130, aktX - BEINLAENGE, 170);
		case 9:
			// Koerper
			g2D.drawLine(aktX, 80, aktX, 130);
		case 8:
			// Arm rechts
			g2D.drawLine(aktX, 80, aktX + ARMLAENGE, 120);
		case 7:
			// Arm links
			g2D.drawLine(aktX, 80, aktX - ARMLAENGE, 120);
		case 6:
			// Hals
			g2D.drawLine(aktX, 70, aktX, 80);

		case 5:
			// Kopf
			g2D.setColor(COLOR_KOPF);
			aktX = mitteRechts - KOPFDICKE / 2;
			aktY = 4 * RAND_OBEN;
			g2D.fillOval(aktX, aktY, KOPFDICKE, KOPFDICKE);
			g2D.setColor(Color.black);
		case 4:
			// Seil
			g2D.setColor(COLOR_BALKEN);
			g2D.drawLine(mitteRechts, RAND_OBEN, mitteRechts, RAND_OBEN
					+ SEILLAENGE);
		case 3:
			// schraeger Stuetzbalken
			
			g2D.drawLine(mitte, 4 * RAND_OBEN, mitteHalbrechts, RAND_OBEN);
		case 2:
			// waagerechter oberer Balken
			g2D.drawLine(mitte, RAND_OBEN, mitteRechts, RAND_OBEN);
		case 1:
			// Senkrechter Balken
			g2D.drawLine(mitte, RAND_OBEN, mitte, h - RAND_OBEN);
		case 0:
			// Huegel
			g2D.setColor(COLOR_HUEGEL);
			g2D.fillOval(mitteHalblinks, h - RAND_OBEN, b / 4, b / 8);
			break;
		}

	}

	public void erhoeheStufe() {
		if (aktuelleStufe < MAX_STUFE) {
			aktuelleStufe++;
			repaint();
		}
	}

	public void resetStufe() {
		aktuelleStufe = MIN_STUFE;
		repaint();

	}

}
