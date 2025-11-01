package br.com.izaacpinheiro.javastudies.AluraJavaPOO;

public class Calculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void add(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
