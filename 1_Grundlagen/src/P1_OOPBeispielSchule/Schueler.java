package P1_OOPBeispielSchule;

public class Schueler {
	
    private Schulklasse schulklasse;
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
                     +this.schulklasse.toString();
        
        return str;
    }


    public Schulklasse getSchulklasse() {
    	return schulklasse;
    }


	public void setSchulklasse(Schulklasse schulklasse){
    	this.schulklasse = schulklasse;
    }
    

}
