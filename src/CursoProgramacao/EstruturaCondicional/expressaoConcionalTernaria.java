package CursoProgramacao.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class expressaoConcionalTernaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("digite o preço da peça : ");
        double preco = sc.nextDouble();
        double desconto = (preco < 20.00) ? preco * 0.1 : preco * 0.05;//expressão ternária
        //(condição) ? valor se verdadeiro : valor se falso

        System.out.printf("O valor de desconto é de R$ %.2f%n", desconto);

        sc.close();

    }
}
