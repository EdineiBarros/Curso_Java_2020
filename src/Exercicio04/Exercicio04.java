package Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int codigoEmpregado;
		int horasTrabalhadas;
		double salarioHora;
		double salarioMensal;

		System.out.println("informe o c�digo do empregado");
		codigoEmpregado = sc.nextInt();
		System.out.println("informe o n�mero de horas trabalhadas pelo empregado");
		horasTrabalhadas = sc.nextInt();
		System.out.println("informe o valor por hora do empregado");
		salarioHora = sc.nextDouble();
		salarioMensal = salarioHora*horasTrabalhadas;

		System.out.println("O funcion�rio " + codigoEmpregado +" ganha por hora " + salarioHora +" , por ter trabalhado " + horasTrabalhadas+ " tem a receber " + salarioMensal);

		sc.close();
	}

}
