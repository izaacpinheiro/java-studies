package br.com.izaacpinheiro.javastudies.DesafioListas;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
    // lista de itens que serão adicionados
    private List<Item> itens;
    private double limite;
    private double saldo;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.itens = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        if (this.saldo >= item.getValor()) {
            this.itens.add(item);
            this.saldo -= item.getValor();
            return true;
        }
        return false;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}
