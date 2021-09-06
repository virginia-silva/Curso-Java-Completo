package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o valor de A : ");
        double A = sc.nextDouble();
        System.out.printf("Digite o valor de B : ");
        double B = sc.nextDouble();
        System.out.printf("Digite o valor de C : ");
        double C = sc.nextDouble();
        System.out.printf("Digite o valor de D : ");
        double D = sc.nextDouble();

        double AB = A * B;
        double CD = C * D;

        double diferenca = AB - CD;

        System.out.println("A diferença do produto AB - CD é : " + diferenca);

        sc.close();
    }
}
