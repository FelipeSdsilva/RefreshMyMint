package controllers;

import exercices.ConditionalStructureExercice;
import views.MenuView;

import java.util.Scanner;

public class ConditionalStructureController {

	public static void menuExerciseConditional() {

		Scanner in = new Scanner(System.in);
		ConditionalStructureExercice sc = new ConditionalStructureExercice();
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuCond);
		n = in.nextInt();

		switch (n) {
			case 1 -> sc.exercice01();
			case 2 -> sc.exercice02();
			case 3 -> sc.exercice03();
			case 4 -> sc.exercice04();
			case 5 -> sc.exercice05();
			case 6 -> sc.exercice06();
			case 7 -> sc.exercice07();
			case 8 -> sc.exercice08();
			case 9 -> sc.exercice09();
			case 10 -> sc.exercice10();
			case 11 -> sc.exercice11();
			case 12 -> sc.exercice12();
			case 13 -> sc.exercice13();
			default -> InitialController.menuInitial();
		}

		in.close();
	}
}
