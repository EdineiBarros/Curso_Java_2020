package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,resultado;

		System.out.println("informe primeiro valor");
		s1 = sc.nextInt();
		System.out.println("informe segundo valor");
		s2 = sc.nextInt();
		resultado = s1 + s2;

		System.out.println("O resultado da soma de " + s1 +" + " + s2 +" é " + resultado);

		sc.close();
	}

}
