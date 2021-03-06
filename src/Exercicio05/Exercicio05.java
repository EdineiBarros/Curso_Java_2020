package exercicio05;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1,
 o valor unit�rio de cada pe�a 1,
 o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2.
 Calcule e mostre o valor a ser pago.*/

public class Exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int codigoPeca1, codigoPeca2;
		int estoquePeca1, estoquePeca2;
		double valorPeca1, valorPeca2;
		double valorDoEstoque;
		System.out.println("informe o c�digo da pe�a");
		codigoPeca1 = sc.nextInt();
		System.out.println("informe a quantidade de pe�as em estoque");
		estoquePeca1 = sc.nextInt();
		System.out.println("informe o valor unit�rio da pe�a");
		valorPeca1 = sc.nextDouble();
		System.out.println("informe o c�digo da pe�a");
		codigoPeca2 = sc.nextInt();
		System.out.println("informe a quantidade de pe�as em estoque");
		estoquePeca2 = sc.nextInt();
		System.out.println("informe o valor unit�rio da pe�a");
		valorPeca2 = sc.nextDouble();
		valorDoEstoque = (estoquePeca1 * valorPeca1) + (estoquePeca2 * valorPeca2);

		System.out.println("Um estoque com " + estoquePeca1 + " pe�as c�digo " + codigoPeca1 + " que custam "
				+ valorPeca1 + " e " + estoquePeca2 + " pe�as c�digo " + codigoPeca2 + " que custam " + valorPeca2
				+ " vale " + valorDoEstoque);

		sc.close();
	}

}
