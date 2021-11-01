package estruturaRepetitivaFor;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o número de termos para a soma: ");
		int n = sc.nextInt();
		int soma = 0;
		
		System.out.println("Digite os termos : ");
		
		for(int i = 0; i < n; i++) {
		int x = sc.nextInt();
		soma = soma + x	;	
		}
		
		System.out.println("A soma dos termos é : " + soma);
		sc.close();
	}

}
