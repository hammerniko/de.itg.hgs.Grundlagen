package P6_AbituraufgabeNP2006A3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

//Damit das Panel gedruckt werden kann, wird die Schnittstelle
//Prinatble implementiert -> Die Methode print() muss überschrieben werden.
public class PanelEtikett extends JPanel implements Printable {

	//Komponenten für die grafische Darstellung
	//der Etikettdaten in einem Panel
	JLabel kn;
	JLabel jLkundenName;
	JLabel an;
	JLabel jLartikelNummer;
	JLabel rg;
	JLabel jLrollenGewicht;
	JLabel ld;
	JLabel jLlieferDatum;

	
	//Konstruktor
	public PanelEtikett(String kundenName, String artikelNummer,
			double rollenGewicht, Date lieferDatum) {
        this.setBackground(Color.white);
		this.setLayout(new GridLayout(2, 4));

		kn = new JLabel("Kundenname:");
		jLkundenName = new JLabel(kundenName);
		this.add(kn);
		this.add(jLkundenName);

		an = new JLabel("ArtikelNummer");
		jLartikelNummer = new JLabel(artikelNummer);
		this.add(an);
		this.add(jLartikelNummer);

		rg = new JLabel("Rollengewicht");
		jLrollenGewicht = new JLabel(""+rollenGewicht);
		this.add(rg);
		this.add(jLrollenGewicht);

		ld = new JLabel("Lieferdatum");
		jLlieferDatum = new JLabel(""+lieferDatum);
		this.add(ld);
		this.add(jLlieferDatum);

		//Drucken des Panels nach der Erstellung
		System.out.println("Drucken getstartet...");
		PageFormat pf = new PageFormat();

		try {
			print(getGraphics(), pf, 1);
		} catch (PrinterException e) {
			// TODO Automatisch generierter Erfassungsblock
			e.printStackTrace();
		}

	}

	@Override
	public int print(Graphics g, PageFormat pf, int pageIndex)
			throws PrinterException {
		if (pageIndex > 0) {
			return Printable.NO_SUCH_PAGE;
		}

		//Skalieren des Panels
		Graphics2D g2d = (Graphics2D) g;
		g2d.translate(pf.getImageableX(), pf.getImageableY());
		g2d.scale(pf.getImageableWidth() / getWidth(), 1.0);

		//Komponente neu zeichnen
		paintComponent(g);
		System.out.println("Druck wird ausgeführt.");
		return Printable.PAGE_EXISTS;
	}
}
