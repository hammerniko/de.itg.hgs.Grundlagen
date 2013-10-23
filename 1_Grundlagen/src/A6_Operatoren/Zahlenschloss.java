package A6_Operatoren;

public class Zahlenschloss {

    public static void main(String[] args) {
        //EINGABE
        int code,codeNeu, ziffer1,ziffer2,ziffer3,ziffer4,merke;
        code = 5684;
        
        //VERARBEITUNG
        ziffer1 = code % 10;  //4
        code = code / 10;
        
        ziffer2 = code % 10;  //3
        code = code / 10;
        
        ziffer3 = code % 10;  //2
        code = code / 10;
        
        ziffer4 = code % 10;  //1
        code = code / 10;
        
        
        //Tauschen
        merke = ziffer2;
        ziffer2 = ziffer4;
        ziffer4 = merke;
       
        //neuer Code
        codeNeu = 1000*ziffer4+100*ziffer3+10*ziffer2+ziffer1;
        
        //AUSGABE
        System.out.println(codeNeu);
       

    }

}
