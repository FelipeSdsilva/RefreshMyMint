package controllers;

import java.util.Scanner;

import views.StringText;

public class InitialController {

	public static void menuInitial() {

		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		int n;

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
			System.out.println(msg.mensage[30]);
		}

		in.close();
	}
}