package exercices;

import controllers.ArrayController;
import entities.Pension;
import entities.Person;
import entities.Product;
import entities.Student;
import views.MensagensObjects;
import views.StringText;

import java.util.Locale;
import java.util.Scanner;

public class ArrayExercice {

	Scanner in = new Scanner(System.in);
	StringText msg = new StringText();
	MensagensObjects ms = new MensagensObjects();

	int cont;

	public void exercice01() {

		int[] vec;

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextInt();
		}

		System.out.println("Negative numbers: ");

		for (int j : vec) {
			if (j < 0) {
				System.out.println(j);
			}
		}

		ArrayController.menuExerciseArray();
	}

	public void exercice02() {

		double[] vecD;
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
		System.out.println("Average: " + String.format("%.2f", sum / cont));

		ArrayController.menuExerciseArray();
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

		for (Person value : person) {
			sum += value.getHeight();

		}

		avg = sum / cont;
		System.out.println(ms.person[6] + String.format("%.2f", avg));

		for (Person value : person) {
			if (value.getAge() < 16) {
				contp++;
			}
		}

		System.out.println(ms.person[7] + String.format("%.1f", (100.00 * contp) / cont) + "%");

		for (Person value : person) {
			if (value.getAge() < 16) {
				System.out.println(value.getName());
			}

		}

		ArrayController.menuExerciseArray();
	}

	public void exercice04() {
		int[] vec;

		System.out.print(msg.array[0]);
		cont = in.nextInt();

		vec = new int[cont];

		for (int i = 0; i < vec.length; i++) {
			System.out.print(msg.array[1]);
			vec[i] = in.nextInt();
		}
		cont = 0;

		System.out.println("Even numbers: ");
		for (int j : vec) {
			if (j % 2 == 0) {
				System.out.print(j + " ");
				cont++;
			}

		}
		System.out.println("\nEven quantity: " + cont);

		ArrayController.menuExerciseArray();
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

		ArrayController.menuExerciseArray();
	}

	public void exercice06() {
		int[] vecA, vecB, vecC;

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
		for (int j : vecC) {
			System.out.println(j);
		}

		ArrayController.menuExerciseArray();
	}

	public void exercice07() {

		double[] vecD;
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

		for (double v : vecD) {
			if (v < sum / cont) {
				System.out.println(v);
			}
		}
		ArrayController.menuExerciseArray();
	}

	public void exercice08() {

		int[] vec;
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
		ArrayController.menuExerciseArray();
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

		for (Person person : people) {

			if (person.getAge() == moreOld) {
				name = person.getName();
			}
		}
		System.out.println(ms.person[16] + name);

		ArrayController.menuExerciseArray();
	}

	public void exercice10() {

		String name;
		int n;

		@SuppressWarnings("unused")
		double av1, av2, avg = 0;

		System.out.print(ms.student[8]);
		n = in.nextInt();

		Student[] students = new Student[n];

		for (int i = 0; i < students.length; i++) {

			in.nextLine();

			System.out.printf(ms.student[7], (i + 1));
			System.out.println();
			name = in.nextLine();
			av1 = in.nextDouble();
			av2 = in.nextDouble();

			students[i] = new Student(name, av1, av2);

		}

		System.out.println(ms.student[9]);

		for (Student student : students) {

			if (student.finalNoteDivision() >= 6.0) {

				System.out.println(student.getName());

			}
		}

		ArrayController.menuExerciseArray();
	}

	public void exercice11() {

		double height, heightBigger = 0, heightAvgWoman = 0, heightSmaller = 0;
		char gender;
		int n, contMen = 0, contWom = 0;
		System.out.print(ms.person[15]);
		n = in.nextInt();

		Person[] persons = new Person[n];

		for (int i = 0; i < persons.length; i++) {

			System.out.printf(ms.person[17], (i + 1));
			height = in.nextDouble();
			System.out.printf(ms.person[18], (i + 1));
			gender = in.next().charAt(0);

			if (height > heightBigger) {
				heightBigger = height;
				heightSmaller = height;
			} else if (height < heightSmaller) {
				heightSmaller = height;
			}

			if (gender == 'M' || gender == 'm') {
				contMen++;
			} else {
				contWom++;
				heightAvgWoman += height;
			}

			persons[i] = new Person(height, gender);
		}

		System.out.println(ms.person[21] + heightSmaller);
		System.out.println(ms.person[22] + heightBigger);
		System.out.println(ms.person[20] + String.format("%.2f", (heightAvgWoman / contWom)));
		System.out.println(ms.person[19] + contMen);

		ArrayController.menuExerciseArray();
	}

	public void exercice12() {

		String name;
		double priceSale, pricePurchase, sumPur = 0, sumSale = 0, valueAgain;
		int n, smallerOf10Perc = 0, between10And20Perc = 0, bigger20Perc = 0;

		System.out.print(ms.product[14]);
		n = in.nextInt();

		Product[] products = new Product[n];

		for (int i = 0; i < products.length; i++) {

			System.out.print(ms.product[15] + (i + 1) + "\n" + ms.person[3]);
			in.nextLine();
			name = in.nextLine();

			System.out.print(ms.product[12]);
			pricePurchase = in.nextDouble();

			System.out.print(ms.product[13]);
			priceSale = in.nextDouble();

			sumPur += pricePurchase;
			sumSale += priceSale;

			valueAgain = pricePurchase * 0.10;

			if ((priceSale - pricePurchase) < valueAgain) {
				smallerOf10Perc++;
			} else if ((priceSale - pricePurchase) <= pricePurchase * 0.20) {
				between10And20Perc++;
			} else {
				bigger20Perc++;
			}

			products[i] = new Product(name, pricePurchase, priceSale);
		}

		System.out.printf(ms.product[16], smallerOf10Perc, between10And20Perc, bigger20Perc, sumPur, sumSale,
				(sumSale - sumPur));

		ArrayController.menuExerciseArray();
	}

	public void exercice13() {

		String name, email;
		Pension[] rooms = new Pension[9];
		int n, room;

		System.out.print(ms.pension[0]);
		n = in.nextInt();

		for (int i = 0; i < n; i++) {
			in.nextLine();

			System.out.printf(ms.pension[1], (i + 1));
			System.out.print(ms.person[3]);
			name = in.nextLine();

			System.out.print(ms.pension[2]);
			email = in.nextLine();

			System.out.print(ms.pension[3]);
			room = in.nextInt();

			Student student = new Student(name, email);

			rooms[room] = new Pension(room, student);

		}

		System.out.println(ms.pension[4]);
		for (Pension pension : rooms) {
			if (pension != null) {
				System.out.println(pension);
			}
		}

		ArrayController.menuExerciseArray();
	}
}
