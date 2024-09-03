package printBasicMathematicalOperations;

import java.util.Scanner;

public class MathematicaOperations {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Escreva um programa que solicite dois números ao usuário e, em seguida,
		 * calcule a soma desses números usando o operador de adição (+). Em seguida,
		 * exiba o resultado.
		 */

		int N = 0, M = 0;

		System.out.println("Digite 1 Número: ");
		N = scan.nextInt();

		System.out.println("Digite 2 Número: ");
		M = scan.nextInt();

		int soma = N + M;
		System.out.println(soma);

		/*
		 * Crie um programa que calcule a média de três números inteiros usando o
		 * operador de adição (+) e o operador de divisão (/). Peça ao usuário para
		 * inserir os três números e, em seguida, calcule a média e exiba o resultado.
		 */

		System.out.println("Digite 3 números sequidos:");

		System.out.println("Valor 1");
		int o = scan.nextInt();
		System.out.println("Valor 2");
		int p = scan.nextInt();
		System.out.println("Valor 3");
		int q = scan.nextInt();

		int media = (o + p + q) / 3;

		System.out.println("Valor da média: " + media);

		/*
		 * Faça um programa que calcule a diferença entre dois números inteiros usando o
		 * operador de subtração (-). Peça ao usuário para inserir os números e exiba a
		 * diferença.
		 */

		int x = 0, z = 0, sub;

		System.out.println("Digite valor numerico 1: ");
		x = scan.nextInt();
		System.out.println("Digite valor numerico 1: ");
		z = scan.nextInt();
		sub = x - z;

		System.out.println("Difereça entre valores é " + sub);

		/*
		 * Escreva um programa que calcule o troco em reais ao comprar um item de valor
		 * X com uma nota de valor Y, usando o operador de subtração (-). Solicite ao
		 * usuário que insira o valor do item e o valor da nota, e exiba o troco.
		 */

		System.out.println("Digite valor do produto: ");
		double r = scan.nextDouble();
		System.out.println("Digite valor da nota: ");
		double t = scan.nextDouble();
		double subt = r - t;

		System.out.println("Difereça entre valores é " + subt);

		/*
		 * Desenvolva um programa que calcule o produto de dois números inteiros usando
		 * o operador de multiplicação (*). Peça ao usuário para inserir os números e
		 * exiba o resultado.
		 */

		System.out.println("Digite 1 valor: ");
		int a = scan.nextInt();
		System.out.println("Digite 2 valor: ");
		int g = scan.nextInt();

		int mult = a * g;

		System.out.println("Reposta é: ");

		/*
		 * Crie um programa que converta a quantidade de minutos em horas usando o
		 * operador de multiplicação (*). Peça ao usuário para inserir a quantidade de
		 * minutos e exiba o equivalente em horas.
		 */

		System.out.println("Converter horas em minutos\nDigite -> ");
		int minuto = scan.nextInt();

		int horas = minuto * 60;

		System.out.println(" Convertida em minutos são " + horas);

		/*
		 * Faça um programa que calcule o quociente da divisão entre dois números
		 * inteiros usando o operador de divisão (/). Peça ao usuário para inserir os
		 * números e exiba o quociente.
		 */

		System.out.println("Digite dois numero para divição");
		System.out.println("Digite 1 número: ");
		int U = scan.nextInt();
		System.out.println("Digite 2 número: ");
		int D = scan.nextInt();

		double div = (double) U / D;

		System.out.println("Valor da divisão é " + div);

		/*
		 * Escreva um programa que calcule o preço por unidade de um produto, dado o
		 * preço total e a quantidade, usando o operador de divisão (/). Solicite ao
		 * usuário que insira o preço total e a quantidade e exiba o preço por unidade
		 */

		System.out.println("digite o valor total: ");
		double vTotal = scan.nextDouble();
		System.out.println("Digite a quantidade produto: ");
		int qtd = scan.nextInt();

		double uni = vTotal / qtd;

		System.out.println("Valor unitario: " + uni);

		/*
		 * Desenvolva um programa que calcule o resto da divisão entre dois números
		 * inteiros usando o operador de módulo (%). Peça ao usuário para inserir os
		 * números e exiba o resultado.
		 */

		System.out.println("");

		/*
		 * Crie um programa em Java que siga as etapas a seguir:
		 * 
		 *  
		 */

		// 1) Solicite ao usuário que insira três números do tipo double
		System.out.println("Digite o Tres números ");
		System.out.println("Digite 1: ");
		double u = scan.nextDouble();
		System.out.println("Digite 2: ");
		double d = scan.nextDouble();
		System.out.println("Digite 3: ");
		double tr = scan.nextDouble();

		// 2) Calcule a soma desses três números
		double somaTres = u + d + tr;
		System.out.printf("Valor somado é %.0f\n" , somaTres);
		
		//3) Multiplique a soma obtida por 3
		
		double multTres = somaTres * 3;
		System.out.println(" Multiplicar a soma por 3 é " + multTres);
		//4) Calcule e exiba o resto da divisão do resultado anterior por 5.
		
		double resto = multTres % 5;
		System.out.println("Resto da diviçã " + resto);
		
		
		
	}
}
