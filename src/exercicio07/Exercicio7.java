package exercicio07;

import java.util.Scanner;


/*Fazer um programa para ler um n�mero inteiro,
 e depois dizer se este n�mero � negativo ou n�o.*/

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe o n�mero");
		numero = sc.nextInt();

		if (numero < 0){
			System.out.println(numero+" � um n�mero negativo");
		}
		else{
			System.out.println(numero+" � um n�mero positivo");
		}

		sc.close();

	}

}
