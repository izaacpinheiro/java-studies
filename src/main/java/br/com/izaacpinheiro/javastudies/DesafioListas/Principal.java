package br.com.izaacpinheiro.javastudies.DesafioListas;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limie do cartão: ");
        Cartao cartao = new Cartao(scanner.nextDouble());

        int opc = 1;
        while(opc != 0){
            System.out.println("Digite a descrição da compra:");
            String item = scanner.next();

            System.out.println("Digite o valor da compra:");
            double valor = scanner.nextDouble();

            boolean compraRealizada = cartao.addItem(new Item(item, valor));
            if (compraRealizada) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 1 para continuar ou 0 para sair.");
                opc = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                opc = 0;
            }
        }

        System.out.println("----------------------------");
        System.out.println("Compras Realizadas");
        Collections.sort(cartao.getItens());
        for (Item i : cartao.getItens()) {
            System.out.println(i.getNome() + " - " + i.getValor());
        }
        System.out.println("----------------------------");
        System.out.println("Saldo do cartão: " + cartao.getSaldo());
    }
}
