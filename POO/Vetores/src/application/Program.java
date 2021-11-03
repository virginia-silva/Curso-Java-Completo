package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a quantidade de dados do vetor : ");
        int n = sc.nextInt();

        System.out.println("Digite os termos: ");

        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for(int i = 0; i < n; i++){
            soma += vect[i];
        }

        double média = soma / n;

        System.out.printf("A média é igual a :" + média);

        sc.close();
    }
}
