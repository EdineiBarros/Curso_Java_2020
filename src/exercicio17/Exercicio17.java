package exercicio17;

import java.util.Scanner;

/*Um Posto de combustíveis deseja determinar
qual de seus produtos tem a preferência de seus clientes.
Escreva um algoritmo para ler o tipo de combustível abastecido
(codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
Caso o usuário informe um código inválido (fora da faixa de 1 a 4)
deve ser solicitado um novo código (atéque seja válido).
O programa será encerrado quando o código informado for o número 4.
Deve ser escrito a mensagem: "MUITO OBRIGADO"
e a quantidade de clientes que abasteceram cada tipo de combustível*/

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int gnv = 0;
		int tentativasInvalidas = 0;

		System.out.println("Escolha seu combustível");
		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				alcool += 1;
				System.out.println("Você abasteceu com Álcool");
			} else if (tipo == 2) {
				gasolina += 1;
				System.out.println("Você abasteceu com Gasolina");
			} else if (tipo == 3) {
				gnv += 1;
				System.out.println("Você abasteceu com GNV");
			} else {
				System.out.println("Combustível inválido");
				tentativasInvalidas +=1;
			}
			tipo = sc.nextInt();

		}
		System.out.println(alcool + " pessoas abasteceram com álcool");
		System.out.println(gasolina + " pessoas abasteceram com gasolina");
		System.out.println(gnv + " pessoas abasteceram com GNV");
		System.out.println(tentativasInvalidas + " pessoas selecionaram uma opção inválida");
		System.out.println("Obrigado");
		sc.close();
	}
}
