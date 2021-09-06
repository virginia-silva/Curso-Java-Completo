package CursoProgramacao.EstruturaSequencial;

import java.util.Scanner;

public class ParaLerVariosDadosMesmaLinha {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String x;
            int y;
            Double z;

            x = sc.next();
            y = sc.nextInt(); //entrada de numero inteiro
            z = sc.nextDouble();

            System.out.println("Dados Digitados: ");
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);

            sc.close();
        }
}
