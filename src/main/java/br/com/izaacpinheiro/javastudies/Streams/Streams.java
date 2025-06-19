package br.com.izaacpinheiro.javastudies.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        // streams não altera a lista original, mas pode ser usado para gerar novas listas

        // -- OPERAÇÕES INTERMEDIARIAS --

        // 1. filter = filtra elementos com base em um parametro
        List<String> nomes = Arrays.asList("Zarya", "Izaac", "Julia", "Felipe", "Miguel", "Igor", "Pedro", "Ana");
//        nomes.stream()
//                .filter(nome -> nome.startsWith("J"))
//                .forEach(System.out::println);

        // 2. map = transforma cada elemento em outro
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 1, 2, 6, 2, 5);
//        numeros.stream()
//                .map(n -> n * 2)
//                .forEach(System.out::println);

        // 3. sorted = ordena elementos
//        nomes.stream()
//                .sorted()
//                .forEach(System.out::println);

        // 4. distinct = remove elementos duplicados
//        numeros.stream()
//                .distinct()
//                .forEach(System.out::println);

        // -- OPERAÇÕES TERMINAIS --

        // 1. forEach = executa uma função para cada elemento
        // nomes.stream().forEach(System.out::println);

        // 2. collect = transforma a stream em uma coleção
//        List<String> filtrados = nomes.stream()
//                .filter(n -> n.startsWith("I"))
//                .collect(Collectors.toList());
//        filtrados.forEach(System.out::println);

        // 3. reduce = combina os elementos em um único resultado
//        int soma = numeros.stream()
//                .reduce(0, (a, b) -> a + b);
//        System.out.println(soma);

        // 4. count = conta os elementos na stream
//        long qtd = numeros.stream().count();
//        System.out.println(qtd);
    }
}

