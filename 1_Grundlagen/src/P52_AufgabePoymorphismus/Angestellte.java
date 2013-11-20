package P52_AufgabePoymorphismus;

public class Angestellte extends Mitarbeiter{

    double stundenlohn;
    double anzahlStunden;
    static final double  TARIFLOHN = 12.5;
    
    
    public Angestellte(String name, String vorname) {
        super(name, vorname);
        // TODO Automatisch generierter Konstruktorstub
    }


    
    
    
    @Override
    public double gehaltBerechnen() {
        // TODO Automatisch generierter Methodenstub
        return 0;
    }





    public double getAnzahlStunden() {
        return anzahlStunden;
    }





    public void setAnzahlStunden(double anzahlStunden) {
        this.anzahlStunden = anzahlStunden;
    }

}
