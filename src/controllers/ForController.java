package controllers;

import java.util.Scanner;

import exercicies.ForExercice;
import views.StringText;

public class ForController {

	public static void menuExerciciesFor() {

		StringText msg = new StringText();
		Scanner in = new Scanner(System.in);
		ForExercice exFor = new ForExercice();
		int n;

		System.out.print(msg.menuFor[0]);
		n = in.nextInt();

		switch (n) {
		case 1: {
			exFor.exercice01();
			break;
		}
		case 2: {
			exFor.exercice02();
			break;
		}
		case 3: {
			exFor.exercice03();
			break;
		}
		case 4: {
			exFor.exercice04();
			break;
		}
		case 5: {
			exFor.exercice05();
			break;
		}
		case 6: {
			exFor.exercice06();
			break;
		}
		case 7: {
			exFor.exercice07();
			break;
		}
		case 8:{
			exFor.exercice08();
			break;
		}
		case 9: {
			exFor.exercice09();
			break;
		}
		case 0: {
			InitialController.menuInitial();
			break;
		}
		default:
			InitialController.menuInitial();
		}

		in.close();
	}
}
