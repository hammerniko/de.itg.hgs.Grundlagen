package P2_OOPBeispielSchule;

public class Lehrer {
    
    //Objektattribute
    private String name;
    String kuerzel;
    
    //Konstruktor
    public Lehrer(String name){
        this.name = name;
        this.kuerzel = "--"; 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKuerzel() {
        return kuerzel;
    }

    public void setKuerzel(String kuerzel) {
        this.kuerzel = kuerzel;
    }
    
    
    
   
    

}
