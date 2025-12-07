package br.com.izaacpinheiro.javastudies.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsStreamsAlura {
    public static void main(String[] args) {
        // 1
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("João");
        funcionarios.add("Ana");
        funcionarios.add("Fernanda");
        funcionarios.add("Matheus");
        //System.out.println("Lista de Funcionários: " + funcionarios);

        // 2
        List<String> alunos = new ArrayList<>();
        alunos.add("Joana");
        alunos.add("Lucas");
        alunos.add("Pedro");
        alunos.add("Antônio");
        System.out.println("Alunos iniciais: " + alunos);
        alunos.remove("Pedro");
        //System.out.println("Alunos finais: " + alunos);

        // 3
        //System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        //System.out.println("Total de funcionários: " + funcionarios.size());

        // 4
        Set<String> eventos = new HashSet<>();
        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");
        //System.out.println("Lista de Eventos: " + eventos);

        // 5
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Izaac");
        clientes.put(2, "Julia");
        clientes.put(3, "Pedro");
        clientes.put(4, "Miguel");
        clientes.put(5, "Carlos");
        //System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));

        // 6
        int id = 6;
        if (clientes.containsKey(id)) {
            //System.out.println("O nome do cliente com ID " + id + " é: " + clientes.get(id));
        } else {
            //System.out.println("Cliente com ID " + id + " não encontrado.");
        }

        // 7
        List<String> nomesFiltrados = funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .collect(Collectors.toList());
       //System.out.println(nomesFiltrados);

        // 8
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);
        List<Integer> resultados = numeros.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        //System.out.println("Quadrado dos números: " + resultados);

        // 9
        List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        double valorTotal = precosProdutos.stream().reduce(0.0, Double::sum);
        double imposto = valorTotal * 0.08;
        double totalComImposto = valorTotal + imposto;
        //System.out.println("Valor total antes do imposto: " + String.format("%.2f", valorTotal));
        //System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", totalComImposto));

        // 10
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
        double sumNotas = notas.stream().reduce(0.0, Double::sum);
        double media = sumNotas / notas.size();
        double maiorNota = notas.stream().max(Double::compare).get();
        double menorNota = notas.stream().min(Double::compare).get();
//        System.out.println("Média das notas: " + media);
//        System.out.println("Maior nota: " + maiorNota);
//        System.out.println("Menor nota: " + menorNota);
    }
}
