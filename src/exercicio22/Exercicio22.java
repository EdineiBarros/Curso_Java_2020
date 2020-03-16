package exercicio22;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa para ler um número N.
Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

public class Exercicio22 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas divisões você quer efetuar");
		int n = sc.nextInt();

		double dividendo = 0;
		double divisor = 0;
		double quociente = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Informe o dividendo:");
			dividendo = sc.nextDouble();
			System.out.println("Informe o divisor:");
			divisor = sc.nextDouble();

			if (divisor == 0) {
				System.out.println("qualquer número dividido por zero resulta em zero");
			} else {
				quociente = (double) dividendo / divisor;
				System.out.printf("o resultado da divisão de " + dividendo + " por " + divisor + " é %.1f%n",
						quociente);
			}
		}
		sc.close();
	}
}
