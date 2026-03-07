package Java8StreamELambda;

import java.util.Arrays;
import java.util.List;

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

        System.out.println("==============");
        lista.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
