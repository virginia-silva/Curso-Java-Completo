package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o nome do funcionário : ");
        String fun = sc.next();
        System.out.printf("Digite o nº do funcionário : ");
        double n = sc.nextDouble();
        System.out.printf("Informe o número de horas trabalhadas : ");
        double h = sc.nextDouble();
        System.out.printf("Informe o valo pago por hora : ");
        double v = sc.nextDouble();

        double salario = h * v;

        System.out.printf("O funcionário " + fun);
        System.out.printf(" recebe : R$ %.2f%n", salario);

    }
}
