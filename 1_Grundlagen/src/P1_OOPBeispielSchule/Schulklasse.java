package P1_OOPBeispielSchule;

public class Schulklasse {
	
	private String klassenname;
	private String beschreibung;
	private int anzahlSchueler;

	public Schulklasse(String klassenname) {
	    this.klassenname = klassenname;
    }

	public String getKlassenname() {
    	return klassenname;
    }

	public void setKlassenname(String klassenname) {
    	this.klassenname = klassenname;
    }

	public String getBeschreibung() {
    	return beschreibung;
    }

	public void setBeschreibung(String beschreibung) {
    	this.beschreibung = beschreibung;
    }

	@Override
    public String toString() {
	    String str;
	    str = "\n"+"Klasse:"+klassenname + " ("+anzahlSchueler+" Schüler) \n" + beschreibung;
	    return str;
    }

    public int getAnzahlSchueler() {
        return anzahlSchueler;
    }

    public void setAnzahlSchueler(int anzahlSchueler) {
        this.anzahlSchueler = anzahlSchueler;
    }
	
	
}
