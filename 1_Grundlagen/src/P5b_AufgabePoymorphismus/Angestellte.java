package P5b_AufgabePoymorphismus;

public class Angestellte extends Mitarbeiter{

    double stundenlohn;
    double anzahlStunden;
    static final double  TARIFLOHN = 12.5;
    static final double UEBERSTUNDENSATZ = 20;
    
    public Angestellte(String name, String vorname) {
        super(name, vorname);
        // TODO Automatisch generierter Konstruktorstub
    }


    
    
    
    @Override
    public double gehaltBerechnen() {
        double gehalt;
        if(anzahlStunden>=40){
            gehalt = 40 * stundenlohn + (anzahlStunden-40)*UEBERSTUNDENSATZ;
        }
        else{
            gehalt = anzahlStunden * stundenlohn;
        }
        return gehalt;
    }





    public double getAnzahlStunden() {
        return anzahlStunden;
    }





    public void setAnzahlStunden(double anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

}
