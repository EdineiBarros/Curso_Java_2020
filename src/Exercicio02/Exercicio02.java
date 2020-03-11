package exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double raio, pi, area;


		System.out.println("informe o raio");
		raio = sc.nextDouble();
		pi = 3.14159;
		area = pi*Math.pow(raio, 2);

		System.out.printf("A área do cículo com o raio" + raio +" é %.4f" , area);

		sc.close();
	}

}
