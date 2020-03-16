package exercicio17;

import java.util.Scanner;

/*Um Posto de combust�veis deseja determinar
qual de seus produtos tem a prefer�ncia de seus clientes.
Escreva um algoritmo para ler o tipo de combust�vel abastecido
(codificado da seguinte forma: 1.�lcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usu�rio informe um c�digo inv�lido (fora da faixa de 1 a 4)
deve ser solicitado um novo c�digo (at�que seja v�lido).
O programa ser� encerrado quando o c�digo informado for o n�mero 4.
Deve ser escrito a mensagem: "MUITO OBRIGADO"
e a quantidade de clientes que abasteceram cada tipo de combust�vel*/

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int gnv = 0;
		int tentativasInvalidas = 0;

		System.out.println("Escolha seu combust�vel");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
				System.out.println("Voc� abasteceu com �lcool");
			} else if (tipo == 2) {
				gasolina += 1;
				System.out.println("Voc� abasteceu com Gasolina");
			} else if (tipo == 3) {
				gnv += 1;
				System.out.println("Voc� abasteceu com GNV");
			} else {
				System.out.println("Combust�vel inv�lido");
				tentativasInvalidas +=1;
			}
			tipo = sc.nextInt();

		}
		System.out.println(alcool + " pessoas abasteceram com �lcool");
		System.out.println(gasolina + " pessoas abasteceram com gasolina");
		System.out.println(gnv + " pessoas abasteceram com GNV");
		System.out.println(tentativasInvalidas + " pessoas selecionaram uma op��o inv�lida");
		System.out.println("Obrigado");
		sc.close();
	}
}
