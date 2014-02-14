package P6_AbituraufgabeNP2006A3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Vector;

public class Steuerung {
	// lokale Variable zur Zwischnspeicherung der Autragsnummer
	private int	            aktuelleAuftragsNummer;
	
	// Assoziationen
	private Oberflaeche	    dieOberflaeche;
	private Vector<Auftrag>	dieAuftraege;
	private Etikett	        dasEtikett;

	// Konstruktor mit Übergabeparameter für die
	// bidirektionale Assoziation zur Oberflaeche
	public Steuerung(Oberflaeche dieOberflaeche) {
		// Assoziationen herstellen
		this.dieOberflaeche = dieOberflaeche;
		
		// Dynamischer Behälter für alle Aufträge erstellen
		dieAuftraege = new Vector<Auftrag>();
		
		// Ein Dummy Auftrag für das zu testende Szenario wird hinzugefügt,
		// damit ein Etikett drucken getestet werden kann.
		// Kunden und Artikel werden später über die Obeflaeche
		// erfasst und ausgewählt
		// Das Bestelldatum wird mit 1.7.2007 angenommen, da es nicht in der
		// Aufgabe formuliert ist.
		Artikel dummyArtikel = new Artikel("40312340", 0.08);
		Kunde dummyKunde = new Kunde(4711, "Huber");
		
		GregorianCalendar cal1 = new GregorianCalendar(2007, 4, 11);
		Date bestelldatum = cal1.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		sdf.format(bestelldatum);
		
		GregorianCalendar cal2 = new GregorianCalendar(2007, 4, 11);
		Date lieferdatum = cal2.getTime();
		sdf.format(lieferdatum);
		
		Auftrag dummyAuftrag = new Auftrag(dummyArtikel, dummyKunde, 1002,
		        2000, 10, lieferdatum, bestelldatum);
		dieAuftraege.add(dummyAuftrag);
	}

	public void erstelleEtikett(int auftragsNummer) {
		if (gibAuftrag(auftragsNummer) != null) {
			dieOberflaeche.zeigeStatus("erstelle Etikett...");
			Auftrag derAuftrag = gibAuftrag(auftragsNummer);
			String kundenName = derAuftrag.gibKundenName();
			Date lieferDatum = derAuftrag.gibLieferDatum();
			String artikelNummer = derAuftrag.gibArtikelNummer();
			double rollenGewicht = derAuftrag.ermittleRollengewicht();
			dasEtikett = new Etikett(kundenName, artikelNummer, rollenGewicht,
			        lieferDatum);
			dieOberflaeche.zeigeEtikett(dasEtikett.getPanelEtikett());
		}
		else{
			dieOberflaeche.zeigeStatus("ungültige Auftragsnummer");
			dieOberflaeche.loescheEtikett();
		}
		
	}

	public Auftrag gibAuftrag(int auftragsnummer) {
		System.out.println("Auftrag mit Auftragsnummer " + auftragsnummer
		        + " holen.");
		Iterator<Auftrag> it = dieAuftraege.iterator();
		while (it.hasNext()) {
			Auftrag auftrag = it.next();
			if (auftrag.getAuftragsNummer() == auftragsnummer) {
				System.out.println("Auftrag " + auftragsnummer + " geholt");
				return auftrag;
			}
		}
		System.out.println("Auftrag existiert nicht");
		return null;
	}
}
