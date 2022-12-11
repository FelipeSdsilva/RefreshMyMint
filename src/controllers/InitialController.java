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

			System.out.print(msg.menuIn[0]);
			n = in.nextInt();

			switch (n) {
			case 1: {
				ArrayController.menuExerciciesArray();
				break;
			}
			case 2: {
				ConditionalStructureController.menuExerciciesConditional();
				break;
			}
			case 3: {
				ForController.menuExerciciesFor();
				break;
			}
			case 4: {
				OrientObjectExcControll.menuExerOrientationObject();
				break;
			}
			case 5: {
				SequentialStrutureController.menuExerciciesSequential();
				break;
			}
			case 6: {
				WhileController.menuExerciciesWhile();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}

			in.nextLine();
			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);

		} while (cont != 'n');

		in.close();
	}
}