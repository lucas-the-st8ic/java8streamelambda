package Java8StreamELambda;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        //Exemplos de Operações Lambda.

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,6,7,8,9,9,10);

/*        lista.stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println("==============");

        lista.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("==============");
        lista.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("==============");
        lista.stream()
                .skip(2)
                .limit(6)
                .distinct() // equals e hashcode
                .forEach(System.out::println);

        System.out.println("==============");
        lista.stream()
                .filter(e -> e % 2 == 0)
                .forEach(System.out::println);*/

/*        System.out.println("==============");
        lista.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);


        System.out.println("==============");
        long count = lista.stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println(count);

        System.out.println("==============");
        Optional<Integer> min = lista.stream()
                .filter(e -> e % 2 == 0)
                .min(Comparator.naturalOrder());

        System.out.println(min.get());

        System.out.println("==============");
        Optional<Integer> max = lista.stream()
                .filter(e -> e % 2 == 0)
                .max(Comparator.naturalOrder());

        System.out.println(max.get());*/

 /*       System.out.println("==============");
        List<Integer> novaLista = lista.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(novaLista);

        System.out.println("==============");
        Map<Integer, List<Integer>> novalista2 = lista.stream()
                .collect(Collectors.groupingBy(e -> e % 3));

        System.out.println(novalista2);*/

        System.out.println("==============");
        String collects = lista.stream()
                .map(e -> String.valueOf(e))
                .collect(Collectors.joining());

        System.out.println(collects);

    }
}
