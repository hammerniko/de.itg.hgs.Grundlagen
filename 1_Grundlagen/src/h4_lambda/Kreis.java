package h4_lambda;

public class Kreis {

	interface Circle{
		public double getArea(double radius);
	}
	
	public static void main(String[] args) {
		Circle kreis1 = r -> Math.PI*r*r;
		System.out.println(kreis1.getArea(1.3));
	}

}
