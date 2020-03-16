package exercicio18;

import java.util.Scanner;

/*Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os ímpares de 1 até X,
um valor por linha, inclusive o X, se for o caso.*/

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um número e descubra os números ímpares até ele");
		int x = sc.nextInt();

		System.out.println("Os números ímpares até "+x+" são: ");
			for  (int i=0; i<=x; i++){
				if(i%2 !=0){
				System.out.println(i);
				}
			}
		sc.close();
	}
}
