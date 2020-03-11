package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1,s2,s3,s4, diferencaProdutos;


		System.out.println("informe primeiro valor");
		s1 = sc.nextInt();
		System.out.println("informe segundo valor");
		s2 = sc.nextInt();
		System.out.println("informe terceiro valor");
		s3 = sc.nextInt();
		System.out.println("informe quarto valor");
		s4 = sc.nextInt();
		diferencaProdutos = (s1*s2-s3*s4);

		System.out.println("A diferença entre os produtos de " + s1 +" e " + s2 +" para o produto de "+ s3 + " e " +s4+" é " + diferencaProdutos);

		sc.close();
	}

}
