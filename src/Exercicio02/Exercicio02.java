package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler o valor do raio de um círculo,
e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double raio, pi, area;

		System.out.println("informe o raio");
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi * Math.pow(raio, 2);

		System.out.printf("A área do cículo com o raio" + raio + " é %.4f", area);

		sc.close();
	}

}
