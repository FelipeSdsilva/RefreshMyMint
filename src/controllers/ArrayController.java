package controllers;

import exercices.ArrayExercice;
import views.MenuView;

import java.util.Scanner;

public class ArrayController {

	public static void menuExerciseArray() {

		ArrayExercice arr = new ArrayExercice();
		Scanner in = new Scanner(System.in);
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuArr);
		n = in.nextInt();

		switch (n) {
			case 1 -> arr.exercice01();
			case 2 -> arr.exercice02();
			case 3 -> arr.exercice03();
			case 4 -> arr.exercice04();
			case 5 -> arr.exercice05();
			case 6 -> arr.exercice06();
			case 7 -> arr.exercice07();
			case 8 -> arr.exercice08();
			case 9 -> arr.exercice09();
			case 10 -> arr.exercice10();
			case 11 -> arr.exercice11();
			case 12 -> arr.exercice12();
			case 13 -> arr.exercice13();
			default -> InitialController.menuInitial();
		}

		in.close();
	}
}
