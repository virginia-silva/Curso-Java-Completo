package CursoProgramacao.EstruuturaSequencial;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;

        x = sc.next(); //comando de entrada de dados, aguarda a entrada de dados.

        System.out.println("Você digitou: " + x); //imprime os dados na tela.

        sc.close(); //fechamento do programa.

    }
}
