package P1_OOP;

public class B {
    
    //Deklaration
    A einA;
    
    public B(A dasA){
        einA = dasA;
    }
    
    public void  testeB(){
        einA.zeigeMeldung("Teste B wurde gestartet...");
        
        System.out.println("testeB aufgerufen()");
        
        
    }
    

}
