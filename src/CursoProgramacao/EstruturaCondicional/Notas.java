package CursoProgramacao.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a primeira nota : ");
        double nota1 = sc.nextDouble();
        System.out.printf("Digite a segunda nota : ");
        double nota2 = sc.nextDouble();


        double somanota = nota1 + nota2;

        if (somanota < 60) {
            System.out.printf(" Aluno Reprovado");
        }
        else
            System.out.printf("Aluno Aprovado");

        sc.close();
    }
}
