package controllers;

import java.util.Scanner;

import exercices.ForExercice;
import views.MenuView;

public class ForController {

	public static void menuExerciciesFor() {

		MenuView view = new MenuView();
		Scanner in = new Scanner(System.in);
		ForExercice exFor = new ForExercice();
		int n;

		System.out.print(view.menuFor);
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
		case 10:{
			exFor.exercice10();
			break; 
		}
		case 11:{
			exFor.exercice11();
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
