package exercicio04;

import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o n�mero de um funcion�rio,
seu n�mero de horas trabalhadas, o valor que recebe por hora
e calcula o sal�rio desse funcion�rio.
A seguir, mostre o n�mero e o sal�rio do funcion�rio,
com duas casas decimais*/

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
