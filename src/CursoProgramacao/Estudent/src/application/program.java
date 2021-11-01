package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		
		System.out.printf("Digite do nome do Estudante : ");			
		student.name = sc.nextLine();
		
		System.out.printf("Digite a primeira nota 1 : ");
		student.nota1 = sc.nextDouble();
		System.out.printf("Digite a primeira nota 2 : ");
		student.nota2 = sc.nextDouble();
		System.out.printf("Digite a primeira nota 3 : ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("A nota final do Aluno é : %.2f%n", student.notaFinal());
		
		if (student.notaFinal() < 60.0) {
				System.out.println("Reprovado");
				System.out.printf("Faltou %.2f Pontos.%n", student.notaParaPassar());
			}
			else {
					System.out.println("Passou");
			}
			sc.close();
	}

}
