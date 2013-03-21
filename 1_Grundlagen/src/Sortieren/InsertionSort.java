package Sortieren;

public class InsertionSort {

    public static void main(String[] args) {

        int[] z = { 11, 0, 4,2 };
        insertionSort(z);

        ausgabe(z);

    }

    public static void ausgabe(int[] z) {
        System.out.println("-----");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+" ");
        }
        System.out.println();
        System.out.println("-----");
    }

    public static void insertionSort(int z[]) {
        for (int i = 0; i < z.length; i++) // Das Feld wird durchlaufen
        {
            ausgabe(z);
            int s = i;
            System.out.println("s:"+s);
            
            int merke = z[i];
            System.out.println("merke=z["+i+"] ="+merke);
            
            while (s > 0 && z[s - 1] > merke) {
                
                z[s] = z[s - 1];
                System.out.println("verschieben z["+s+"] = z["+(s-1)+"]");
                
                s--;
                System.out.println("s=s-1="+s);
                ausgabe(z);
            }
            z[s] = merke; 
            System.out.println("z["+s+"] = merke ="+merke);
        }
    }
}
