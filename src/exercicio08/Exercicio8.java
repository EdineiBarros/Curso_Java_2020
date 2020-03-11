package exercicio08;

import java.util.Scanner;
//Aula - 35
public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe o número");
		numero = sc.nextInt();

		if (numero % 2 == 0){
			System.out.println(numero+" é um número par");
		}
		else{
			System.out.println(numero+" é um número ímpar");
		}

		sc.close();

	}

}



