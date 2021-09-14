package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um primeiro número inteiro: ");
        int p1 = sc.nextInt();
        System.out.printf("Digite o segundo número inteiro: ");
        int p2 = sc.nextInt();

        if (p1 % p2 ==0 || p2 % p1 == 0){
            System.out.printf("São Multiplos");
        } else {
            System.out.printf("Não são multiplos");
        }
        sc.close();
    }
}
