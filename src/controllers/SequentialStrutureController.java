package controllers;

import java.util.Scanner;

import exercicies.SequentialStructureExercice;
import views.MenuView;

public class SequentialStrutureController {

	public static void menuExerciciesSequential() {

		SequentialStructureExercice ss = new SequentialStructureExercice();
		Scanner in = new Scanner(System.in);
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuSeq);
		n = in.nextInt();

		switch (n) {
		case 1: {
			ss.exercice01();
			break;
		}
		case 2: {
			ss.exercice02();
			break;
		}
		case 3: {
			ss.exercice03();
			break;
		}
		case 4: {
			ss.exercice04();
			break;
		}
		case 5: {
			ss.exercice05();
			break;
		}
		case 6: {
			ss.exercice06();
			break;
		}
		case 7: {
			ss.exercice07();
			break;
		}
		case 8: {
			ss.exercice08();
			break;
		}
		case 9: {
			ss.exercice09();
			break;
		}
		case 10: {
			ss.exercice10();
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
