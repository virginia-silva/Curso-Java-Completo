package CursoProgramacao.EstruturaCondicional;
import java.util.Scanner;

public class ExemploIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.printf("Que hora são : ");
        hora = sc.nextInt();

        if (hora <= 12) {
            System.out.printf("Bom dia !");
        } else {
            if (hora <= 18) {
                System.out.printf("Boa Tarde!");
            }
            else
                System.out.printf("Boa Noite !");

            sc.close();
        }
    }
}
