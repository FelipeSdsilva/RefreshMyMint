package exercicies;

import java.util.Locale;
import java.util.Scanner;

import controllers.ForController;
import views.StringText;

public class ForExercice {

	StringText msg = new StringText();
	Scanner in = new Scanner(System.in);
	int n, i;

	public void exercice01() {

		System.out.print(msg.mensage[40]);
		n = in.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		ForController.menuExerciciesFor();
	}

	public void exercice02() {

		int a = in.nextInt();
		int b = in.nextInt();
		int c = 0;
		int res = (a > b) ? a : b;
		int rest = (a < b) ? a : b;

		for (int i = rest; i < res; i++) {
			if (i % 2 == 1 || i % -2 == 1) {
				System.out.println(i);
				c += i;
			}
		}

		System.out.println(c);

		ForController.menuExerciciesFor();
	}

	public void exercice03() {

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
		ForController.menuExerciciesFor();
	}

	public void exercice04() {

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
		ForController.menuExerciciesFor();
	}

	public void exercice05() {

		n = in.nextInt();

		int[] x = new int[n], y = new int[n];
		double result = 0;

		for (i = 0; i < n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		for (i = 0; i < n; i++) {

			result = (double) x[i] / y[i];

			if (y[i] == 0) {
				System.out.println("imposible division");
			} else {
				System.out.print(result + "\n");
			}

		}

		ForController.menuExerciciesFor();
	}

	public void exercice06() {

		int sum;

		n = in.nextInt();
		if (n == 0) {
			n = 1;
		}
		sum = n;
		for (int i = 1; i < n; i++) {
			sum *= (n - i);
		}

		System.out.println(sum);
		ForController.menuExerciciesFor();
	}

	public void exercice07() {

		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		ForController.menuExerciciesFor();
	}

	public void exercice08() {

		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			for (int c = 1; c <= 3; c++) {
				System.out.print(String.format("%.0f", Math.pow(i, c)) + " ");
			}

			System.out.println();
		}

		ForController.menuExerciciesFor();
	}
}
