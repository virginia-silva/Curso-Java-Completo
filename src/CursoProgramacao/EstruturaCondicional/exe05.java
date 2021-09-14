package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------------");

        System.out.println("CODIGO           ITEM             PREÇO");

        System.out.println("   1        Cachorro Quente      R$4,00");
        System.out.println("   2        X-Salada             R$4,50");
        System.out.println("   3        X-Bacon              R$5,00");
        System.out.println("   4        Torrada Simples      R$2,00");
        System.out.println("   5        Refrigerante         R$1,50");

        System.out.println("----------------------------------------");


        System.out.printf("Digite o Código do Produto : ");
        int codigo = sc.nextInt();

        System.out.printf("Digite a quantidade desejada: ");
        int qtda = sc.nextInt();

        double total;
        if (codigo == 1) {
            total = qtda * 4.0;
        }
        else if (codigo == 2) {
            total = qtda * 4.5;
        }
        else if (codigo == 3) {
            total = qtda * 5.0;
        }
        else if (codigo == 4) {
            total = qtda * 2.0;
        }
        else {
            total = qtda * 1.5;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();

    }
}
