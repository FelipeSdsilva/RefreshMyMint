package exercicies;

import java.util.Scanner;

import statics.StaticFixation;
import views.StringText;

public class WhileExercice {

	StringText msg = new StringText();
	Scanner in = new Scanner(System.in);

	public void exercice01() {
		/*
		 * Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
		 * Escreva para cada X e Y uma mensagem que indique se estes valores foram
		 * digitados em ordem crescente ou decrescente. O programa deve finalizar quando
		 * forem digitados dois valores iguais.
		 */
	}

	public void exercice02() {
		/*
		 * Faça um programa para ler um número indeterminado de dados, contendo cada um,
		 * a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém
		 * um valor de idade negativa. Calcular e imprimir a idade média deste grupo de
		 * indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a
		 * mensagem "IMPOSSIVEL CALCULAR".
		 */
	}

	public void exercice03() {

		int password;

		do {
			System.out.print("Write your password: ");
			password = in.nextInt();
			if (password == 2002) {
				System.out.println("Passwor valid");
			} else {
				System.out.println("Passwor invalid");
			}
		} while (password != 2002);

	}

	public void exercice04() {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		@SuppressWarnings("unused")
		int x, y;

		/*
		 * Form one do { x = in.nextInt(); y = in.nextInt(); if (x >= 1 && y >= 1) {
		 * System.out.println("Firsth"); } else if (x <= -1 && y >= 1) {
		 * System.out.println("Second"); } else if (x <= -1 && y <= -1) {
		 * System.out.println("Third"); } else if (x >= 1 && y <= -1) {
		 * System.out.println("Fourth"); } } while (x != 0 && y != 0);
		 */

		/* Form 2 */

	}

	public void exercice05() {
		/*
		 * Faça um programa que leia as notas referentes às duas avaliações de um aluno.
		 * Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas
		 * válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve
		 * ser validada separadamente.
		 */
	}

	public void exercice06() {
	
		int alchool = 0, fuel = 0, diesel = 0, n;

		do {
			n = in.nextInt();
			if (n == 1) {
				alchool += 1;
			} else if (n == 2) {
				fuel += 1;
			} else if (n == 3) {
				diesel += 1;
			}
		} while (n != 4);

		String mensage = """
				Very thanks
				Alchool = """ + alchool + """

				Fuel =  """ + fuel + """

				Diesel = """ + diesel;

		System.out.println(mensage);
	}

	public void exercice07() {
		/*
		 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá
		 * parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
		 * dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor
		 * de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da
		 * operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
		 * exemplo, a saída deve ser 80, que é a soma de 12+14+16+18+20.
		 */
	}

	public void exercice08() {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa
		 */

		char cont;

		do {
			System.out.print(msg.mensage[26]);
			double celciuos = in.nextDouble();
			System.out.println(msg.mensage[25]
					+ String.format("%.1f", StaticFixation.convertTemperatureCelciusAndFahrenheit(' ', celciuos)));
			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
		} while (cont != 'n');
	}

	public void exercice09() {

		int a, b, c;
		char cont;

		do {
			System.out.println(msg.mensage[22]);
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			StaticFixation.biggerDistance(a, b, c);

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
		} while (cont != 'n' && cont != 'N');
	}
}
