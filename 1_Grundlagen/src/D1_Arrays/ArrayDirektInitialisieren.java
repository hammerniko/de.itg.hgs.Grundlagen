package D1_Arrays;

public class ArrayDirektInitialisieren {

   
    public static void main(String[] args) {
       
       //Eingabe
       int merke; 
       int[] zahl = {3,2,1,7,5};
       
       //Verarbeitung
       for (int i = 0; i < zahl.length-1; i++) {
           for (int j = i+1; j < zahl.length; j++) {
            
               if(zahl[i]<zahl[j]){
                   merke = zahl[i];
                   zahl[i]=zahl[j];
                   zahl[j]=merke;
                   
               }
               
               
               
        }
        
    }
       
       
       
       
       
       //Ausgabe
       for (int k = 0; k < zahl.length; k++) {
           System.out.println(zahl[k]);
        
    }
       
        

    }

}
