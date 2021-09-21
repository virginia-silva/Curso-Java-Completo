package CursoProgramacao.EstruturaCondicional;

import java.sql.SQLOutput;
import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("-----------");
        System.out.println("D****** = 1");
        System.out.println("S****** = 2");
        System.out.println("T****** = 3");
        System.out.println("Q****** = 4");
        System.out.println("Q****** = 5");
        System.out.println("S****** = 6");
        System.out.println("S****** = 7");
        System.out.println("-----------");

        System.out.printf("Digite a opção desejada: ");
        int x = sc.nextInt();
        String dia;

        switch (x){
            case 1:
                dia = "Hoje é Domingo";
                break;
            case 2:
                dia = "Hoje é Segunda";
                break;
            case 3:
                dia = "Hoje é Terça";
                break;
            case 4:
                dia = "Hoje é Quarta";
                break;
            case 5:
                dia = "Hoje é Quinta";
                break;
            case 6:
                dia = "Hoje é Sexta";
                break;
            case 7:
                dia = "Hoje é Sabádo";
                break;
            default:
                dia = "Valor Inválido.";
                break;
        }

        System.out.println(dia);

        sc.close();
    }
}
