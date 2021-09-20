package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um número inteiro : ");
        int num = sc.nextInt();

        // ([0,25], (25,50], (50,75], (75,100])

        if (num < 0.0 || num > 100.0) {
            System.out.println("Fora de intervalo");
        }

        else if(num <= 25.0){
            System.out.printf("O número esta dentro do intervalo [0 e 25]");
        }
        else if(num <= 50.0){
            System.out.printf("O número esta dentro do intervalo [25 e 50]");
        }
        else if(num <= 75.0) {
            System.out.printf("O número esta dentro do intervalo [50 e 75]");
        }
        else if(num <= 100.0) {
            System.out.printf("O número esta dentro do intervalo [75 e 100]");
        }
        sc.close();
    }
}
