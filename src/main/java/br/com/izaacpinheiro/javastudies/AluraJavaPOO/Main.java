package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Scream", 1996);
        movie1.setDurationInMinutes(111);
        movie1.avaliar(10);
        movie1.avaliar(8);
        movie1.avaliar(6);

        System.out.println(movie1.getTotalRating());

        Serie serie = new Serie("Dark", 2017);
        serie.setSeasons(3);
        serie.setEpisodesPerSeason(8);
        serie.setMinutesPerEpisode(40);

        System.out.println("Maratonar Dark: " + serie.getDurationInMinutes() + " minutos");

        // Inicio novo curso sobre Listas da Alura
        // usando var como tipo de variável mas ele faz inferência que é um Movie()
        var movie2 = new Movie("The Thing", 1982);
        movie2.setDurationInMinutes(109);
        movie2.avaliar(9);

        // definir pelo "mais genérico" tipo da variável
        List<Title> lista = new ArrayList<>();
        lista.add(movie1);
        lista.add(movie2);
        lista.add(serie);

        // usar o Java Doc para saber mais sobre a documentação
        for (Title item : lista) {
            System.out.println(item.getName());
            // conferindo se o item é uma instacia de Movie
            if (item instanceof Movie movie){
                System.out.println("Classificação: " + movie.getClassifiable());
            }
        }

        // definindo uma ordenação com base no ano
        lista.sort(Comparator.comparing(Title::getYear));
        System.out.println(lista);

        // ordenação
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Pedro Pascal");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Nicolas Cage");

        // métodos de ordenação -> ordenando aqui em ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
    }
}
