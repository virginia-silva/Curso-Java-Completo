package CursoProgramacao.EstruturaCondicional;

import java.util.Scanner;

public class exe04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite a primeira hora: ");
        int ph = sc.nextInt();
        System.out.printf("Digite a segunda hora: ");
        int sh = sc.nextInt();

        int duracao;

        if (ph < sh){
            duracao = sh - ph;
        }
        else {
            duracao = 24 - ph + sh;
        }
        System.out.printf("O jogo durou " + duracao + "horas.");

        sc.close();
    }
}
