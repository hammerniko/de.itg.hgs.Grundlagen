package P2_OOPBeispielSchule;

public class Fach {
    
    private String fachname;
    private String beschreibung;
    private String abkuerzung;
    private static int anzahlFaecher;
    
    //Konstruktoren
    public Fach(String pFachname, String abkuerzung) {
        anzahlFaecher++;
        fachname = pFachname;
        this.abkuerzung = abkuerzung;
    }

    public Fach(String fachname,  String abkuerzung, String beschreibung) {
        this(fachname,abkuerzung);
        this.beschreibung = beschreibung;
    }

  //getter und Setter
    public String getFachname() {
        return fachname;
    }

    public void setFachname(String fachname) {
        this.fachname = fachname;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public String getAbkuerzung() {
        return abkuerzung;
    }

    public void setAbkuerzung(String abkuerzung) {
        this.abkuerzung = abkuerzung;
    }

    public static int getAnzahlFaecher() {
        return anzahlFaecher;
    }

    
    //†berschriebene Methoden
    
    @Override
    protected void finalize() throws Throwable {
       System.out.println("Fach gelšscht"); 
       anzahlFaecher--;
    }

    @Override
    public String toString() {
       String str = fachname+" "+abkuerzung+" "+beschreibung;
       return str;
       
    }
    
    
   
    
    
    
    
    
    
    
    

}
