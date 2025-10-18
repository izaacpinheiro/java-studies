package br.com.izaacpinheiro.javastudies.AluraJavaIniciante;

import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nome = "Izaac Pinheiro";
        String tipoConta = "Corrente";
        double saldo = 2000;
        int opcao = 0;

        System.out.println("*********************");
        System.out.println("Nome do Cliente: " + nome);
        System.out.printf("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("*********************");

        while (opcao != 4) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Enviar valor");
            System.out.println("4 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nSaldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("\nDigite o valor que vai receber:");
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo atualizado: " + saldo);
                    break;
                case 3:
                    System.out.println("\nDigite o valor que vai enviar:");
                    valor = scanner.nextDouble();
                    if (valor > saldo){
                        System.out.println("Saldo insuficiente para enviar.");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo atualizado: " + saldo);
                    }
                    break;
                default:
                    System.out.println("\n[Operação inválida]");
                    break;
            }
        }
    }
}
