package CursoProgramacao.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o seu salário : ");
        double salario = sc.nextDouble();
        System.out.printf("Está correto R$ %.2f%n", salario);

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.println("----------------------------------");
            System.out.printf("O imposto a ser pago é : R$ %.2f%n", imposto);
        }
        sc.close();
    }
}
