package B1_Verzweigungen;

import java.util.Scanner;

public class B1_1_Verzweigung {

    public static void main(String[] args) {
    	double x1,x2;
    	String erg = "";
    	
    	//Einlesen der Koeefizienten a,b,c,d
    	Scanner s = new Scanner(System.in);
    	System.out.println("a:");
    	double a = s.nextDouble();
    	System.out.println("b:");
    	double b = s.nextDouble();
    	System.out.println("c:");
    	double c = s.nextDouble();
    	System.out.println("d:");
    	double d = s.nextDouble();
    	
    	
    	
    	//Ausgeben der quad. Gleichung f(x) = ax^2+bx+c=d
    	System.out.println(a+"x² +"+b+"x +"+c+"="+d);    	
    	
    	
    	
    	//Nullform 		 ax^2+bx+c = 0
    	c = c-d;
    	d=0;
    	
    	
    	//Ausgeben der Nullform
    	System.out.println(a+"x² +"+b+"x +"+c+"="+d); 
    	    	
    	//Normalform  	 x^2 +(b/a)x+ c/a) = 0 
    	b=b/a;
    	c=c/a;
    	a=1;
    	
    	//Ausgeben der Normalform
    	System.out.println(a+"x² +"+b+"x +"+c+"="+d);     	
    	
    	//Diskriminante bestimmen -> dis = ((b/2)*(b/2))-c
    	double dis = ((b/2)*(b/2))-c;   	
    	
    	//Fallunterscheidung
    	if (dis==0) {
			//Eine Lösung
    		x1 = -b/2;
    		erg="x1 = "+x1;
		}
    	else if (dis<0) {
			//keine Lösung
    		erg="Es gibt keine Lösung";
		}
    	else {
    		//Zwei Lösungen
    		x1=-b/2+Math.sqrt(dis);
    		x2= -b/2-Math.sqrt(dis);
    		
    		erg="x1="+x1+"\tx2="+x2;
    		
    	
		}
    	
     	//Ausgabe der Lösung
    	System.out.println(erg);
    	
    }

}
