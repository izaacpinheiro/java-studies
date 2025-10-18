package br.com.izaacpinheiro.javastudies.AluraJavaIniciante;

public class Main {
    public static void main(String[] args) {
        // Curso da Alura: Java: Criando sua primeira aplicação
        // Faz parte do G9 - ONE
        // Esse curso e os próximos que virão servirão de revisão para minha jornada

        System.out.println("Netflix!");
        System.out.println("Film: Ativdade Paranormal");

        int year = 2007;
        System.out.println("Year of Release: " + year);
        boolean includedInPlan = false;
        double rating = 6.3; // imdb
        double myRating = 8.5;

        double average = (rating + myRating) / 2;

        String sinopse = "After moving into a suburban home, a couple becomes increasingly disturbed by a nightly demonic presence.";
        System.out.println(sinopse);

        // Fazendo conversão de double para int (casting explicito)
        int stars = (int) average / 2;
        System.out.println("Stars: " + stars);
    }
}
