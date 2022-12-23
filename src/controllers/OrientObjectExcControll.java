package controllers;

import java.util.Scanner;

import exercicies.OrientationObjectExercice;
import views.MenuView;

public class OrientObjectExcControll {

	public static void menuExerOrientationObject() {

		OrientationObjectExercice or = new OrientationObjectExercice();
		Scanner in = new Scanner(System.in);
		MenuView view = new MenuView();
		int n;

		System.out.print(view.menuOriObj);
		n = in.nextInt();

		switch (n) {
		case 1: {
			or.accountExercicie();
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
