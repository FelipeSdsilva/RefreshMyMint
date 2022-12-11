package controllers;

import java.util.Scanner;

import views.StringText;

public class InitialController {

	public static void menuInitial() {

		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		char cont = ' ';
		int n;

		do {

			System.out.print("");
			n = in.nextInt();

			switch (n) {
			case 1: {
				ArrayController.menuExercicesArray();
				break;
			}
			case 2: {
				ConditionalStructureController.menuExerciceConditional();
				break;
			}
			case 3: {
				ForController.menuExerciceFor();
				break;
			}
			case 4: {
				OrientObjectExcControll.menuExerOrientationObject();
				break;
			}
			case 5: {
				SequentialStrutureController.menuExerciceSequential();
				break;
			}
			case 6: {
				WhileController.menuExercicesWhile();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);

		} while (cont != 'n');

		in.close();
	}
}