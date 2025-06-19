package br.com.izaacpinheiro.javastudies.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}

public class ExemplosStreams {
    public static void main(String[] args) {
        // soma de numeros pares
//        int somaPares = IntStream.range(1, 13)
//                .filter(n -> n % 2 == 0)
//                .sum();
//        System.out.println(somaPares);

        // mapeamento de objetos
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Julia", 19),
                new Pessoa("Izaac", 21)
        );
//        List<String> nomes = pessoas.stream()
//                .map(Pessoa::getNome)
//                .toList();
//        System.out.println(nomes);

        // encontrar maximo
        // Optional para lidar com possiveis valores nulos
//        Optional<Pessoa> maisVelha = pessoas.stream()
//                .max(Comparator.comparing(Pessoa::getIdade));

        List<String> nomes = Arrays.asList("Zarya", "Izaac", "Julia", "Felipe", "Miguel", "Igor", "Pedro", "Ana", "Faust");

        // streams paralelas = processamento simples com operações simples
//        long count = nomes.parallelStream()
//                .filter(n -> n.startsWith("F"))
//                .count();
//        System.out.println(count);
    }
}
