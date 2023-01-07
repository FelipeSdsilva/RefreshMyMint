package exercises;

import controllers.ForController;
import statics.MultiplicationStatic;
import views.MensageInBlockView;
import views.MensagensObjects;
import views.StringText;

import java.util.Scanner;

public class ForExercice {

	StringText msg = new StringText();
	MensagensObjects ms = new MensagensObjects();
	Scanner in = new Scanner(System.in);
	int n, i;

	public void exercice01() {

		System.out.print(msg.mensage[40]);
		n = in.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		ForController.menuExerciseFor();
	}

	public void exercice02() {

		int a, b, c = 0, res, rest;
		System.out.println(msg.mensage[41]);

		a = in.nextInt();
		b = in.nextInt();

		res = (a > b) ? a : b;
		rest = (a < b) ? a : b;

		for (int i = rest; i < res; i++) {

			if (i % 2 == 1 || i % -2 == -1 && i != rest) {
				c += i;
			}
		}

		System.out.println(msg.mensage[42] + c);

		ForController.menuExerciseFor();
	}

	public void exercice03() {
		System.out.print(msg.xAndY[0]);
		int x = in.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}

		ForController.menuExerciseFor();
	}

	public void exercice04() {

		System.out.print(msg.array[0]);
		n = in.nextInt();

		int inp = 0, out = 0, numW;

		for (i = 0; i < n; i++) {

			System.out.print(msg.array[1]);
			numW = in.nextInt();

			if (numW >= 10 && numW <= 20) {
				inp += 1;
			} else {
				out += 1;
			}
		}

		System.out.println(inp + msg.mensage[43] + "\n" + out + msg.mensage[44]);
		ForController.menuExerciseFor();
	}

	public void exercice05() {

		System.out.print(msg.array[0]);
		n = in.nextInt();

		for (i = 0; i < n; i++) {

			System.out.print(msg.array[1]);
			int numW = in.nextInt();

			if (numW % 2 == 1 && numW > 0) {
				System.out.println(msg.mensage[45]);
			} else if (numW % 2 == 0 && numW > 0) {
				System.out.println(msg.mensage[46]);
			} else if (numW == 0) {
				System.out.println(msg.mensage[49]);
			} else if (numW % -2 == -1 && numW < 0) {
				System.out.println(msg.mensage[47]);
			} else if (numW % -2 == 0 && numW < 0) {
				System.out.println(msg.mensage[48]);
			}

		}

		ForController.menuExerciseFor();
	}

	public void exercice06() {

		double avg1, avg2, avg3;

		System.out.print(msg.array[0]);
		n = in.nextInt();

		// double[] md = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println(msg.mensage[22]);
			avg1 = in.nextDouble();
			avg2 = in.nextDouble();
			avg3 = in.nextDouble();
			double md = ((avg1 * 2) + (avg2 * 3) + (avg3 * 5)) / (2 + 3 + 5);
			System.out.println(ms.student[6] + String.format("%.1f", md));
		}

		/*
		 * for (i = 0; i < md.length; i++) { System.out.println(String.format("%.1f",
		 * md[i])); }
		 */

		ForController.menuExerciseFor();
	}

	public void exercice07() {

		System.out.print(msg.array[0]);
		n = in.nextInt();

		// int[] x = new int[n], y = new int[n];
		double result = 0;

		for (i = 0; i < n; i++) {

			System.out.print(msg.mensage[52]);
			int x = in.nextInt();

			System.out.print(msg.mensage[51]);
			int y = in.nextInt();

			result = (double) x / y;

			if (y == 0) {
				System.out.println(msg.mensage[50]);
			} else {
				System.out.printf(msg.mensage[53], result);
			}

		}

		ForController.menuExerciseFor();
	}

	public void exercice08() {

		int sum;

		System.out.print(msg.mensage[0]);
		n = in.nextInt();

		if (n == 0) {
			n = 1;
		}

		sum = n;
		for (int i = 1; i < n; i++) {
			sum *= (n - i);
		}

		System.out.println(msg.mensage[54] + sum);

		ForController.menuExerciseFor();
	}

	public void exercice09() {

		MensageInBlockView msgb = new MensageInBlockView();

		char experiment;

		double percRabbit = 0, percFrog = 0, percMouse = 0, expTotal = 0, rabbit = 0, frog = 0, mouse = 0, d;

		System.out.print(msg.mensage[55]);
		n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(msg.mensage[56]);
			d = in.nextInt();

			expTotal += d;

			System.out.print(msg.mensage[57]);
			experiment = in.next().charAt(0);

			if (experiment == 'C' || experiment == 'c') {
				rabbit += d;
			} else if (experiment == 'R' || experiment == 'r') {
				mouse += d;
			} else if (experiment == 'S' || experiment == 's') {
				frog += d;
			}
		}
		percFrog = MultiplicationStatic.percentageOfvalue(expTotal, frog);
		percRabbit = MultiplicationStatic.percentageOfvalue(expTotal, rabbit);
		percMouse = MultiplicationStatic.percentageOfvalue(expTotal, mouse);

		System.out.printf(msgb.blocExercice9For, expTotal, rabbit, mouse, frog, percRabbit, percMouse, percFrog);

		ForController.menuExerciseFor();
	}

	public void exercice10() {
		//divisores_D_n     [x] Udemy 
		
		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		ForController.menuExerciseFor();
	}

	public void exercice11() {
		//Quadrado_Cubo_D_N [x] Udemy 
		
		n = in.nextInt();

		for (i = 1; i <= n; i++) {
			for (int c = 1; c <= 3; c++) {
				System.out.print(String.format("%.0f", Math.pow(i, c)) + " ");
			}

			System.out.println();
		}

		ForController.menuExerciseFor();
	}
}
