package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Digite um nº inteiro : ");

        int n = sc.nextInt();

        if (n<0){
            System.out.printf("Este número é negativo!");
        }
        else
        {
            System.out.printf("Este número é positivo: ");
        }
        sc.close();
    }
}
