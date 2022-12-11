package controllers;

import java.util.Scanner;

import exercicies.ForExercice;
import views.StringText;

public class ForController {

	public static void menuExerciciesFor() {

		StringText msg = new StringText();
		Scanner in = new Scanner(System.in);
		ForExercice exFor = new ForExercice();
		char cont = ' ';
		int n;

		do {

			System.out.print(msg.menuFor[0]);
			n = in.nextInt();

			switch (n) {
			case 1: {
				exFor.exercice00();
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
			case 0:{
				InitialController.menuInitial();
				break;
			}
			default:
				InitialController.menuInitial();	
			}
		} while (cont != 0);
		
		

		in.close();
	}
}
