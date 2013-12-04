package P6_AbituraufgabeNP2006A3;

import java.util.Date;

public class Auftrag {
    Artikel derArtikel;
    Kunde derKunde;

    int auftragsNummer;
    double laengenMeter;
    double breiteInMeter;
    Date lieferDatum;
    Date bestellDatum;

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

    public void getAuftrag(Artikel a) {
        derArtikel = a;
    }

    public void getKunde(Kunde k) {
        derKunde = k;
    }

    public String gibArtikelBezeichnung() {

        return derArtikel.gibArtikelBezeichnung();
    }

    public double ermittleRollengewicht() {

        return derArtikel.gibGewichtProQm();
    }

    public String gibKundenName() {
        return derKunde.gibKundenName();

    }

    public Date lieferDatum() {

        return lieferDatum;
    }

}
