package E1_Methoden;

public class Wurzel2 {

	public static void main(String[] args) {
		//Zahl
		double z = 9;
		
		System.out.println(gibWurzel(z));
	}
	
	public static double gibWurzel(double z) {
		
		double a=1;
		double b=z;
		double flaeche = a*b;
		
		do {
			a=a+0.001;
			b=flaeche/a;
			System.out.println("a="+a+"\tb="+b);
		} while (Math.abs(a-b)>0.001);
		
		
		
		return a;
	}

}
