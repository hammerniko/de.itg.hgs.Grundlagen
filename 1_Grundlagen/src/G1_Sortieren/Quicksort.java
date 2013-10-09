package G1_Sortieren;

public class Quicksort {

    public static void main(String[] args) {
        int[] zahlen = {4,9,1,2,89,2};
        quicksort(zahlen, 0, zahlen.length-1);
        
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

    }
    
    public static void quicksort(int[] a, int unten, int oben){
        int tmp;
        int i = unten;
        int j = oben;
        int x = a[(unten+oben)/2];
        
        do {
            
            while (a[i]<x) {
                i++;
            }
            
            while (a[j]>x) {
                j--;
            }
            
            if(i<=j){
                tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
                i++;
                j--;
            }
            
        } while (i<=j);
        if(unten<j){
            quicksort(a, unten, j);
        }
        if(i<oben){
            quicksort(a,i, oben);
        }
        
    }

}
