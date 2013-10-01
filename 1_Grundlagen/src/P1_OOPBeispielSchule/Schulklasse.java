package P1_OOPBeispielSchule;

public class Schulklasse {
	
	private String klassenname;
	private String beschreibung;

	public Schulklasse(String klassenname) {
	    super();
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
	    str = "\nKlasse:"+klassenname + " " + beschreibung;
	    return str;
    }
	
	
}
