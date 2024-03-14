package h4_lambda;

import java.util.function.Function;

public class FunctionalTest {

    public static void main(String[] args) {
        Function<Integer,Integer> addTwo = number -> number+2;
        Function<Integer,Integer> multThree = number -> number*3;

        int result = addTwo.andThen(multThree).apply(4); //addTwo word zuerst ausgeführt
        int result2 = addTwo.compose(multThree).apply(4); //Multthree wird zuerst ausgeführt

        System.out.println(result);
        System.out.println(result2);
        
    }
    
}
