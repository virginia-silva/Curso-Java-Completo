package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a Quantidade de termos: ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        System.out.println("Digite os Produtos e Preços: ");
        for (int i=0; i<vect.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i=0; i<vect.length; i++) {
            soma += vect[i].getPrice();
        }
        double média = soma / vect.length;
        System.out.printf("Preço médio é = %.2f%n", média);
        sc.close();
    }

}
