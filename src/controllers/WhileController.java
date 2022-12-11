package controllers;

import java.util.Scanner;

import exercicies.WhileExercice;
import views.StringText;

public class WhileController {

	public static void menuExerciciesWhile() {

		WhileExercice wl = new WhileExercice();
		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		char cont = ' ';
		int n;

		do {

			System.out.print(msg.menuWhile[0]);
			n = in.nextInt();

			switch (n) {
			case 1: {
				wl.exercice01();
				break;
			}
			case 2: {
				wl.exercice02();
				break;
			}
			case 3: {
				wl.exercice03();
				break;
			}
			case 4: {
				wl.exercice04();
				break;
			}
			case 5: {
				wl.exercice05();
				break;
			}
			case 6: {
				wl.exercice06();
				break;
			}
			case 7: {
				wl.exercice07();
				break;
			}
			case 8: {
				wl.exercice08();
				break;
			}
			case 9: {
				wl.exercice09();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);
			}

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);

		} while (cont != 'n');

		in.close();
	}
}
