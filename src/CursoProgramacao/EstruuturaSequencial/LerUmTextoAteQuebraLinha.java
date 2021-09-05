package CursoProgramacao.EstruuturaSequencial;

import java.util.Scanner;

public class LerUmTextoAteQuebraLinha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();//LER TEXTO ATÉ A QUEBRA DE LINHA
        s2 = sc.nextLine();
        s3 = sc.nextLine();


        System.out.println("Dados Digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}

//CRTL + SHIFT + L = INDENTACAO AUTOMATICA