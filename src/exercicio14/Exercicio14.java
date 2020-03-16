package exercicio14;

import java.util.Locale;
import java.util.Scanner;

/*Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
Em seguida, calcule e mostre o valor que esta pessoa deve pagar de Imposto de Renda,
segundo a tabela abaixo:
ALIQUOTAS DE IMPOSTO DE RENDA
RENDA					ALIQUOTA
0.00 	A 2000.00		ISENTO
2000.01 A 3000.00		8%
3000.01 A 4500.00		18%
MAIS QUE 4500.00		28%
*/

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
