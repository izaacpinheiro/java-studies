package br.com.izaacpinheiro.javastudies.AluraJavaIniciante;

public class Condicional {
    public static void main(String[] args) {
        int year = 2007;
        boolean includedInPlan = true;
        double rating = 6.3; // imdb
        double myRating = 8.5;
        String planType = "plus";

        if (year >= 2010) {
            System.out.println("The film is recent");
        } else {
            System.out.println("The film is old");
        }

        // usar .equals para comparar strings
        if (includedInPlan || planType.equals("plus")) {
            System.out.println("Film available");
        } else {
            System.out.println("Pay the rent");
        }
    }
}
