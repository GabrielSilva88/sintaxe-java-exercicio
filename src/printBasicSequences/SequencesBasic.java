package printBasicSequences;

import java.util.Scanner;

public class SequencesBasic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1) Escreva um programa que mostre na tela a mensagem "Olá, Mundo!"

		System.out.println("Olá, mundo!");

		/*
		 * 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de
		 * boas-vindas para ela: Ex: Qual é o seu nome? João da Silva Olá João da Silva,
		 * é um prazer te conhecer!
		 */

		System.out.println("Qual é o seu nome? ");
		String nome = scan.nextLine();

		System.out.println("Olá, " + nome + ", é um prazer te conhecer!");

		/*
		 * 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando
		 * no final uma mensagem. Ex: Nome do Funcionário: Maria do Carmo Salário:
		 * 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
		 */

		System.out.println("Qual é o nome do funcionario? ");
		String nomeFuncionario = scan.nextLine();

		System.out.println("Qual é o salario do funcionario? ");
		double salario = scan.nextDouble();

		System.out.println("O funcionario " + nomeFuncionario + " tem um salário de R$" + salario + " em setembro");

		/*
		 * 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o
		 * somatório entre eles. Ex: Digite um valor: 8 Digite outro valor: 5 A soma
		 * entre 8 e 5 é igual a 13.
		 */
		System.out.println("Digite um valor: ");
		int n1 = scan.nextInt();

		System.out.println("Digite outro valor: ");
		int n2 = scan.nextInt();
		int soma = n1 + n2;

		System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " + soma);

		/*
		 * 5) Faça um programa que leia as duas notas de um aluno em uma matéria e
		 * mostre na tela a sua média na disciplina. Ex: Nota 1: 4.5 Nota 2: 8.5 A média
		 * entre 4.5 e 8.5 é igual a 6.5
		 */

		double nt1 = 0, nt2 = 0, media = 0;

		System.out.println("Digite 1 notar: ");
		nt1 = scan.nextDouble();

		System.out.println("Digite 2 valor: ");
		nt2 = scan.nextDouble();

		media = (nt1 + nt2) / 2;

		System.out.println("A média entre " + nt1 + " e " + nt2 + " é igual a " + media);

		/*
		 * 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e
		 * seu sucessor. Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é
		 * 10
		 */

		System.out.println("Digie um número: ");
		int n = scan.nextInt();

		int at = n - 1;
		int sc = n + 1;

		System.out.println("O antecessor de " + n + " é " + at + "\nO sucessor de " + n + " é " + sc);

		/*
		 * 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
		 * sua terça parte. Ex: Digite um número: 3.5 O dobro de 3.5 é 7.0 A terça parte
		 * de 3.5 é 1.16666
		 */

		System.out.println("Digie um número: ");
		double num = scan.nextInt();

		double dobro = num * 2;
		double terca = num / 3;

		System.out.printf("O dobro de %f é %f. %n" + "A terça parte de %f é %f", num, dobro, num, terca);

		/*
		 * 8) Desenvolva um programa que leia uma distância em metros e mostre os
		 * valores relativos em outras medidas. Ex: Digite uma distância em metros:
		 * 185.72 A distância de 85.7m corresponde a: 0.18572km — 1.8572hm 18.572dam —
		 * 1857.2dm 18572.0cm — 185720.0mm
		 */

		System.out.println("Digite uma distância em metros: ");
		double metros = scan.nextDouble();

		System.out.println("A distância de " + metros + "m corresponde a: ");
		System.out.println("Em kilometro é " + (metros / 1000) + "km");
		System.out.println("Em hectomêtros é " + (metros / 100) + "hm");
		System.out.println("Em decâmetro " + (metros / 10) + "dam");
		System.out.println("Em milímetros " + (metros * 1000) + "mm");
		System.out.println("Em centímetros  " + metros + "cm");
		System.out.println("Em decímentros " + metros + "dm");

		/*
		 * 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em
		 * R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$4,95.
		 * dolar hoje = 5,65 (data pesquisa 03/09/2024)
		 */

		System.out.println("Na carteria, qual o seu valor?: ");
		double valorReal = scan.nextDouble();

		double valorDolar = valorReal * 5.65;

		System.out.printf("Valor em dolar é US$%.2f", valorDolar);

		/*
		 * 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
		 * mostre a área a ser pintada e a quantidade de tinta necessária para o
		 * serviço, sabendo que cada litro de tinta pinta uma área de 2 metros
		 * quadrados.
		 */

		System.out.println("Digite a Altura: ");
		double alt = scan.nextDouble();

		System.out.println("Digite a Largura: ");
		double lar = scan.nextDouble();

		double qtdTinta = (alt * lar) * 2;

		System.out.printf("A quentidade de tintas é %.2f", qtdTinta);

		/*
		 * 11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
		 * segundo grau e mostre o valor de Delta.
		 */

		System.out.println("Valores de uma equação de 2ª Grau \nDigite valor de A: ");
		int a = scan.nextInt();
		System.out.println("Digite valor de B: ");
		int b = scan.nextInt();
		System.out.println("Digite valor de C: ");
		int c = scan.nextInt();

		// Ax²+bx+c=0 formula delta ▲=b²-4xaxc;
		int delta = (b * b) - (4 * a * c);

		System.out.println("Valor do ▲ é " + delta);

		/*
		 * 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
		 * PREÇO PROMOCIONAL, com 5% de desconto.
		 */

		System.out.println("Digite o valor do produto: ");
		double valorProd = scan.nextDouble();

		double desconto = (valorProd * 5) / 100;

		System.out.printf("O produto tem valor %.2f tem desconto 5% o valor é %.2f", valorProd, desconto);

		/*
		 * 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre
		 * o seu novo salário, com 15% de aumento.
		 */

		System.out.println("Digite valor Salário: ");
		double salFunc = scan.nextDouble();

		double aumento = (salFunc * 15) / 100;

		System.out.println("O salário recebel aumento de 15% saldo é " + aumento);

		/*
		 * 14) A locadora de carros precisa da sua ajuda para cobrar seus serviços.
		 * Escreva um programa que pergunte a quantidade de km percorridos por um carro
		 * alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço
		 * total a pagar, sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
		 */
		
			System.out.println("Digite a kilometragem: ");
			double kilometragem = scan.nextDouble();
			
			double valorRodado = kilometragem * 0.20;
			
			System.out.println("Digite dias utilizados");
			int dias = scan.nextInt();
			
			int valorAlugado = dias * 90;
			
			double totalPagar = valorRodado + valorAlugado;
			System.out.printf("O carro cust é %.2f", totalPagar );
			
		/*
		 * 15) Crie um programa que leia o número de dias trabalhados em um mês e mostre
		 * o salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha
		 * R$25 por hora trabalhada
		 */

			System.out.println("Digite o dias trabalhado: ");
			int diasTrabalhado = scan.nextInt();
			
			int horaTrabalho = diasTrabalhado * 8;
			
			double salarioHoras = horaTrabalho * 25;
			
			System.out.println("O valor do salário é "+salarioHoras);
		/*
		 * DESAFIO Escreva um programa para calcular a redução do tempo de vida de um
		 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
		 * ele já fumou. Considere que um fumante perde 10min de vida a cada cigarro.
		 * Calcule quantos dias de vida um fumante perderá e exiba o total em dias.
		 */
			
			
	}
}
