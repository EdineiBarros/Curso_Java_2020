package exercicio07;

import java.util.Scanner;
//Aula - 35
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
