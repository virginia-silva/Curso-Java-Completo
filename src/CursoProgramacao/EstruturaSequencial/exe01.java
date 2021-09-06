package CursoProgramacao.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Largura : ");
        double largura = sc.nextDouble();
        System.out.println("Digite o Comprimento : ");
        double comprimento = sc.nextDouble();
        System.out.println("Digite o Metro Quadrado : ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Area é igual = %.2f%n", area);
        System.out.printf("Preco é igual = %.2f%n ",  preco);

        sc.close();

    }
}
