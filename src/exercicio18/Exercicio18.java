package exercicio18;

import java.util.Scanner;

/*Leia um valor inteiro X (1 <= X <= 1000).
Em seguida mostre os �mpares de 1 at� X,
um valor por linha, inclusive o X, se for o caso.*/

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Escolha um n�mero e descubra os n�meros �mpares at� ele");
		int x = sc.nextInt();

		System.out.println("Os n�meros �mpares at� "+x+" s�o: ");
			for  (int i=0; i<=x; i++){
				if(i%2 !=0){
				System.out.println(i);
				}
			}
		sc.close();
	}
}
