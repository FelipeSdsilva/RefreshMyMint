package controllers;

import java.util.Scanner;

import views.StringText;

public class InitialController {

	public static void menuInitial() {

		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		int n;

		System.out.printf(msg.menuIn[0]);
		n = in.nextInt();

		switch (n) {
		case 01: {
			ArrayController.menuExerciciesArray();
			break;
		}
		case 02: {
			ConditionalStructureController.menuExerciciesConditional();
			break;
		}
		case 03: {
			ForController.menuExerciciesFor();
			break;
		}
		case 04: {
			OrientObjectExcControll.menuExerOrientationObject();
			break;
		}
		case 05: {
			SequentialStrutureController.menuExerciciesSequential();
			break;
		}
		case 06: {
			WhileController.menuExerciciesWhile();
			break;
		}
		case 00:{
			System.out.println(msg.mensage[30]);
			break;
		}
		default:
			InitialController.menuInitial();
		}

		in.close();
	}
}