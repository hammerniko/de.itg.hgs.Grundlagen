package h4_lambda;

import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        List<String> students = List.of("Max","Peter","Oli");
        
        //testen ob ein Student mit M beginnt
        Predicate<String> studentTest = student -> student.startsWith("M");

        //Sobald ein Ergebnis stimmt, ist das Ergebnis true
        boolean b = students.stream().anyMatch(studentTest);

        //Ausgabe des Ergebnisses
        System.out.println(b);

    }

    
}
