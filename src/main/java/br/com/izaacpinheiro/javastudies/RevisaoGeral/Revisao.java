package br.com.izaacpinheiro.javastudies.RevisaoGeral;

import java.util.ArrayList;

public class Revisao {
    public static void main(String[] args) {
        // VARIAVEIS
        int idade = 20;
        String meuNome = "Izaac";
        var nomeNamorada = "Julia";

        // DATATYPES
        // Tipos de Números Inteiros
        // byte = 9 bits -> -128 a 127
        // short = 16 bits -> -32.768 a 32.767
        // int = 32 bits -> -2.147.483.648 a 2.147.483.647
        // long = 64 bits -> mt longo n compensa

        // Tipos de Números Decimais
        // float = 32 bits -> precisao simples -> 13.26
        // double = 64 bits -> precisao dupla -> 13.2629

        // String = palavras e frases -> "Izaac"
        //char = representar um único caractere -> 'a', 'b'
        // boolean = true ou false

        // ARRAY ou VETOR
        // coleção de valores do mesmo tipo com tamanho fixo
        int[] colecaoInteiros = {1, 2, 3, 4, 5}; // passando os dados
        int[] meusNumeros = new int[5]; // definindo apenas o tamanho sem fornecer os dados

        // ARRAY LIST ou LISTAS
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Julia");
        nomes.add("Izaac");
        //System.out.printf(nomes.get(1));

        // LOOPS
        /*for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }

        for (String nome : nomes){
            System.out.println(nome);
        }*/

        /*int contador = 0;
        while (contador < 10){
            System.out.println("Estou no While");
            contador++;
        }*/

        // CASTING = mudança de tipo de dados
        double resultado = 0.0;
        int resultadoInt = (int) resultado; // casting explicito

        String minhaString = "13";
        int meuInt = Integer.parseInt(minhaString); // inteiro para string
        String minhaString2 = String.valueOf(meuInt); // string para inteiro

        // -------------------------------------------------------------------- //

        Carro carro = new Carro("Toyota Etios 1.3");
        carro.acelerer();

        // MODIFICADORES DE ACESSO
        // public -> acessíveis de qualquer pacote
        // default -> acessíveis apenas para as classes no mesmo pacote
        // private -> acessível apenas na classe definida
        // protected -> acessivel apenas na mesma classe, sub-classes e pacote
    }
}

// Classe criada
class Carro {

    String modelo;

    public Carro(String modelo){ // Construtor da classe Carro
        this.modelo = modelo;
    }

    public void acelerer(){
        System.out.println("Acelerando o " + this.modelo);
    }
}