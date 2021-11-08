package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Digite o tamanho da matriz: ");
        int n = sc.nextInt();
        int [][] mat = new int [n][n]; //os dois colchetes indicam que é um arranjo bidimensional.

        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                mat [i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.printf(mat[i][i] + " ");
        }

        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (mat [i][j] < 0) {
                    count ++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);

        sc.close();
    }
}
