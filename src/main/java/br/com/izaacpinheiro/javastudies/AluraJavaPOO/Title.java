package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

import br.com.izaacpinheiro.javastudies.AluraJavaPOO.exceptions.ErroConversaoDeAnoException;

public class Title implements Comparable<Title> {
    private String name;
    private int year;
    private boolean includedInPlan;
    private double sumRating;
    private int totalRating;
    private int durationInMinutes;

    public Title(String name, int year) {
        this.name = name;
        this.year = year;
    }

    // construtor para converter um record em title
    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0 ,3).strip());
        if (myTitleOmdb.year().length() > 4) {
            // nossa exception criada
            throw new ErroConversaoDeAnoException("Conversão de ano impossivel pois tem mais de 4 caracteres");
        }
        this.year = Integer.valueOf(myTitleOmdb.year());
    }

    public void showInfos() {
        System.out.println(name);
        System.out.println(year);
        System.out.println(durationInMinutes);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void avaliar(double nota) {
        sumRating += nota;
        totalRating++;
    }

    public double average() {
        return sumRating / totalRating;
    }

    public int getTotalRating() {
        return totalRating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // implementado o Comparabl<> para quando quiser comparar classes criadas a partir de alguma lógica
    // é preciso dar Override para implementar a lógica de comparação
    @Override
    public int compareTo(Title anotherTitle) {
        // comparando e ordenando por nome
        return this.getName().compareTo(anotherTitle.getName());
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", year=" + year;
    }
}
