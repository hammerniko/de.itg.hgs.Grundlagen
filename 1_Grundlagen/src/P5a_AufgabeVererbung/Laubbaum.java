package P5a_AufgabeVererbung;

import java.awt.Color;

public class Laubbaum extends Baum {
    
    Color farbeBlaetter;

    public Laubbaum(int stammlaenge, int stammdicke, int anzAeste, Color blattfarbe) {
        super(stammlaenge, stammdicke, anzAeste);
        this.farbeBlaetter = blattfarbe;
    }

    @Override
    public void bewegen(int windstaerke) {
        // TODO Automatisch generierter Methodenstub

    }

    @Override
    public String toString() {
        return "Laubbaum [farbeBlaetter=" + farbeBlaetter + ", stammlaenge="
                + stammlaenge + ", anzahlAeste=" + anzahlAeste
                + ", stammdicke=" + stammdicke + ", farbeStamm=" + farbeStamm
                + "]";
    }

    
}
