package exercicies;

import java.util.Scanner;

import entities.Triangle;

public class ComparationOfTriangle {

	public static void triangleExercicie() {

		Triangle t1 = new Triangle(), t2 = new Triangle();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the measures of triangle x: ");

		t1.setWidth(sc.nextDouble());
		t1.setHight(sc.nextDouble());
		t1.setBase(sc.nextDouble());
		t1.measuresOfTriangle(t1.getWidth(), t1.getHight(), t1.getBase());
		System.out.println("Enter the measures of triangle y: ");

		t2.setWidth(sc.nextDouble());
		t2.setHight(sc.nextDouble());
		t2.setBase(sc.nextDouble());
		t2.measuresOfTriangle(t2.getWidth(), t2.getHight(), t2.getBase());

		t1.toString();
		t2.toString();

		Triangle.theBiggeArea(t1, t2);

		sc.close();
	}
}
