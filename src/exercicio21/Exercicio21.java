package exercicio21;

import java.util.Locale;
import java.util.Scanner;

/*Leia um valor inteiro N.
Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20]
e quantos est�o fora do intervalo, mostrando essas informa��es conforme exemplo
(use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

public class Exercicio21 {
		public static void main(String[] args) {

			Locale.setDefault(Locale.US);

			Scanner sc = new Scanner(System.in);

			System.out.println("Quantas vezes voc� quer realizar a m�dia ponderada de 3 n�meros?");
			int n = sc.nextInt();

			double a = 0;
			double b = 0;
			double c = 0;
			double mediaPonderada = 0;

			for (int i=0; i<n; i++) {
				System.out.println("Digite o primeiro n�mero:");
				a = sc.nextDouble();
				System.out.println("Digite o segunda n�mero:");
				b = sc.nextDouble();
				System.out.println("Digite o terceiro n�mero:");
				c = sc.nextDouble();

				mediaPonderada = (a*2+b*3+c*5)/10;

				System.out.printf("A m�dia ponderada dos n�meros "+a+" ,"+b+" e "+c+" � %.1f%n",mediaPonderada );
			}


			sc.close();
		}
	}
