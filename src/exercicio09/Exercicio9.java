package exercicio09;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B).
 Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 indicando se os valores lidos são múltiplos entre si.
 Atenção: os números devem poder ser digitados em ordem crescente ou decrescente.*/

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Informe o primeiro número");
		numero1 = sc.nextInt();

		System.out.println("Informe o segundo número");
		numero2 = sc.nextInt();

		if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
			System.out.println("Os números "+numero1+" e "+numero2+" são multiplos");
		}
		else{
			System.out.println("Os números "+numero1+" e "+numero2+" NÃO são multiplos");
		}

		sc.close();

	}

}
