package D1_Arrays;

import java.util.Arrays;

public class NamenSortieren {

    
    public static void main(String[] args) {
       
        String[] tg113 = new String[3];
        tg113[0]="Mike";
        tg113[1]="Thomas";
        tg113[2]="Anton";
        
        Arrays.sort(tg113);
        
        for (int index = 0; index < tg113.length; index++) {
            System.out.println(tg113[index]);
        }
        
        

    }

}
