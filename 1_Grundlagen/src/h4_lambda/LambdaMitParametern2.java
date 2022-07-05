package h4_lambda;

public class LambdaMitParametern2 {

	public static void main(String[] args) {
		
		Mathe[] ops = new Mathe[4];
		
		ops[0] = (a,b) -> a+b;
		ops[1] = (a,b) -> a*b;
		ops[2] = (a,b) -> a/b;
		ops[3] = (a,b) -> a-b;
		
		
		int x=10;
		
		for (int i = 0; i < ops.length; i++) {
			System.out.println(x+ops[i].fkt(1, 2));
		}
		
	}
	
	interface Mathe{
		int fkt(int a, int b);
	}

}
