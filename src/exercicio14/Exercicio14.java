package exercicio14;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args){
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a renda mensal: ");
		double renda = sc.nextDouble();
		double desconto;

		if (renda<=0){
			System.out.println("Renda inválida");
		}
		else if (renda>=0 && renda<=2000){
			System.out.println("para a renda "+renda+" o trabalhador é ISENTO");
		}
		else if (renda>=2000 && renda<=3000){
			desconto = renda*0.08;
			System.out.printf("para a renda "+renda+" deve ser efetuado desconto de %.2f%n",desconto);
		}
		else if (renda>=3000 && renda<=4500){
			desconto = renda*0.18;
			System.out.printf("para a renda "+renda+" deve ser efetuado desconto de %.2f%n",desconto);
		}
		else {
			desconto = renda*0.28;
			System.out.printf("para a renda "+renda+" deve ser efetuado desconto de %.2f%n",desconto);
		}
		sc.close();


	}
}
