package P5b_AufgabePoymorphismus;

import java.util.Date;

public abstract class Mitarbeiter extends Person {

    public Mitarbeiter(String name, String vorname) {
        super(name, vorname);
        // TODO Automatisch generierter Konstruktorstub
    }

    Date einstellungsdatum;
    
    public abstract double gehaltBerechnen();

}
