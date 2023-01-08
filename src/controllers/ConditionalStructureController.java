package controllers;

import exercises.ConditionalStructureExercise;
import views.MenuView;

import java.util.Scanner;

public class ConditionalStructureController {

	public static void menuExerciseConditional() {

		Scanner in = new Scanner(System.in);
		ConditionalStructureExercise sc = new ConditionalStructureExercise();
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuCond);
		n = in.nextInt();

		switch (n) {
			case 1 -> sc.exercise01();
			case 2 -> sc.exercise02();
			case 3 -> sc.exercise03();
			case 4 -> sc.exercise04();
			case 5 -> sc.exercise05();
			case 6 -> sc.exercise06();
			case 7 -> sc.exercise07();
			case 8 -> sc.exercise08();
			case 9 -> sc.exercise09();
			case 10 -> sc.exercise10();
			case 11 -> sc.exercise11();
			case 12 -> sc.exercise12();
			case 13 -> sc.exercise13();
			default -> InitialController.menuInitial();
		}

		in.close();
	}
}
