package P6_AbituraufgabeNP2006A3;

import java.util.Date;
import java.util.Vector;


public class Steuerung {

	int aktuelleAuftragsNummer;
	Oberflaeche dieOberflaeche;
	Vector <Auftrag> dieAuftraege;
	static int anzahlAuftraege;
		
	public Steuerung(Oberflaeche dieOberflaeche) {
		this.dieOberflaeche = dieOberflaeche;
		dieAuftraege = new Vector <Auftrag>();
	}

	public static void erstelleAuftrag(double laengeInMeter, double breiteInMeter, Date lieferDatum){
	Date bestellDatum = new Date();
	   //addAuftrag(new Auftrag(laengeInMeter, breiteInMeter, lieferDatum, bestellDatum));
	}


	public static void erstelleEtikett(int auftragsNummer){
		//derAuftrag = getAuftrag(auftragsNummer);
		//String kundenName = derAuftrag.gibKundenName();
		//Date lieferDatum = derAuftrag.gibLieferDatum();
		//String artikelNummer = derAuftrag.gibArtikelNummer();
		//double rollenGewicht = derAuftrag.ermittleRollenGewicht();
		
		//dasEtikett = new Etikett(kundeName, artikelNummer, rollenGewicht, lieferDatum);
	}

	public String getKundenName(int auftragsNummer){
		Auftrag derAuftrag;
		derAuftrag = getAuftrag(auftragsNummer);
		return derAuftrag.gibKundenName();
	}
	
	public Date getLieferDatum(int auftragsNummer){
		Auftrag derAuftrag;
		derAuftrag = getAuftrag(auftragsNummer);
		return derAuftrag.gibLieferDatum();
	}
	
	public String getArtikelNummer(int auftragsNummer){
		Auftrag derAuftrag;
		//derAuftrag = getAuftrag(auftragsNummer);
		//return derAuftrag.gibArtikelNummer();
	}
	
	public String getRollenGewicht(int auftragsNummer){
		Auftrag derAuftrag;
		//derAuftrag = getAuftrag(auftragsNummer);
		return derAuftrag.ermittleRollenGewicht();
	}
	
	public void addAuftrag(Auftrag auftrag){
	anzahlAuftraege++;
	//auftrag.setAuftragsnummer(anzahlAuftraege);
	dieAuftraege.add(auftrag);
	}
	
	public Auftrag getAuftraege(int auftragsnummer){
		return dieAuftraege.get(auftragsnummer);
	}
	
	public void remove(Auftrag auftrag){
		dieAuftraege.remove(auftrag);
	}
}
