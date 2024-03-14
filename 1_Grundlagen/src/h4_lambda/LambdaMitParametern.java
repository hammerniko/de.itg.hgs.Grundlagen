package h4_lambda;

public class LambdaMitParametern {

	public static void main(String[] args) {
		Mathe add = (a,b) -> a+b;
		Mathe mul = (a,b) -> a*b;
		Mathe div = (a,b) -> a/b;
		Mathe min = (a,b) -> a-b;

		System.out.println(add.fkt(5, 3));
		System.out.println(mul.fkt(1, 3));
		System.out.println(div.fkt(20, 13));
		System.out.println(min.fkt(25, 13));
		
	}
	
	interface Mathe{
		double fkt(int a, int b);
	}

}
