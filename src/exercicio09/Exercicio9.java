package exercicio09;

import java.util.Scanner;
//Aula - 35
public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2;

		System.out.println("Informe o primeiro n�mero");
		numero1 = sc.nextInt();

		System.out.println("Informe o segundo n�mero");
		numero2 = sc.nextInt();

		if (numero1 % numero2 == 0 || numero2 % numero1 == 0){
			System.out.println("Os n�meros "+numero1+" e "+numero2+" s�o multiplos");
		}
		else{
			System.out.println("Os n�meros "+numero1+" e "+numero2+" N�O s�o multiplos");
		}

		sc.close();

	}

}
