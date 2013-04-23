package H_Arrays;

public class ZiehenOhneZuruecklegen {

    public static void main(String[] args) {

        int anz = 3;
        int[] zahlen = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

//        ausgabe(ziehenOhneZuruecklegen(8, zahlen));
//        System.out.println("--");
//        ausgabe(zahlen);
        
        zahlen = ziehenOhneZuruecklegen(3, zahlen);
        
        ausgabe(zahlen);

    }

    public static int[] ziehenOhneZuruecklegen(int pAnz, int[] pKugeln) {
        int[] ergebnis;
        int zz;
        int letzteKugel = pKugeln.length - 1;
        int[] kopieKugeln = (int[]) pKugeln.clone();
        
        if (pAnz <= pKugeln.length) {
            ergebnis = new int[pAnz];
            for (int i = 0; i < pAnz; i++) {
                zz = gibZufallsZahl(1, letzteKugel - i + 1);
                ergebnis[i] = kopieKugeln[zz - 1];
                kopieKugeln[zz - 1] = kopieKugeln[letzteKugel - i];
                kopieKugeln[letzteKugel - i] = ergebnis[i];
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

}
