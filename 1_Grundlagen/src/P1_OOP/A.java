package P1_OOP;

//Minimalbeispiel fŸr
//bidirektionale Assoziation
// --> A kennt B und B kennt A (Objekte der klassen)


public class A {
    
    //Deklaration
    B einB;
    
    //Konstruktor
    public A(){
        einB = new B(this);
    }
    
    public void testeBObjekt(){
        einB.testeB();
        System.out.println("ich bin wieder in A");
    }
    
    public void zeigeMeldung(String meldung){
        System.out.println(meldung);
    }
    

}
