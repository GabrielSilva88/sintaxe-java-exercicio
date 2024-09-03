package printVariablesDataTypes;

import java.util.Iterator;
import java.util.Scanner;

public class VariablesDataTypes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 * Declare uma variável chamada "nome" e atribua seu nome a ela. Mostre o valor
		 * dessa variável no console.
		 */

		String nome = "Gabriel";

		System.out.println(nome);

		/*
		 * Declare uma variável chamada "idade" e inicialize-a com o valor 30. Imprima o
		 * valor dessa variável no console duas vezes. Ex: 30 30
		 */
		int idade = 30;

		System.out.println(idade + "\n" + idade);

		/*
		 * Declare uma variável de ponto flutuante chamada "peso" e atribua o valor 75.5
		 * a ela. Faça com que apareça a seguinte frase no console: "Seu peso é: 75.5”
		 */

		double peso = 75.5;

		System.out.printf("Seu peso é: %.2f", peso);

		/*
		 * Crie uma variável booleana chamada "temInternet" e inicialize-a com um valor
		 * verdadeiro. Imprima se você tem internet ou não.
		 */

		boolean temInternet = true;

		if (temInternet == true) {
			System.out.println("\nVocê tem internet");
		} else {
			System.out.println("\nVocê não tem internet");
		}

		/*
		 * Declare uma variável de caractere chamada "letra" e inicialize-a com qualquer
		 * letra do alfabeto. Escreva essa letra conforme o exemplo: letra = 'a';
		 * 
		 * a x a x a x a x a
		 * 
		 * ou
		 * 
		 * letra = ‘B’;
		 * 
		 * B x B x B x B x B
		 */

		char letra = 'g';
		for (int i = 0; i < 5; i++) {

			System.out.print(letra + " x ");
		}

		/*
		 * Declare uma variável de string chamada "cidade" e peça ao usuário para
		 * inserir o nome da cidade onde você mora. Em seguida, imprima o nome da
		 * cidade.
		 */

		String cidade = "";
		System.out.println("Digite sua cidade de residencia: ");
		cidade = scan.nextLine();

		System.out.println("Sua cidade é " + cidade);

		/*
		 * Declare três variáveis do tipo inteiro chamadas "a", "b" e "c". Inicialize
		 * cada uma delas com valores diferentes. Modifique o valor de "a", imprima os
		 * valores de "a", "b" e "c".
		 */

		int a = 0, b = 10, c = 15;
		a = 20;

		/* opção de inserir o dado; */
//		System.out.println("\rDigite um valor: ");
//		a = scan.nextInt();

		System.out.println(a + ", " + b + " e " + c);

		/*
		 * Declare uma variável do tipo String chamada "filmeFavorito" e peça ao usuário
		 * para inserir o nome do seu filme favorito. Modifique o nome do filme e
		 * imprima o novo nome.
		 */
		String filmesFavorito = "";

		System.out.println("Digite o seu filme favorio: ");
		filmesFavorito = scan.nextLine();

		System.out.println("Sue filme favorito é " + filmesFavorito);
		
		/* alteração com variavel */
		// filmesFavorito = "Um Homem de Sorte";
		
		System.out.println(filmesFavorito);
		
		/* Fim exercicio. */
	}
}
