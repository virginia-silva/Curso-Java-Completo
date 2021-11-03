package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.printf("Entre com o número da conta bancária: ");
        int number = sc.nextInt();
        System.out.printf("Digite o nome do titular da conta: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.printf("Tem depósito inicial (s / n)?: ");
        char response = sc.next(). charAt(0);

        if(response == 's'){
            System.out.printf("Digite o valor inicial: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }

        System.out.println();
        System.out.println("Data da Conta: ");
        System.out.println(account);

        System.out.println();

        System.out.printf("Entre com valor para depósito: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Saldo atualizado: ");
        System.out.println(account);

        System.out.printf("Entre com valor para saque: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Saldo atualizado: ");
        System.out.println(account);

        sc.close();
    }
}
