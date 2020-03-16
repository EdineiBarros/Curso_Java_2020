package exercicio04;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário,
seu número de horas trabalhadas, o valor que recebe por hora
e calcula o salário desse funcionário.
A seguir, mostre o número e o salário do funcionário,
com duas casas decimais*/

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int codigoEmpregado;
		int horasTrabalhadas;
		double salarioHora;
		double salarioMensal;

		System.out.println("informe o código do empregado");
		codigoEmpregado = sc.nextInt();
		System.out.println("informe o número de horas trabalhadas pelo empregado");
		horasTrabalhadas = sc.nextInt();
		System.out.println("informe o valor por hora do empregado");
		salarioHora = sc.nextDouble();
		salarioMensal = salarioHora*horasTrabalhadas;

		System.out.println("O funcionário " + codigoEmpregado +" ganha por hora " + salarioHora +" , por ter trabalhado " + horasTrabalhadas+ " tem a receber " + salarioMensal);

		sc.close();
	}

}
