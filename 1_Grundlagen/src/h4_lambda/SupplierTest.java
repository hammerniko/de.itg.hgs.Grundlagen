package h4_lambda;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        Supplier<Double> random100 = () -> Math.random()*100;
        System.out.println(random100.get());
    }
    
}
