package P2_OOPBeispielBidirektionaleAssoziation;
import javax.swing.JFrame;


public class Gui extends JFrame {
    
    Steuerung dieSteuerung;
    
    public Gui(){
       dieSteuerung = new Steuerung(this);
       
       dieSteuerung.steuerungsTestMethode();
    }
    
    public void guiTestMethode(){
        System.out.println("Methode in der Gui");
        
        
    }
    
    
    

}
