package P2_OOPBeispielUnidirektionaleAssoziation1ZuN;

import java.util.Vector;

public class Kunde {
    private static int anzahlKunden = 0;
    private int kundenNr;
    private String name;
    private String vorname;
    
    //Kunde benutzt 0,1 oder mehrere Konten
    Vector<Konto> dieKonten;
    
    public Kunde(String name, String vorname) {
        anzahlKunden++;
        kundenNr=anzahlKunden;
        dieKonten = new Vector<Konto>();
        this.name = name;
        this.vorname = vorname;
    }

    //Verwaltungsmehtoden für Konto
    public void addKonto(Konto konto){
        dieKonten.add(konto);
    }
    
    public Konto getKonto(int kontoNr){
        kontoNr--;
        if(dieKonten.get(kontoNr)!=null){
            return dieKonten.get(kontoNr);
        }
        return null;
    }
    
    public void removeKonto(int kontoNr){
        kontoNr--;
        dieKonten.remove(kontoNr);
    }
    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getKundenNr() {
        return kundenNr;
    }
    


    @Override
    public String toString() {
        return "\n----\nKunde [kundenNr=" + kundenNr + ", name=" + name + ", vorname="
                + vorname + ",\ndieKonten=" + dieKonten + "]";
    }
    

}
