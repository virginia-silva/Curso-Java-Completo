package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2º número: ");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;

        System.out.printf(" A soma é igual = " + soma);

        sc.close();

    }
}