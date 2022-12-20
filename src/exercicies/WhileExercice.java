package exercicies;

import java.util.Scanner;

import controllers.WhileController;
import statics.ConditionalStatic;
import statics.DivisionStatic;
import views.MensagensObjects;
import views.StringText;

public class WhileExercice {

	StringText msg = new StringText();
	MensagensObjects ms = new MensagensObjects();
	Scanner in = new Scanner(System.in);

	public void exercice01() {

		int x = 2, y = 0;
		do {

			System.out.println(msg.mensage[31]);
			x = in.nextInt();
			y = in.nextInt();

			ConditionalStatic.ascendingAndDescendingOrder(x, y);
		} while (x != y);

		WhileController.menuExerciciesWhile();
	}

	public void exercice02() {

		int x = 1, y = 0, sum = 0;

		System.out.println(ms.person[14]);

		while (x > 0) {
			x = in.nextInt();
			if (x > 0) {
				sum += x;
				y++;
			}
		}

		if (sum > 1) {
			DivisionStatic.averageAgeIndeterminateNumbers(y, sum);
		} else {
			System.out.println(msg.mensage[58]);
		}

		WhileController.menuExerciciesWhile();

	}

	public void exercice03() {

		int password;

		System.out.print(msg.mensage[59]);

		do {

			password = in.nextInt();

			if (password != 2002) {
				System.out.print(msg.mensage[60]);
			}

		} while (password != 2002);

		System.out.println(msg.mensage[61]);
		WhileController.menuExerciciesWhile();
	}

	public void exercice04() {

		int x, y;

		do {

			x = in.nextInt();
			y = in.nextInt();
			ConditionalStatic.planCartesian('U', x, y);

		} while (x != 0 && y != 0);

		/* Form 2 */
		WhileController.menuExerciciesWhile();
	}

	public void exercice05() {

		double av1, av2, avg = 0;

		System.out.print(ms.student[0]);
		av1 = in.nextDouble();
		avg += ConditionalStatic.validatorOfPositiveNumber(av1);

		while (av1 < 0 || av1 > 10) {
			ConditionalStatic.validatorOfAvaliation(av1);
			av1 = in.nextDouble();
			avg += ConditionalStatic.validatorOfPositiveNumber(av1);
		}

		System.out.print(ms.student[1]);
		av2 = in.nextDouble();
		avg += ConditionalStatic.validatorOfPositiveNumber(av2);

		while (av2 < 0 || av2 > 10) {
			ConditionalStatic.validatorOfAvaliation(av2);
			av2 = in.nextDouble();
			avg += ConditionalStatic.validatorOfPositiveNumber(av2);
		}

		DivisionStatic.averageAgeIndeterminateNumbers(2, avg);

		WhileController.menuExerciciesWhile();
	}

	public void exercice06() {

		ConditionalStatic.acresentNumber();
		WhileController.menuExerciciesWhile();
	}

	public void exercice07() {

		int n = 1, sum = 0;

		do {

			System.out.print(msg.mensage[62]);
			n = in.nextInt();

			for (int i = n; i < (n + 10); i++) {

				if (i % 2 == 0) {
					sum += i;
				}
			}

			if (n != 0) {
				System.out.println(msg.xAndY[2] + sum);
			} else {
				sum = n;
			}
			sum = 0;
		} while (n != 0);

		WhileController.menuExerciciesWhile();
	}

	public void exercice08() {

		char cont;

		do {
			System.out.print(msg.mensage[26]);
			double celciuos = in.nextDouble();
			System.out.println(msg.mensage[25]
					+ String.format("%.1f", ConditionalStatic.convertTemperatureCelciusAndFahrenheit(' ', celciuos)));
			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
		} while (cont != 'n');

		WhileController.menuExerciciesWhile();
	}

	public void exercice09() {

		int a, b, c;
		char cont;

		do {
			System.out.println(msg.mensage[22]);
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			ConditionalStatic.biggerDistance(a, b, c);

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);

		} while (cont != 'n' && cont != 'N');

		WhileController.menuExerciciesWhile();
	}

}
