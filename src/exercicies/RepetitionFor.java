package exercicies;

import java.util.Scanner;

public class RepetitionFor {

	Scanner in = new Scanner(System.in);
	int n, i, som;

	public void exercicie1() {
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		n = in.nextInt();

		int[] array = new int[n];

		for (i = 0; i < array.length; i++) {
			array[i] = i;
			if (i % 2 == 1) {
				System.out.println(array[i]);
			}
		}
	}

	public void exercicie2() {

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */

		n = in.nextInt();
		int inp = 0, out = 0, numW;

		for (i = 0; i < n; i++) {
			numW = in.nextInt();
			if (numW >= 10 && numW <= 20) {
				inp += 1;
			} else {
				out += 1;
			}
		}

		String msg = """
				""" + inp + """
				  in
				""" + out + """
				  out
				""";

		System.out.println(msg);

	}

	public void exercicie3() {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5
		 */

		n = in.nextInt();

	}

	public void exercicie4() {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
	}

	public void exercicie5() {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
	}

	public void exercicie6() {
		/* Ler um número inteiro N e calcular todos os seus divisores */

		n = in.nextInt();

		int[] array = new int[n];

		for (i = 1; i < array.length; i++) {
			array[i] = i;
			if (n % i == 0) {
				System.out.println(array[i]);
			}
		}
	}
}
