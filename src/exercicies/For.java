package exercicies;

import java.util.Locale;
import java.util.Scanner;

public class For {

	Scanner in = new Scanner(System.in);
	int n, i, sum, inp = 0, out = 0, numW;;

	public void exercie() {
		/*Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo. */
		
	}
	
	public void exercice1() {
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

	public void exercice2() {

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

	public void exercice3() {

		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5
		 */

		double avg1, avg2, avg3;

		n = in.nextInt();
		double[] md = new double[n];

		Locale.setDefault(Locale.US);

		for (int i = 0; i < n; i++) {
			avg1 = in.nextDouble();
			avg2 = in.nextDouble();
			avg3 = in.nextDouble();
			md[i] = ((avg1 * 2) + (avg2 * 3) + (avg3 * 5)) / (2 + 3 + 5);
		}

		for (i = 0; i < md.length; i++) {
			System.out.println(String.format("%.1f", md[i]));
		}
	}

	public void exercice4() {
		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */
		n = in.nextInt();

		int[] x = new int[n], y = new int[n];
		double result = 0;

		for (i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		for (i = 0; i < n; i++) {

			result = (double) x[i] / y[i];
			
			if(y[i] == 0) {
				System.out.println("imposible division");
			}else {
				System.out.print(result + "\n");
			}

			
		}
	}

	public void exercice5() {
		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
		n = in.nextInt();
		if (n == 0) {
			n = 1;
		}
		sum = n;
		for (int i = 1; i < n; i++) {
			sum *= (n - i);
		}
		System.out.println(sum);

	}

	public void exercice6() {
		/* Ler um número inteiro N e calcular todos os seus divisores */

		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}

	public void exercice7() {
		/*
		 * Fazer um programa para ler um número inteiro positivo N. O programa deve
		 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha,
		 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
		 * exemplo
		 */
		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			for (int c = 1; c <= 3; c++) {
				System.out.print(String.format("%.0f", Math.pow(i, c)) + " ");
			}
			System.out.println();
		}
	}

	
}
