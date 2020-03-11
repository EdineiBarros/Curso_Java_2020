package exercicio13;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("digite a coordenada X: ");
		double coordenadaX = sc.nextDouble();
		System.out.println("digite a coordenada Y: ");
		double coordenadaY = sc.nextDouble();

		if (coordenadaX==0 && coordenadaY==0){
			System.out.println("As coordenadas "+coordenadaX+" e "+coordenadaY+" pertencem ao ponto de origem");
		}
		else if (coordenadaX<0 && coordenadaY<0){
			System.out.println("As coordenadas "+coordenadaX+" e "+coordenadaY+" pertencem ao Q3");
		}
		else if (coordenadaX>0 && coordenadaY<0){
			System.out.println("As coordenadas "+coordenadaX+" e "+coordenadaY+" pertencem ao Q4");
		}
		else if (coordenadaX<0 && coordenadaY>0){
			System.out.println("As coordenadas "+coordenadaX+" e "+coordenadaY+" pertencem ao Q2");
		}
		else {
			System.out.println("As coordenadas "+coordenadaX+" e "+coordenadaY+" pertencem ao Q1");
		}
		sc.close();
	}
}
