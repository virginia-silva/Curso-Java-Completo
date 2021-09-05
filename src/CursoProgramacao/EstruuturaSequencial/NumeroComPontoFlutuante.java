package CursoProgramacao.EstruuturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class NumeroComPontoFlutuante {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US); //determina o uso de , ou . conforme localização.
        Scanner sc = new Scanner(System.in);

        double x;

        x = sc.nextDouble(); //entrada de numeros com ponto flutuante;

        //System.out.println("Você digitou: " + x );
        System.out.printf("Você digitou: %.2f%n" , x );

        sc.close();

    }

}
