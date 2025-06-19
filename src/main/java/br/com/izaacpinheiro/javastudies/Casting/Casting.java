package br.com.izaacpinheiro.javastudies.Casting;

public class Casting {
    public static void main(String[] args) {
        // Converter tipos primitivos
        // (casting)

        double dd = 10.10;
        short ss = 32;

        float x = (float) dd / ss; // casting explicito para um float

        int idade = (int) 100000000000000000L; // long -> int
        System.out.print(idade); // há perda de dados para a conversão
    }
}
