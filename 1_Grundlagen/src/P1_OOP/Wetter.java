package P1_OOP;

public class Wetter {
    
    //Objektvariable
    private String ort;
    private double temperatur;
    private double niederschlagsmenge;
    private double regenwahrscheinlichkeit;
    private int windrichtung;
    private int windstaerke; //in bft
    
    //Klassenvariable
    public static final int SUED = 0;
    public static final int NORD = 1;
    public static final int OST = 2;
    public static final int WEST = 3;
        
    //Konstruktor
    public Wetter(String ort, double temperatur){
        this.ort = ort;
        this.temperatur = temperatur;
        niederschlagsmenge =0;
        regenwahrscheinlichkeit = 0;
        windrichtung=SUED;
        windstaerke = 0;
    }
    
    
    
    
    
    
    
    
    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTemperatur(double temperatur) {
        this.temperatur = temperatur;
    }

    public double getNiederschlagsmenge() {
        return niederschlagsmenge;
    }

    public void setNiederschlagsmenge(double niederschlagsmenge) {
        this.niederschlagsmenge = niederschlagsmenge;
    }

    public double getRegenwahrscheinlichkeit() {
        return regenwahrscheinlichkeit;
    }

    public void setRegenwahrscheinlichkeit(double regenwahrscheinlichkeit) {
        this.regenwahrscheinlichkeit = regenwahrscheinlichkeit;
    }

    public int getWindrichtung() {
        return windrichtung;
    }

    public void setWindrichtung(int windrichtung) {
        this.windrichtung = windrichtung;
    }

    public int getWindstaerke() {
        return windstaerke;
    }

    public void setWindstaerke(int windstaerke) {
        this.windstaerke = windstaerke;
    }

    
    

}
