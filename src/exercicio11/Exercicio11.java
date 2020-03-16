package exercicio11;

import java.util.Locale;
import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item
 e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar:
1 --------> Cachorro Quente --------> 4.00
2 --------> X-Salada 		--------> 4.50
3 --------> X-Bacon 		--------> 5.00
2 --------> Torrada Simples --------> 2.00
2 --------> Refrigerante 	--------> 1.50
*/

public class Exercicio11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigoPedido, quantidadePedido;
		double valorConta = 0;

		System.out.println("Bem vindo a lanchonete");
		System.out.println("Selecione o item pelo código do cardápio");
		System.out.println("1 --------> Cachorro Quente --------> 4.00");
		System.out.println("2 --------> X-Salada --------> 4.50");
		System.out.println("3 --------> X-Bacon --------> 5.00");
		System.out.println("2 --------> Torrada Simples --------> 2.00");
		System.out.println("2 --------> Refrigerante --------> 1.50");
		codigoPedido = sc.nextInt();
		System.out.println("Boa escolha! Quantas unidades você quer?");
		quantidadePedido = sc.nextInt();

		if (codigoPedido == 1) {
			valorConta = quantidadePedido * 4.00;
		} else if (codigoPedido == 2) {
			valorConta = quantidadePedido * 4.50;
		} else if (codigoPedido == 3) {
			valorConta = quantidadePedido * 5.00;
		} else if (codigoPedido == 4) {
			valorConta = quantidadePedido * 2.00;
		} else if (codigoPedido == 5) {
			valorConta = quantidadePedido * 1.50;
		}

		System.out.printf("Total: R$ %.2f%n", valorConta);
		sc.close();
	}

}
