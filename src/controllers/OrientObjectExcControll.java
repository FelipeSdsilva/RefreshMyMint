package controllers;

import java.util.Scanner;

import exercicies.OrientationObjectExercice;
import views.StringText;

public class OrientObjectExcControll {

	public static void menuExerOrientationObject() {

		OrientationObjectExercice or = new OrientationObjectExercice();
		Scanner in = new Scanner(System.in);
		StringText msg = new StringText();
		char cont = ' ';
		int n;

		do {

			System.out.print(msg.menuArr);
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
			default:
				throw new IllegalArgumentException("Unexpected value: " + n);

			}

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
			
		} while (cont != 'n');

		in.close();
	}
}
