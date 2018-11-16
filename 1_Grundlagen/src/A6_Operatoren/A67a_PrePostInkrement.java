package A6_Operatoren;

/**
 * 
 * @author hr
 *Betrachtet wird in diesem Beispiel der Unterschied
 *zwischen Pre- und Postinkrement.
 *
 */
public class A67a_PrePostInkrement {

	public static void main(String[] args) {
		
		int a = 5;	
		int b= a++;
		int c= --a;
		int d= ++a;

		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);

	}
	

}
