package B1_Verzweigungen;

public class B1_3_Mehrfachverzweigung {

    //Hauptprogramm
    public static void main(String[] args) {
       
        
        double gewicht = 100.9; 
        
       
    
               
        if (gewicht > 100 ) {
			System.out.println("schwer");
        }
        else if(gewicht >90){
        	System.out.println("üppig");
        }
        else{
        	System.out.println("normal");
        }
       
        System.out.println("ende");
        
        
        if (gewicht > 100 ) {
			System.out.println("schwer");
        }
        if(gewicht >90 ){
        	System.out.println("üppig");
        }
        else{
        	System.out.println("normal");
        }
       
        System.out.println("ende");
        
 
    }
}
