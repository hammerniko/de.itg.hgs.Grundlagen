package M_Sortieren;

public class CopyOfInsertionSort {

    public static void main(String[] args) {

        int[] z = { 11, 0, 4, 2 };
        insertionSort(z);

        ausgabe(z);

    }

    public static void ausgabe(int[] z) {
        System.out.println("-----");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println();
        System.out.println("-----");
    }

    public static void insertionSort(int z[]) {
        int merke, s;
        for (int i = 1; i < z.length; i++) // Das Feld wird durchlaufen
        {
            ausgabe(z);
            merke = z[i];
            s = 0;

            while (z[s] < merke) {
                s++;
            }
            
            for (int t = i; t >= s+1; t--) {
                z[t] = z[t-1];
            }
            
            z[s]=merke;
        }
    }
}
