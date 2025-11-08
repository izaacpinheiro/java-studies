package br.com.izaacpinheiro.javastudies.DesafioListas;

public class Item implements Comparable<Item> {
    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Item: " + this.getNome() + " R$ " + this.getValor();
    }

    @Override
    public int compareTo(Item outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }
}
