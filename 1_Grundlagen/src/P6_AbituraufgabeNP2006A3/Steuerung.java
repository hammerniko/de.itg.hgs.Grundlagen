package P6_AbituraufgabeNP2006A3;
import java.util.Date;
import java.util.Vector;

public class Steuerung {
	// lokale Variable zur Zwischnspeicherung der Autragsnummer
	int	            aktuelleAuftragsNummer;
	
	// Assoziationen
	Oberflaeche	    dieOberflaeche;
	Vector<Auftrag>	dieAuftraege;
	Etikett dasEtikett;

	// Konstruktor mit Übergabeparameter für die
	// bidirektionale Assoziation zur Oberflaeche
	public Steuerung(Oberflaeche dieOberflaeche) {
		// Assoziationen herstellen
		this.dieOberflaeche = dieOberflaeche;
		// Dynamischer Behälter für alle Aufträge erstellen
		dieAuftraege = new Vector<Auftrag>();
		
		
		//Ein Dummy Auftrag für das zu testende Szenario wird hinzugefügt,
		//damit ein Etikett drucken getestet werden kann.
		//Kunden und Artikel werden später über die Obeflaeche
		//erfasst und ausgewählt
		//Das Bestelldatum wird mit 1.7.2007 angenommen, da es nicht in der Aufgabe formuliert ist.
		Artikel dummyArtikel = new Artikel("40312340", 80);
		Kunde dummyKunde = new Kunde(4711, "Huber");
		Auftrag dummyAuftrag = new Auftrag(dummyArtikel, dummyKunde, 1002, 2000, 10, new Date("20.11.2007"), new Date("01.11.2007"));
		
		dieAuftraege.add(dummyAuftrag);
	}
	

	public void erstelleEtikett(int auftragsNummer) {
		Auftrag derAuftrag = dieAuftraege.get(auftragsNummer);
		String kundenName = derAuftrag.gibKundenName();
		Date lieferDatum = derAuftrag.gibLieferDatum();
		String artikelNummer = derAuftrag.gibArtikelNummer();
		double rollenGewicht = derAuftrag.ermittleRollengewicht();
		dasEtikett = new Etikett(kundenName, artikelNummer, rollenGewicht, lieferDatum);
		
	}


	
}
