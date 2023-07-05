package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o tipo de conta - 'Corrente' ou 'Poupança': ");
        String conta = scanner.nextLine();

        System.out.println("Digite o valor do seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("------------**---------------");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("------------**---------------");
        System.out.println("Nome: " + nome);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo);

        int opcao = 0;
        double adicionaValor = 0;
        double retiraValor = 0;

        while (opcao != 4) {
            System.out.println("-------------&&---------------");
            System.out.println("Selecione uma das opções abaixo: ");
            System.out.println("-------------&&---------------");
            System.out.println("""
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                      """);
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: " + nome);
                    System.out.println("Tipo de conta: " + conta);
                    System.out.println("Saldo Inicial: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja adicionar a sua conta: ");
                    adicionaValor = scanner.nextDouble();
                    adicionaValor += saldo;
                    System.out.println("Saldo atualizado: " + adicionaValor);
                    saldo = adicionaValor;
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja retirar da sua conta: ");
                    retiraValor = scanner.nextDouble();

                    if (retiraValor > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else{
                    saldo -= retiraValor;
                    System.out.println(saldo);
                    }break;
                case 4:
                    System.out.println("Encerrando a aplicação, saindo da sua conta! ");


            }
        }
    }
}


