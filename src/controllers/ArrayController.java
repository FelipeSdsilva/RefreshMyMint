package controllers;

import exercices.ArrayExercice;
import views.MenuView;

import java.util.Scanner;

public class ArrayController {

	public static void menuExercicesArray() {

		ArrayExercice arr = new ArrayExercice();
		Scanner in = new Scanner(System.in);
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuArr);
		n = in.nextInt();

		switch (n) {
		case 0: {
			InitialController.menuInitial();
			break;
		}
		case 1: {
			arr.exercice01();
			break;
		}
		case 2: {
			arr.exercice02();
			break;
		}
		case 3: {
			arr.exercice03();
			break;
		}
		case 4: {
			arr.exercice04();
			break;
		}
		case 5: {
			arr.exercice05();
			break;
		}
		case 6: {
			arr.exercice06();
			break;
		}
		case 7: {
			arr.exercice07();
			break;
		}
		case 8: {
			arr.exercice08();
			break;
		}
		case 9: {
			arr.exercice09();
			break;
		}
		case 10: {
			arr.exercice10();
			break;
		}
		case 11: {
			arr.exercice11();
			break;
		}
		case 12: {
			arr.exercice12();
			break;
		}
		case 13: {
			arr.exercice13();
			break;
		}
		default:
			InitialController.menuInitial();
		}

		in.close();
	}
}
