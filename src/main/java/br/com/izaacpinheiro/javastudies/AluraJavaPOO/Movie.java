package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

public class Movie extends Title implements Classifiable {
    private String director;

    // se a classe pai tem construtor, os filhos também tem que ter
    public Movie(String name, int year) {
        super(name, year);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassifiable() {
        return (int) average() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + this.getYear() + ")";
    }
}
