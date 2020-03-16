package exercicio21;

import java.util.Locale;
import java.util.Scanner;

/*Leia um valor inteiro N.
Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20]
e quantos estão fora do intervalo, mostrando essas informações conforme exemplo
(use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).*/

public class Exercicio21 {
		public static void main(String[] args) {

			Locale.setDefault(Locale.US);

			Scanner sc = new Scanner(System.in);

			System.out.println("Quantas vezes você quer realizar a média ponderada de 3 números?");
			int n = sc.nextInt();

			double a = 0;
			double b = 0;
			double c = 0;
			double mediaPonderada = 0;

			for (int i=0; i<n; i++) {
				System.out.println("Digite o primeiro número:");
				a = sc.nextDouble();
				System.out.println("Digite o segunda número:");
				b = sc.nextDouble();
				System.out.println("Digite o terceiro número:");
				c = sc.nextDouble();

				mediaPonderada = (a*2+b*3+c*5)/10;

				System.out.printf("A média ponderada dos números "+a+" ,"+b+" e "+c+" é %.1f%n",mediaPonderada );
			}


			sc.close();
		}
	}
