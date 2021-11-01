package estruturaRepetitivaFor;

import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de termos : ");

		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println("O termo ímpar é : " + i);
			}
		}
		
		sc.close();
	}

}
