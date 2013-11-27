package P5b_AufgabePoymorphismus;

public class Hausmeister extends Angestellte {

    double zulageNachtdienst;
    
    
    public Hausmeister(String name, String vorname) {
        super(name, vorname);
        stundenlohn = 15.80;
        zulageNachtdienst = 150;
    }

    

    @Override
    public double gehaltBerechnen() {
        //Methode aus der Oberklasse aufrufen und Ergebnis anpassen
        double gehalt = super.gehaltBerechnen() + zulageNachtdienst;
        return gehalt;
    }
    
    
    
    
}
