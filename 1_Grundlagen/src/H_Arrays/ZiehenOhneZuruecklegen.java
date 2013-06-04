package H_Arrays;


public class ZiehenOhneZuruecklegen {

    public static void main(String[] args) {

      
        int[] zahlen = { 11, 23, 3, 41, 53, 632, 71, 8, 9 };
        String[] meineNamen = {"Max","leo","Gudrun","Hildegard"};
      
        int[] gruppe = ziehenOhneZuruecklegen(3, zahlen);
       
        ausgabe(gruppe);

    }

    public static int[] ziehenOhneZuruecklegen(int pAnz, int[] pKugeln) {
        int[] ergebnis;
        int zz;
        int letzteKugel = pKugeln.length - 1;
       
        
        if (pAnz <= letzteKugel) {
            ergebnis = new int[pAnz];
            
            for (int i = 0; i < pAnz; i++) {
                zz = gibZufallsZahl(1, letzteKugel - i + 1);
                ergebnis[i] = pKugeln[zz - 1];
                pKugeln[zz - 1] = pKugeln[letzteKugel - i];
                pKugeln[letzteKugel - i] = ergebnis[i];
            }
        }
        else{
            ergebnis = new int[1];
            ergebnis[0]=-1;
            
        }
        return ergebnis;
    }

    public static int gibZufallsZahl(int pMin, int pMax) {
        return (int) (Math.random() * (pMax - pMin + 1) + pMin);
    }

    public static void ausgabe(int[] pFeld) {
        for (int i = 0; i < pFeld.length; i++) {
            System.out.println(pFeld[i]);
        }
    }
    
    public static void ausgabe(String[] pFeld) {
        for (int i = 0; i < pFeld.length; i++) {
            System.out.println(pFeld[i]);
        }
    }
    
    public static String[] ziehenOhneZuruecklegen(int pAnz, String[] pNamen) {
        String[] ergebnis;
        int zz;
        int letzterName = pNamen.length - 1;
       
        
        if (pAnz <= letzterName+1) {
            ergebnis = new String[pAnz];
            
            for (int i = 0; i < pAnz; i++) {
                zz = gibZufallsZahl(1, letzterName - i + 1);
                ergebnis[i] = pNamen[zz - 1];
                pNamen[zz - 1] = pNamen[letzterName - i];
                pNamen[letzterName - i] = ergebnis[i];
            }
        }
        else{
            ergebnis = new String[1];
            ergebnis[0]="Fehler";
            
        }
        return ergebnis;
    }
    
    

}
