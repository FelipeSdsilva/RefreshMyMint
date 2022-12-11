package controllers;

import java.util.Scanner;

import exercicies.For;

public class ForController {

	@SuppressWarnings("resource")
public static void menuExerciceFor(int n) {
		
		Scanner in = new Scanner(System.in);
		For exFor = new For();

		n = in.nextInt();

		switch (n) {
		case 0: {
			exFor.exercice00();
			break;
		}
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
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		
		}
		
		in.close();
	}
}
