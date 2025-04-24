package edu.miguel.thirdweek.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário e obter os valores digitados no terminal
        System.out.println("Por favor, insira o número da sua conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine(); //

        System.out.println("Insira o número da sua agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do saldo a depositar: ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}
