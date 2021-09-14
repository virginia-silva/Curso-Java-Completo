package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número inteiro: ");

        int n = sc.nextInt();

        if (n % 2 == 0){
            System.out.printf("Este número é par!");
        }
        else {
            System.out.printf("Este número é Impar!");
        }
        sc.close();
    }
}
