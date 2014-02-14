package P6_AbituraufgabeNP2006A3;

import java.util.Date;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.*;

public class Etikett {

	private String kundenName;
	private String artikelNummer;
	private double rollenGewicht;
	private Date lieferDatum;
	private PanelEtikett panelEtikett;

	public PanelEtikett getPanelEtikett() {
    	return panelEtikett;
    }

	public Etikett(String kundenName, String artikelNummer,
			double rollenGewicht, Date lieferDatum) {
		this.kundenName = kundenName;
		this.artikelNummer = artikelNummer;
		this.rollenGewicht = rollenGewicht;
		this.lieferDatum = lieferDatum;

		System.out.println("Etikettobjekt erstellt");
		
		panelEtikett = new PanelEtikett(kundenName, artikelNummer,
				rollenGewicht, lieferDatum);

	}

}
