package exercicio10;

import java.util.Scanner;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do jogo,
sabendo que o mesmo pode come�ar em um dia e terminar em outro,
tendo uma dura��o m�nima de 1 hora e m�xima de 24 horas.*/

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicio, horaFim, duracao;


		System.out.println("Que horas o jogo come�ou?");
		horaInicio = sc.nextInt();
		System.out.println("Que horas o jogo terminou?");
		horaFim = sc.nextInt();

		if (horaInicio < horaFim ){
			duracao = horaFim - horaInicio;
		}
		else{
			duracao = 24 -horaInicio + horaFim;
		}
		if (duracao == 1){
			System.out.println("o jogo durou 1 hora");
		}
		else {
			System.out.println("o jogo durou "+duracao+" horas ");
		}
		sc.close();
	}
}
