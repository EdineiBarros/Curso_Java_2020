package exercicio08;

import java.util.Scanner;

/*Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar*/

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe o n�mero");
		numero = sc.nextInt();

		if (numero % 2 == 0){
			System.out.println(numero+" � um n�mero par");
		}
		else{
			System.out.println(numero+" � um n�mero �mpar");
		}

		sc.close();

	}

}



