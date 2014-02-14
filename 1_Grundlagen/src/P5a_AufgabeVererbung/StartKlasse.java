package P5a_AufgabeVererbung;

import java.awt.Color;

public class StartKlasse {

    

    public static void main(String[] args) {
        Nadelbaum fichte = new Nadelbaum(100, 30, 50, Color.GREEN);
        Laubbaum eiche = new Laubbaum(90, 25, 70, new Color(10,80,0));
        Walnussbaum nussi = new Walnussbaum(80, 50, 20, Color.yellow);
        
        System.out.println(fichte);
        System.out.println(eiche);
        System.out.println(nussi);
        
    }

}
