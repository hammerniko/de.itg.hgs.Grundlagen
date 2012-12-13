import hgsTools.*;
public class Brueckenhoehe {

    public static void main(String[] args) {
        //Hauptprogramm
        double g = 9.81; //Erdbeschleunigung
        double strecke;
        
        //Eingabe
        double zeit = Eingabe.Double("Zeit:");
                
        //Verarbeitung
        strecke = 0.5*g*zeit*zeit;
        
        //Ausgabe
        System.out.println("Die Höhe der Brücke:"+strecke);
        

    }

}
