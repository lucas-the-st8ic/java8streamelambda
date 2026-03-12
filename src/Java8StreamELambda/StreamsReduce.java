package Java8StreamELambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduce {
    static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> reduce = lista.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(reduce.get());
    }
}
