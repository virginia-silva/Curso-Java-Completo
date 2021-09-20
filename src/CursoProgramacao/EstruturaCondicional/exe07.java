package CursoProgramacao.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite um valor para x dentro do intervalo [-180 e 180] : ");
        double x = sc.nextDouble();
        System.out.printf("Digite um valor para y dentro do intervalo [-180 e 180] : ");
        double y = sc.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.printf("Origem!!!");
        }
        else if(x == 0.0){
            System.out.println("Eixo y");
        }
        else if (y == 0.0){
            System.out.println("Eixo x");
        }
        else if (x > 0.0 && y > 0.0){
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0){
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0){
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0){
            System.out.println("Q4");
        }
        sc.close();
    }
}
