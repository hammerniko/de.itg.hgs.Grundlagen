package D1_Arrays;

import java.util.Scanner;

public class Gruppen {

    
    public static void main(String[] args) {
        //Eingabe
        int[] lotto = eingabe();
        
        //VERARBEITUNG
        sortList(lotto);
        
        
        
        //AUSGABE
        ausgabeLotto(lotto);
        
        
        
        
    }

    public static void sortList(int[] lotto) {
        int merke;
        for (int i = 0; i < lotto.length-1; i++) {
            for (int j = i+1; j < lotto.length; j++) {
                if(lotto[i]>lotto[j]){
                    merke=lotto[i];
                    lotto[i]=lotto[j];
                    lotto[j]=merke;
                }
            }
        }
    }

    public static int[] eingabe() {
        Scanner s = new Scanner(System.in);
        int[] lotto = new int[6];
        int index=0;
        
        do {
                System.out.print("lottozahl["+index+"] = ");
                lotto[index]=s.nextInt();
                index++;
        } while (index<lotto.length);
        return lotto;
    }

    public static void ausgabeLotto(int[] lotto) {
        for (int i = 0; i < lotto.length; i++) {
            System.out.println(lotto[i]);
        }
    }

}
