package printConsole;

public class Imprimir {
	public static void main(String[] args) {

		/* Utilizando System.out.println(), imprima seu sobrenome. */

		System.out.println("Miguel e o meu sobrenome.");

		/* Com System.out.println(), exiba o resultado da multiplicação de 3 por 9. */

		System.out.println(3 * 9);

		/* Imprima uma frase curta sobre o clima atual usando System.out.println(). */

		System.out.println("Olinda, Pernambuco 28º parcialmente nublado.");

		/* Mostre a hora atual usando System.out.println(). */

		System.out.println("São 14:51");

		/* Utilizando System.out.print(), imprima seu nome. */

		System.out.print("Gabriel" + "Miguel");

		/* Com System.out.print(), exiba o resultado da soma de 5 + 7. */

		System.out.print(5 + 7);

		/*
		 * Imprima uma mensagem com três palavras de sua escolha usando
		 * System.out.print().
		 */

		System.out.print(" Sectunsempra, Experliamus e AvadaKedabra ");

		/*
		 * Mostre a data de hoje (ou qualquer data que você preferir) usando
		 * System.out.print().
		 */

		System.out.print("\nTerça-Feira, 27 de Agosto 15:06" + "27/02/2024");

		/*
		 * Utilizando System.out.printf(), imprima seu nome e idade no formato
		 * "Nome: [seu nome], Idade: [sua idade]".
		 */

		System.out.printf("\n Nome: %S e Idade: %d", "Gabriel", 1054);

		/*
		 * Com System.out.printf(),, exiba o resultado da divisão de 20 por 4 no formato
		 * "Resultado: [resultado]".
		 */

		System.out.printf("\n Resultado: %d", (20 / 4));

		/*
		 * Imprima um número decimal com duas casas decimais usando
		 * System.out.printf(),.
		 */

		System.out.printf("\n %d ", 587654);

		/*
		 * Mostre seu peso com uma precisão de uma casa decimal usando
		 * System.out.printf(),.
		 */

		System.out.printf("\rPeso: %.2f", 85.55);
	}
}
