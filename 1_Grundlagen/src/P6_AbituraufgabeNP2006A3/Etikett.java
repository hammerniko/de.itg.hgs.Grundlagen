package P6_AbituraufgabeNP2006A3;

import java.util.Date;
import java.awt.Graphics;
import java.awt.print.*;

public class Etikett implements Printable {

	private String kundenName;
	private String artikelNummer;
	private double rollenGewicht;
	private Date lieferDatum;

	public Etikett(String kundenName, String artikelNummer,
			double rollenGewicht, Date lieferDatum) {
		super();
		this.kundenName = kundenName;
		this.artikelNummer = artikelNummer;
		this.rollenGewicht = rollenGewicht;
		this.lieferDatum = lieferDatum;
	}

	@Override
	public int print(Graphics arg0, PageFormat arg1, int arg2)
			throws PrinterException {
		return 0;
	}

}
