package D1_Arrays;

public class Namen3 {

    public static void main(String[] args) {

        // Array deklarieren
        String[] namen = new String[10];
        String[] vornamen = new String[10];
        String merke;
        int pos = 0;

        // Array initialisieren
        namen[0] = "Buerger";
        namen[1] = "Bruederlein";
        namen[2] = "Bruederle";
        namen[3] = "BŠaaasedertg";
        namen[4] = "Burger";
        namen[5] = "Bader";
        namen[6] = "Balder";
        namen[7] = "Bach";
        namen[8] = "Kneip";
        namen[9] = "Mann";
        
        

        vornamen[0] = "Max";
        vornamen[1] = "Detlef";
        vornamen[2] = "Thomas";
        vornamen[3] = "Martin";
        vornamen[4] = "Michael";
        vornamen[5] = "Tom";
        vornamen[6] = "Ralf";
        vornamen[7] = "Dino";
        vornamen[8] = "Klaus";
        vornamen[9] = "Moritz";

        // Array sortieren
        do {
            try {

                for (int i = 0; i < namen.length - 1; i++) {
                    for (int j = i + 1; j < namen.length; j++) {
                        if (namen[i].length() >= pos) {
                            if (pos == 0) {
                                if (namen[i].charAt(pos) > namen[j].charAt(pos)) {
                                    tausche(namen, i, j);
                                }
                            } else if (namen[i].charAt(pos) > namen[j]
                                    .charAt(pos)
                                    && namen[i].charAt(pos - 1) == namen[j]
                                            .charAt(pos - 1)) {

                                {
                                    tausche(namen, i, j);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("posMax = " + pos);
                break;
            }
            pos++;

        } while (pos < 10);

        for (int x = 0; x < namen.length; x++) {
            System.out.println(namen[x] + " \t" + vornamen[x]);
        }

    }

    public static void tausche(String[] namen, int i, int j) {
        String merke;
        // tauschen
        merke = namen[i];
        namen[i] = namen[j];
        namen[j] = merke;
    }

}
