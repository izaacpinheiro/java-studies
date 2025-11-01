package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setName("Scream");
        movie1.setYear(1996);
        movie1.setDurationInMinutes(111);

        movie1.showInfos();
        movie1.avaliar(10);
        movie1.avaliar(8);
        movie1.avaliar(6);

        System.out.println(movie1.getTotalRating());

        Serie serie = new Serie();
        serie.setName("Dark");
        serie.setYear(2017);
        serie.setSeasons(3);
        serie.setEpisodesPerSeason(8);
        serie.setMinutesPerEpisode(40);

        System.out.println("Maratonar Dark: " + serie.getDurationInMinutes());
    }
}
