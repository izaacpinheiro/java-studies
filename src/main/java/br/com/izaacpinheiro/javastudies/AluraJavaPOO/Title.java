package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

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
}
