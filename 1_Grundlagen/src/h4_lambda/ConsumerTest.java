package h4_lambda;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> prompt = s-> System.out.println(">"+s);
        prompt.accept("Hallo");

        List<String> students = List.of("Max","Peter","Oli");
        students.forEach(prompt);
    }
}
