package P2_OOPBeispielBidirektionaleAssoziation;

public class Steuerung {
    
    Gui dieGui;
    
    public Steuerung(Gui x){
        dieGui = x;
    }
    
    public void steuerungsTestMethode(){
        System.out.println("Methode in der Steuerung");
        
        dieGui.guiTestMethode();
        
    }

}
