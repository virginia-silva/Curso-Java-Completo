package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class entradaDeNumeroInteiro {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt(); //entrada de numero inteiro

        System.out.println("Você digitou: " + x );

        sc.close();
    }
}
