package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class LendoCaractere {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char x;

        x = sc.next().charAt(0); //entrada de numero inteiro

        System.out.println("Você digitou: " + x);

        sc.close();

    }

}
