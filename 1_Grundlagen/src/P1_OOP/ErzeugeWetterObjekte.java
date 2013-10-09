package P1_OOP;

public class ErzeugeWetterObjekte {

    
    public static void main(String[] args) {
        
        Wetter ohio = new Wetter("Ohio", 13);
        Wetter aach = new Wetter("Aach (Hegau)",17);
        
        aach.setNiederschlagsmenge(100);
        aach.setRegenwahrscheinlichkeit(90);
        aach.setWindrichtung(Wetter.SUED);
        
        System.out.println(aach.getTemperatur());
        

    }

}
