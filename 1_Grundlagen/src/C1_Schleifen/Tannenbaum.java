package C1_Schleifen;

public class Tannenbaum {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String luecke = "";
        String stern = "*";
        String zeile = "";
        int anzahlSterne = 0;

        for (int i = 0; i <= 10; i++) {
            for (int j = 10 - i; j > 0; j--) {
                luecke = luecke + " ";
            }
            anzahlSterne = i * 2;

            for (int k = 0; k < anzahlSterne; k++) {
                stern = stern + "*";
            }

            zeile = luecke + stern;
            System.out.println(zeile);
            luecke = "";
            stern = "*";

        }

    }
}
