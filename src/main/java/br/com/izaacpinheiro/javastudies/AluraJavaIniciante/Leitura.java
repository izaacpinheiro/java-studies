package br.com.izaacpinheiro.javastudies.AluraJavaIniciante;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a Movie:");
        String movie = scanner.nextLine();

        System.out.println("Type our rate:");
        String rate = scanner.nextLine();

        System.out.println(movie);
        System.out.printf(rate);
    }
}
