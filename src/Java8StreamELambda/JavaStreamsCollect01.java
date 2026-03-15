package Java8StreamELambda;

import java.util.*;
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


        //summarizing
        IntSummaryStatistics stats = lista.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());


        //counting

        Long contagem = lista.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(contagem);

        //Max/Min

        Optional<Integer> max= lista.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Maior: " + max.get());

        Optional<Integer> min= lista.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Menor: " + min.get());

        //groupingBy

        Map<Integer, List<Integer>> mapa = lista.stream()
                .collect(Collectors.groupingBy(n -> n % 3));

        System.out.println(mapa);

        //partitioninBy

        Map<Boolean, List<Integer>> partition = lista.stream()
                .collect(Collectors.partitioningBy(n -> n % 3 == 0));

        System.out.println(partition);
        
        //tomap

        Map<Integer, Double> mapeador = lista.stream()
                .collect(Collectors.toMap(c -> c,
                        n -> Math.pow(n.doubleValue(), 5)));

        System.out.println(mapeador);
        
    }
}
