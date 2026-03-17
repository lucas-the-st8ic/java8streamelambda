package Java8StreamELambda;

import java.util.stream.IntStream;

public class FuncoesLambda {
    static void main(String[] args) {

        //Parênteses

        Runnable runnable= () ->
            System.out.println("Executando Runnable");

        IntStream.range(0, 10 + 1)
                .filter(n -> n % 2 == 0)
                .reduce((n1, n2) -> n1 + n2)
                .ifPresent(System.out::println);

        //Chaves
        IntStream.range(0, 5 + 1)
                .filter((int n) -> {
                    System.out.println("Se inscreva no canal!");
                    return n % 2 == 0;
                } )
                .forEach(System.out::println);
    }
}
