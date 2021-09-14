package CursoProgramacao.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um valor para A : ");
        double A = sc.nextDouble();
        System.out.printf("Digite um valor para B : ");
        double B = sc.nextDouble();
        System.out.printf("Digite um valor para C : ");
        double C = sc.nextDouble();

        double triangulo, circulo, trapezio, quadrado, retangulo;

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("Área do triangulo é : %.3f%n",triangulo);
        System.out.printf("Área do círculo é : %.3f%n",circulo);
        System.out.printf("Área do trapézio é : %.3f%n",trapezio);
        System.out.printf("Área do quadrado é : %.3f%n",quadrado);
        System.out.printf("Área do retângulo é : %.3f%n",retangulo);

        sc.close();

    }
}
