package P6_AbituraufgabeNP2006A3;
import java.util.Date;

public class Auftrag {
	private Artikel	derArtikel;
	private Kunde	derKunde;
	private int	    auftragsNummer;
	private double	laengenMeter;
	private double	breiteInMeter;
	private Date	lieferDatum;
	private Date	bestellDatum;

	public int getAuftragsNummer() {
    	return auftragsNummer;
    }

	public void setAuftragsNummer(int auftragsNummer) {
    	this.auftragsNummer = auftragsNummer;
    }

	public double getLaengenMeter() {
    	return laengenMeter;
    }

	public void setLaengenMeter(double laengenMeter) {
    	this.laengenMeter = laengenMeter;
    }

	public double getBreiteInMeter() {
		System.out.println("Breite"+breiteInMeter+" geholt");
    	return breiteInMeter;
    }

	public void setBreiteInMeter(double breiteInMeter) {
    	this.breiteInMeter = breiteInMeter;
    }

	public Date getLieferDatum() {
    	return lieferDatum;
    }

	public void setLieferDatum(Date lieferDatum) {
    	this.lieferDatum = lieferDatum;
    }

	public Date getBestellDatum() {
    	return bestellDatum;
    }

	public void setBestellDatum(Date bestellDatum) {
    	this.bestellDatum = bestellDatum;
    }

	public Auftrag(Artikel derArtikel, Kunde derKunde, int auftragsNummer,
	        double laengenMeter, double breiteInMeter, Date lieferDatum,
	        Date bestellDatum) {
		super();
		this.derArtikel = derArtikel;
		this.derKunde = derKunde;
		this.auftragsNummer = auftragsNummer;
		this.laengenMeter = laengenMeter;
		this.breiteInMeter = breiteInMeter;
		this.lieferDatum = lieferDatum;
		this.bestellDatum = bestellDatum;
	}

	public String gibArtikelNummer() {
		return derArtikel.gibArtikelNummer();
	}

	public void getKunde(Kunde k) {
		derKunde = k;
	}

	public String gibArtikelBezeichnung() {
		return derArtikel.gibArtikelBezeichnung();
	}

	public double ermittleRollengewicht() {
		double rollenGewicht = laengenMeter * breiteInMeter * derArtikel.gibGewichtProQm();
		System.out.println("Rollengweicht = "+rollenGewicht+ " ermittelt");
		return rollenGewicht;
	}

	public String gibKundenName() {
		System.out.println("Kundenname geholt");
		return derKunde.gibKundenName();
	}

	public Date gibLieferDatum() {
		System.out.println("Lieferdatum geholt");
		return lieferDatum;
	}
}
