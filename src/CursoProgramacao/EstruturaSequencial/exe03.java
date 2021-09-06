package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio: ");

        double n1 = sc.nextDouble();
        double pi = 3.14159;

        double area = n1 * n1 * pi;

        System.out.printf("Area do círculo é igual = %.4f%n",area);

        sc.close();
    }
}
