package P5a_AufgabeVererbung;

import java.awt.Color;

public class Walnussbaum extends Laubbaum {
    
    protected int anzahlFruechte;
    protected int groesseFruechte;

    public Walnussbaum(int stammlaenge, int stammdicke, int anzAeste,
            Color blattfarbe) {
        super(stammlaenge, stammdicke, anzAeste, blattfarbe);
        
    }

    @Override
    public String toString() {
        return "Walnussbaum [anzahlFruechte=" + anzahlFruechte
                + ", groesseFruechte=" + groesseFruechte + ", farbeBlaetter="
                + farbeBlaetter + ", stammlaenge=" + stammlaenge
                + ", anzahlAeste=" + anzahlAeste + ", stammdicke=" + stammdicke
                + ", farbeStamm=" + farbeStamm + "]";
    }

    

    
}
