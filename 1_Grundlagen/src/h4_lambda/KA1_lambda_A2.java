package h4_lambda;

/**
 * KA1_lambda
 */
public class KA1_lambda_A2 {

    interface Rectangle{
        public double getArea(double length, double width);
    }

    public static void main(String[] args) {
       
        System.out.println("Rechteck berechnen");
        double l = 3;
        double w = 4;
        System.out.println("Breite\t=\t"+w+" cm");
        System.out.println("Länge\t= \t"+l+" cm");
        
        
        Rectangle rectangle  = (length,width) -> length*width;
        double area =rectangle.getArea(l,w);
        System.out.println("Area\t=\t"+area+" cm²");
      
    }
}