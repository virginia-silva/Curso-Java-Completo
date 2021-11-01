package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o 1º número : ");
		double n1 = sc.nextDouble();
		System.out.printf("Digite o 2º número : ");
		double n2 = sc.nextDouble();
		
		double soma = n1 + n2;
		
		System.out.println("A soma é igual : " + soma);
		
		sc.close();
		
	}

}
