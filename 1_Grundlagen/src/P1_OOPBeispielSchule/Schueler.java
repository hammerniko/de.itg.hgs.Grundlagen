package P1_OOPBeispielSchule;

public class Schueler {
	
    //Attribut für Assoziation
    private Schulklasse dieSchulklasse;
    
    private String name;
    private String vorname;
    private String strasse;
    private String hausnummer;
    private int plz;
    private String ort;
    
    
    
    //Standard Konstruktor
    //initialisiert alle Attribute
    private Schueler() {
        
        this.name = "Mustermann";
        this.vorname = "Max";
        this.strasse ="Uhlandstrasse";
        this.hausnummer = "27a";
        this.plz = 78224;
        this.ort = "Singen";
    }
    
    
    public Schueler(String name, String vorname) {
        this(); //muss erster Befehl im Konstruktor sein
        this.name = name;
        this.vorname = vorname;
    }

    public Schueler(String name, String vorname, String strasse,
            String hausnummer, int plz, String ort) {
        this(name,vorname);
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.ort = ort;
    }


    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getStrasse() {
        return strasse;
    }
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }
    public String getHausnummer() {
        return hausnummer;
    }
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }
    public int getPlz() {
        return plz;
    }
    public void setPlz(int plz) {
        this.plz = plz;
    }
    public String getOrt() {
        return ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }


    @Override
    public String toString() {
        String str = this.name+", "+this.vorname+" \n"
                     +this.strasse+" "
                     +this.hausnummer+" \n"
                     +this.plz+" "
                     +this.ort
                     +this.dieSchulklasse+"\n-----";
        
        return str;
    }


    public Schulklasse getSchulklasse() {
    	return dieSchulklasse;
    }


    //Methode zur Herstellung der Assoziation
    //auf ein bestehendes Schulklassenobjekt
    //Sobald ein Schüler einer Schulklasse zugeordnet wird, wird geprüft,
    //ob er schon in einer Klasse war. Ist dies der Fall, wird die Anzahl der Schüler in dieser
    //Klasse um 1 erniedrigt.
    //In der neuen Klasse wird die Anzahl der Schüler dann um 1 erhöht.
	public void setSchulklasse(Schulklasse schulklasse){
    
    	if(this.dieSchulklasse != null){
    	    this.dieSchulklasse.setAnzahlSchueler(this.dieSchulklasse.getAnzahlSchueler()-1);
    	}
    	
    	this.dieSchulklasse = schulklasse;
    	schulklasse.setAnzahlSchueler(schulklasse.getAnzahlSchueler()+1);
    }
 
}
