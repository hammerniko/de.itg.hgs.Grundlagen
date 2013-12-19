package D1_Arrays;

public class ArrayDirektInitialisieren {

   
    public static void main(String[] args) {
        
        String[] namen = {"Max","Tom","Robert"};
        
        namen[1]="Thomas";
        
        
        for (int i = 0; i < namen.length; i++) {
            System.out.println(namen[i]);
        }
        
        
        double[] gewichte = {1.2, 1.9,3.34,4};
        
        for (int i = 0; i < gewichte.length; i++) {
            System.out.println(gewichte[i]);
        }
        
        
        

    }

}
