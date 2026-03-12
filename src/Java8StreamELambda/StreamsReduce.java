package Java8StreamELambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduce {

    //Reduce precisa ter uma função associativa
    //Exemplo 1 + 2 + 3 + 4 + 5 + 6


    static void main(String[] args) {

        String s = "Increva-se no canal e compartilhe esse vídeo!";
        String[] split = s.split(" ");

        List<String> listaString = Arrays.asList(split);

        //reduce - soma
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> reduceSoma = lista.stream()
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(reduceSoma.get());

        //reduce multiplicação

        Optional<Integer> reduceMultiplicacao = lista.stream()
                .reduce((n1, n2) -> n1 * n2);

        System.out.println(reduceMultiplicacao.get());

        //reduce concatenação

        Optional<String> reduceConcatenacao = listaString.stream()
                .reduce(String::concat);

        System.out.println(reduceConcatenacao.get());

        //reduce subtração - NÃO FAÇA

        Optional<Integer> reduceSubtracao = lista.stream()
                .reduce((n1, n2) -> n1 - n2);

        System.out.println(reduceSubtracao.get());

        //=============================================

        //Valores de Identidade
        Integer reduceSoma2 = lista.stream()
                .reduce(0,(n1, n2) -> n1 + n2);

        System.out.println(reduceSoma2);


        //reduce multiplicação

        Integer reduceMultiplicacao2 = lista.stream()
                .reduce(1,(n1, n2) -> n1 * n2);

        System.out.println(reduceMultiplicacao2);

        //reduce concatenação

        String reduceConcatenacao2 = listaString.stream()
                .reduce("", String::concat);

        System.out.println(reduceConcatenacao2);

    }
}
