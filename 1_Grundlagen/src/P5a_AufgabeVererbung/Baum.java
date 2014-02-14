package P5a_AufgabeVererbung;

import java.awt.Color;

public abstract class Baum {
    protected int stammlaenge;
    protected int anzahlAeste;
    protected int stammdicke;
    protected Color farbeStamm;
    
    public static final Color BRAUN = new Color(50,50,50);
    
    
    
    public Baum(int stammlaenge, int stammdicke, int anzAeste){
        this.stammlaenge = stammlaenge;
        this.stammdicke = stammdicke;
        this.anzahlAeste = anzAeste;
        this.farbeStamm = BRAUN;
    }

    public void wachsen(){
        stammlaenge = stammlaenge +1;
    }
    
    public abstract void bewegen(int windstaerke);

    @Override
    public String toString() {
        return "Baum [stammlaenge=" + stammlaenge + ", anzahlAeste="
                + anzahlAeste + ", stammdicke=" + stammdicke + ", farbeStamm="
                + farbeStamm + "]";
    }
    
    
    
}
