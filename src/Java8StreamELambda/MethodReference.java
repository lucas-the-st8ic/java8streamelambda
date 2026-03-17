package Java8StreamELambda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MethodReference {
    static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        lista.stream()
                .forEach(System.out::println); //Method reference

        System.out.println("===========");
        lista.stream()
                .forEach(n -> System.out.println(n)); //lambda


        //Métodos Estáticos

        System.out.println("===========");
        lista.stream()
                .map((n) -> multiplicaPorDois(n))
                .forEach(System.out::println);

        //Method Reference

        System.out.println("===========");
        lista.stream()
                .map(MethodReference::multiplicaPorDois)
                .forEach(System.out::println);

        //construtores

        System.out.println("===========");
        lista.stream()
                .map(Integer::new)
                .forEach(System.out::println);

        // varias instâncias

        System.out.println("===========");
        lista.stream()
                .map(Integer::doubleValue)
                .forEach(System.out::println);

        System.out.println("===========");
        lista.stream()
                .map(integer -> integer.doubleValue())
                .forEach(System.out::println);

        // unica instância

        System.out.println("===========");

        BigDecimal dois = new BigDecimal(2);
        lista.stream()
                .map(BigDecimal::new)
                .map(dois::multiply)
                .forEach(System.out::println);
    }

    private static int multiplicaPorDois(Integer i) {
        return i * 2;
    }
}
