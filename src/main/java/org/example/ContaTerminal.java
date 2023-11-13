package org.example;

import java.util.Scanner;

public class ContaTerminal {
    // TODO: conhecer e importar a classe Scanner
    // Exibir as mensagens para o nosso usuário
    // Obter pela classe scanner os valores digitados no terminal
    // Exibir a mensagem conta criada
    // Número (conta) inteiro ok
    // Agência String
    // Nome do cliente String
    // Saldo Double

    public static void main(String[] args) {

        double saldo = 237.48;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número da conta: ");
        int conta = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite o nome do cliente: ");
        String cliente = sc.next();

        System.out.println("Olá " + cliente + ", obrigado por criar uma conta em" +
                " nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo +
                " já está disponível para saque.");

    }



}
