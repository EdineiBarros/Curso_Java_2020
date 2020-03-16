package exercicio01;

import java.util.Scanner;


/*Faça um programa para ler dois valores inteiros,
e depois mostrar na tela a soma desses números com uma
mensagem explicativa*/

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
