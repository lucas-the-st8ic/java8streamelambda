package Java8StreamELambda;

import java.util.Arrays;
import java.util.List;

public class DebugLambda {
    static void main(String[] args) {

        List<Integer> listaNumeros = Arrays.asList(1, 2, 5, 8, 9, 15, 33, 67, 90);

        listaNumeros.stream()
                .peek(n -> System.out.println(n + " Se inscreva no canal!"))
                .filter(n -> n % 2 == 0)
                .peek(n -> System.out.println(n + " Comente"))
                .map(n -> getStringBuilder(n))
                .forEach(System.out::println);

    }

    private static StringBuilder getStringBuilder(Integer n) {
        StringBuilder builder = new StringBuilder();
        builder.append(n);
        builder.append("s");
        builder.append("a");
        return builder;
    }
}
