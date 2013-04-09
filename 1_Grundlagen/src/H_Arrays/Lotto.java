package H_Arrays;

public class Lotto {
    
    static int[] haeufigkeitLotto = new int[49];

    public static void main(String[] args) {

        ausgabeLottozahlen(ziehe6aus49());

    }// end main

    public static int[] sortiereLottoZahlen(int[] dieLottozahlen) {
        int[] sortierteLottozahlen = dieLottozahlen.clone();
        int merke;
        for (int i = 0; i < sortierteLottozahlen.length - 1; i++) {
            for (int j = i + 1; j < sortierteLottozahlen.length; j++) {

                if (sortierteLottozahlen[j] < sortierteLottozahlen[i]) {
                    // tausche
                    merke = sortierteLottozahlen[i];
                    sortierteLottozahlen[i] = sortierteLottozahlen[j];
                    sortierteLottozahlen[j] = merke;
                }

               
            }
        }
        return sortierteLottozahlen;
    }

    public static int[] ziehe6aus49() {
        int[] dieLottoZahlen = new int[6];
        boolean[] gezogeneZahlen = new boolean[49];

        // ZŠhle von 0 bis 5
        for (int i = 0; i < dieLottoZahlen.length; i++) {
            // Wiederhole solange bis keine vorhandene Zahl
            // gezogen wird

            do {
                // ziehe eine Zufallszahl zw. 1 und 49
                dieLottoZahlen[i] = (int) (Math.random() * 49 + 1);

            } while (gezogeneZahlen[dieLottoZahlen[i] - 1] == true);

            // Merke die gerade gezogene Zahl
            gezogeneZahlen[dieLottoZahlen[i] - 1] = true;
            haeufigkeitLotto[dieLottoZahlen[i]]++;

        }// end for

        dieLottoZahlen = sortiereLottoZahlen(dieLottoZahlen);

        return dieLottoZahlen;
    }

    public static void ausgabeLottozahlen(int[] dieLottozahlen) {
        for (int i = 0; i < dieLottozahlen.length; i++) {
            System.out.print(dieLottozahlen[i]+" ");
        }
        System.out.println("SZ:"+gibSuperzahl());
        
        for (int i = 0; i < haeufigkeitLotto.length; i++) {
            System.out.print(haeufigkeitLotto[i]+" ");
        }
    }
    
    public static int gibSuperzahl(){
        return (int) (Math.random()*9+1);
    }

}// ende class
