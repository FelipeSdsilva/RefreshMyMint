package exercicies;

import java.util.Locale;
import java.util.Scanner;

import controllers.ArrayController;
import entities.Person;
import entities.Student;
import statics.DivisionStatic;
import statics.SumStatic;
import views.MensagensObjects;
import views.StringText;

public class ArrayExercice {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();
	MensagensObjects ms = new MensagensObjects();

	int cont;

	public void exercice01() {

		int[] vec = new int[0];

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextInt();
		}

		System.out.println("Negative numbers: ");

		for (int i = 0; i < vec.length; i++) {
			if (vec[i] < 0) {
				System.out.println(vec[i]);
			}
		}

		ArrayController.menuExerciciesArray();
	}

	public void exercice02() {

		double[] vecD = new double[0];
		double sum = 0;

		Locale.setDefault(Locale.US);
		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vecD = new double[cont];

		for (int i = 0; i < vecD.length; i++) {

			System.out.print(msg.array[1]);
			vecD[i] = in.nextDouble();
		}
		System.out.print("Values: ");
		for (int i = 0; i < cont; i++) {
			sum += vecD[i];
			System.out.printf("%.1f ", vecD[i]);
		}
		System.out.println("\nSum: " + String.format("%.2f", sum));
		System.out.println("Avarage: " + String.format("%.2f", sum / cont));

		ArrayController.menuExerciciesArray();
	}

	public void exercice03() {

		int age;
		double height, sum = 0, avg;
		String name;

		System.out.print(ms.person[0]);
		cont = in.nextInt();

		Person[] person = new Person[cont];

		for (int i = 0; i < person.length; i++) {

			System.out.println(ms.person[1] + (i + 1) + ms.person[2]);
			in.nextLine();
			System.out.print(ms.person[3]);
			name = in.nextLine();
			System.out.print(ms.person[4]);
			age = in.nextInt();
			System.out.print(ms.person[5]);
			height = in.nextDouble();

			person[i] = new Person(name, age, height);

		}

		int contp = 0;

		for (int i = 0; i < person.length; i++) {
			sum += person[i].getHeight();

		}

		avg = sum / cont;
		System.out.println(ms.person[6] + String.format("%.2f", avg));

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				contp++;
			}
		}

		System.out.println(ms.person[7] + String.format("%.1f", (100.00 * contp) / cont) + "%");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}

		}

		ArrayController.menuExerciciesArray();
	}

	public void exercice04() {
		int[] vec = new int[0];

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextInt();
		}
		cont = 0;

		System.out.println("Even numbers: ");
		for (int i = 0; i < vec.length; i++) {
			if (vec[i] % 2 == 0) {
				System.out.print(vec[i] + " ");
				cont++;
			}

		}
		System.out.println("\nEven quantity: " + cont);

		ArrayController.menuExerciciesArray();
	}

	public void exercice05() {

		int position = 0;
		double highest = 0;

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		double[] vec = new double[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextDouble();
			if (vec[i] > highest) {
				highest = vec[i];
				position = i;
			}
		}
		System.out.println("Highest number: " + highest);
		System.out.println("Position of highest number: " + position);

		ArrayController.menuExerciciesArray();
	}

	public void exercice06() {
		int[] vecA = new int[0], vecB = new int[0], vecC = new int[0];

		System.out.print(msg.array[2]);
		cont = in.nextInt();

		vecA = new int[cont];
		vecB = new int[cont];

		System.out.println(msg.array[3]);
		for (int i = 0; i < vecA.length; i++) {
			vecA[i] = in.nextInt();
		}

		System.out.println(msg.array[4]);
		for (int i = 0; i < vecB.length; i++) {
			vecB[i] = in.nextInt();
		}

		vecC = new int[cont];

		for (int i = 0; i < vecC.length; i++) {
			vecC[i] = vecA[i] + vecB[i];
		}
		System.out.println(msg.array[5]);
		for (int i = 0; i < vecC.length; i++) {
			System.out.println(vecC[i]);
		}

		ArrayController.menuExerciciesArray();
	}

	public void exercice07() {

		double[] vecD = new double[0];
		double sum = 0;

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vecD = new double[cont];

		for (int i = 0; i < vecD.length; i++) {
			System.out.print(msg.array[1]);
			vecD[i] = in.nextDouble();
			sum += vecD[i];
		}

		System.out.println(msg.array[6] + String.format("%.3f", sum / cont));
		System.out.println(msg.array[7]);

		for (int i = 0; i < vecD.length; i++) {
			if (vecD[i] < sum / cont) {
				System.out.println(vecD[i]);
			}
		}
	}

	public void exercice08() {

		int[] vec = new int[0];
		double sum = 0;

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vec = new int[cont];

		cont = 0;

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextInt();
			if (vec[i] % 2 == 0) {
				sum += vec[i];
				cont++;
			}
		}
		if (sum > 0) {
			System.out.println(msg.array[8] + sum / cont);
		} else {
			System.out.println(msg.array[9]);
		}
	}

	public void exercice09() {

		String name = "";
		int n, age, moreOld = 0;

		System.out.print(ms.person[15]);
		n = in.nextInt();
		Person[] people = new Person[n];

		for (int i = 0; i < people.length; i++) {

			System.out.print(ms.person[1] + (i + 1) + ms.person[2] + "\n" + ms.person[3]);
			in.nextLine();
			name = in.nextLine();
			System.out.print(ms.person[4]);
			age = in.nextInt();

			if (age > moreOld) {
				moreOld = age;
			}

			people[i] = new Person(name, age);

		}

		for (int i = 0; i < people.length; i++) {

			if (people[i].getAge() == moreOld) {
				name = people[i].getName();
			}
		}
		System.out.println(ms.person[16] + name);

		ArrayController.menuExerciciesArray();
	}

	public void exercice10() {

		String name = "";
		int n = 0;

		@SuppressWarnings("unused")
		double av1, av2, avg = 0;

		System.out.print(ms.student[8]);
		n = in.nextInt();

		Student[] students = new Student[n];
		Double[] avaliations = new Double[n];

		for (int i = 0; i < students.length; i++) {
			
			in.nextLine();

			System.out.printf(ms.student[7], (i + 1));
			System.out.println();
			name = in.nextLine();

			for (int j = 0; j < 2; j++) {
				avaliations[j] = av1 = in.nextDouble();
			}

			students[i] = new Student(name, avaliations);

		}

		System.out.println(ms.student[9]);

		for (int i = 0; i < students.length; i++) {

			if (students[i].finalNoteDivision() >= 6.0) {

				System.out.println(students[i].getName());

			}
		}

		ArrayController.menuExerciciesArray();
	}

	public void exercice11() {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o g�nero (M, F) de N
		 * pessoas. Fazer um programa que calcule e escreva a maior e a menor altura do
		 * grupo, a m�dia de altura das mulheres, e o n�mero de homens.
		 */
		ArrayController.menuExerciciesArray();
	}
}
