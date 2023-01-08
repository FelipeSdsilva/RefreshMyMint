package controllers;

import exercises.ArrayExercise;
import views.MenuView;

import java.util.Scanner;

public class ArrayController {

	public static void menuExerciseArray() {

		ArrayExercise arr = new ArrayExercise();
		Scanner in = new Scanner(System.in);
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuArr);
		n = in.nextInt();

		switch (n) {
			case 1 -> arr.exercise01();
			case 2 -> arr.exercise02();
			case 3 -> arr.exercise03();
			case 4 -> arr.exercise04();
			case 5 -> arr.exercise05();
			case 6 -> arr.exercise06();
			case 7 -> arr.exercise07();
			case 8 -> arr.exercise08();
			case 9 -> arr.exercise09();
			case 10 -> arr.exercise10();
			case 11 -> arr.exercise11();
			case 12 -> arr.exercise12();
			case 13 -> arr.exercise13();
			default -> InitialController.menuInitial();
		}

		in.close();
	}
}
