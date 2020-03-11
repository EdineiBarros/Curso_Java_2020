package exercicio07;

import java.util.Scanner;
//Aula - 35
public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe o número");
		numero = sc.nextInt();

		if (numero < 0){
			System.out.println(numero+" é um número negativo");
		}
		else{
			System.out.println(numero+" é um número positivo");
		}

		sc.close();

	}

}
