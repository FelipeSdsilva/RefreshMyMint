package controllers;

import java.util.Scanner;

import exercicies.OrientationObjectExercice;
import views.StringText;

public class OrientObjectExcControll {

	public static void menuExerOrientationObject() {

		OrientationObjectExercice or = new OrientationObjectExercice();
		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		int n;

		do {

			System.out.print(msg.menuArr[0]);
			n = in.nextInt();

			switch (n) {
			case 1: {
				or.accountExercicie();
				;
				break;
			}
			case 2: {
				or.employeeExercicie();
				break;
			}
			case 3: {
				or.estudentExercicie();
				break;
			}
			case 4: {
				or.fixedExercicieString();
				break;
			}
			case 5: {
				or.rectangleExercicie();
				break;
			}
			case 6: {
				or.resolvProblemWithOrientationObject();
				break;
			}
			case 0:{
				InitialController.menuInitial();
				break;
			}
			default:
				InitialController.menuInitial();
			}
			
		} while (n != 0);

		in.close();
	}
}
