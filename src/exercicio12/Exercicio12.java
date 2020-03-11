package exercicio12;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite um valor: ");
		double valor = sc.nextDouble();


		if (valor<0){
			System.out.println("O valor "+valor+" é um número negativo fora do intervalo");
		}
		else if (valor>=0 && valor<=25){
			System.out.println("O valor "+valor+" pertence ao intervalo 0,25");
		}
		else if (valor>=25 && valor<=50){
			System.out.println("O valor "+valor+" pertence ao intervalo 25.01,50");
		}
		else if (valor>=50 && valor<=75){
			System.out.println("O valor "+valor+" pertence ao intervalo 50.01,75");
		}
		else if (valor>=75 && valor<=100){
			System.out.println("O valor "+valor+" pertence ao intervalo 75.01,100");
		}
		else{
			System.out.println("O valor "+valor+" é um número positivo fora do intervalo");
		}
		sc.close();


	}
}
