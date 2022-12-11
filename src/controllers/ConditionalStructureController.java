package controllers;

import java.util.Scanner;

import exercicies.ConditionalStructure;

public class ConditionalStructureController {
	@SuppressWarnings("resource")
	public static void menuExerciceFor(int n) {

		Scanner in = new Scanner(System.in);
		ConditionalStructure sc = new ConditionalStructure();

		n = in.nextInt();

		switch (n) {
		case 1: {
			sc.exercice01();
			break;
		}
		case 2: {
			sc.exercice02();
			break;
		}
		case 3: {
			sc.exercice03();
			break;
		}
		case 4: {
			sc.exercice04();
			break;
		}
		case 5: {
			sc.exercice05();
			break;
		}
		case 6: {
			sc.exercice06();
			break;
		}
		case 7: {
			sc.exercice07();
			break;
		}
		case 8: {
			sc.exercice08();
			break;
		}case 9: {
			sc.exercice09();
			break;
		}
		case 10: {
			sc.exercice10();
			break;
		}
		case 11: {
			sc.exercice11();
			break;
		}
		case 12: {
			sc.exercice12();
			break;
		}case 13: {
			sc.exercice13();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);

		}

		in.close();
	}
}
