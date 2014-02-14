package P5a_AufgabeVererbung;

import java.awt.Color;

public class Nadelbaum extends Baum {

    Color farbeNadeln;
    
    
    public Nadelbaum(int stammlaenge, int stammdicke, int anzAeste, Color farbeNadeln) {
        super(stammlaenge, stammdicke, anzAeste);
        this.farbeNadeln = farbeNadeln;
    }

    @Override
    public void bewegen(int windstaerke) {
        // TODO Automatisch generierter Methodenstub

    }

    @Override
    public void wachsen() {
        stammlaenge = stammlaenge + 2;
    }

    @Override
    public String toString() {
        return "Nadelbaum [farbeNadeln=" + farbeNadeln + ", stammlaenge="
                + stammlaenge + ", anzahlAeste=" + anzahlAeste
                + ", stammdicke=" + stammdicke + ", farbeStamm=" + farbeStamm
                + "]";
    }
    
    

}
