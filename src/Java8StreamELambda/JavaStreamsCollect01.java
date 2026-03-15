package Java8StreamELambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamsCollect01 {
    static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        // fornecedor - acumulação - combinação

        //tolist
        List<Integer> collectLista = lista.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(collectLista);

        // joining

        String join = lista.stream()
                .map(n -> n.toString())
                .collect(Collectors.joining(","));

        System.out.println(join);

        //media - averaging

        Double media = lista.stream()
                .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println(media);

        // soma

        Integer soma = lista.stream()
                .collect(Collectors.summingInt(Integer::intValue));

        System.out.println(soma);
    }
}
