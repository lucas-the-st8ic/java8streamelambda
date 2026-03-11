package Java8StreamELambda;

import java.util.Optional;

public class JavaClasseOptional01 {
    static void main(String[] args) {

        String string = "1";
        Optional<Integer> numero = converteEmNumero(string);

        numero.ifPresent(System.out::println);
    }

    public static Optional <Integer> converteEmNumero (String numeroStr) {

        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer) ;
        } catch (Exception e) {
            return Optional.empty();
        }

    }
}
