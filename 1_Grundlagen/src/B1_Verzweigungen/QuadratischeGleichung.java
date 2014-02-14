
package B1_Verzweigungen;

import java.util.Scanner;

public class QuadratischeGleichung {

    public static void main(String[] args) {
        //***************Eingabe
        String ergebnis = "";
        double a=0,b,c,d,x1,x2,dis;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie eine quadratische Gleichung");
        System.out.println("der Form ax^2+bx+c=d ein:");
        
        
        System.out.print("a:\t");
        a = s.nextDouble();
       System.out.print("b:\t");
        b = s.nextDouble();
        System.out.print("c:\t");
        c = s.nextDouble();
        System.out.print("d:\t");
        d = s.nextDouble();
           
        //******************VERARBEITUNG
        
        //Nullform
        c=c-d;
        d=0;
        
        //Normalform
        b=b/a;
        c=c/a;
        a=1;
        
        //Diskriminante
        dis = (b*b/4)-c;
        
        if(dis<0){
            ergebnis = "Es gibt keine Lšsung";
        }
        else if(dis==0) {
            x1=-b/2;
            ergebnis = "x = "+x1;
        }
        else{
            x1 = -b/2 + Math.sqrt(dis);
            x2 = -b/2 - Math.sqrt(dis);
            ergebnis = "x1 = "+x1+" \t x2= "+x2;
        }
        
        
        //********************AUSGABE
        System.out.println(ergebnis);
        
        
        
        
        
    }

}
