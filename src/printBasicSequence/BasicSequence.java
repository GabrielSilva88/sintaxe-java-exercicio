package printBasicSequence;

import java.util.Scanner;

public class BasicSequence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* 1) Escreva um programa que mostre na tela a mensagem "Olá, Mundo!" */
		
		System.out.println("Olá, Mundo! ou Hello, World!");
		
		/* 2) Faça um programa que leia o nome de uma pessoa  e mostre uma mensagem de boas-vindas para ela:
				Ex:
				Qual é o seu nome? João da Silva
				Olá João da Silva, é um prazer te conhecer!	
		 */

		System.out.println("Olá, qual é seu nome ? ");
		String nome = scan.nextLine();
		System.out.println("Olá" + nome + ", é um prazer te conhecer!");

		/* 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
				Ex:
				Nome do Funcionário: Maria do Carmo
				Salário: 1850,45
				O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
		 */
		System.out.println("Digite nome: ");
		String nomeFunc = scan.nextLine();
		System.out.println("Digite o Salario");
		double salarioFunc = scan.nextDouble();
		System.out.println("O funcionário " + nomeFunc + " tem um salário de " +salarioFunc);
	}
}
