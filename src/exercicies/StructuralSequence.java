package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class StructuralSequence {

	Scanner in = new Scanner(System.in);

	public void terrainArea() {

		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do
		 * terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
		 * da área do terreno, bem como o valor do preço do terreno, ambos com duas
		 * casas decimais, conforme exemplo.
		 */

		Locale.setDefault(Locale.US);

		System.out.print("Write the width of terrain: ");
		double width = in.nextDouble();
		System.out.print("Write the length of terrain: ");
		double lenth = in.nextDouble();
		System.out.print("Write  the value for m²: ");
		double value = in.nextDouble();

		System.out.println("Area of terrain = " + String.format("%.2f", width * lenth));
		System.out.println("The price of terrain = " + String.format("%.2f", (width * lenth) * value));

	}

	public void rectangleMeasure() {

		/*
		 * Fazer um programa para ler as medidas da base e altura de um retângulo. Em
		 * seguida, mostrar o valor da área, perímetro e diagonal deste retângulo, com
		 * quatro casas decimais, conforme exemplos.
		 */

		Locale.setDefault(Locale.US);

		System.out.print("Base of recrangle: ");
		double b = in.nextDouble();
		System.out.print("Height of rectangle: ");
		double h = in.nextDouble();
		System.out.println("Area = " + String.format("%.4f", b * h));
		double p = b + h;
		System.out.println("Perimeter = " + String.format("%.4f", p * 2));
		double d = Math.pow(b, 2) + Math.pow(h, 2);
		System.out.println("Diagonal = " + String.format("%.4f", Math.sqrt(d)));
	}

	public void avarageAge() {

		Locale.setDefault(Locale.US);
		/*
		 * Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar
		 * uma mensagem com os nomes e a idade média entre essas pessoas, com uma casa
		 * decimal, conforme exemplo.
		 */

		String name;
		int age;
		double avarege = 0.0;
		Person[] p = new Person[2];

		for (int i = 0; i < 2; i++) {

			System.out.println("Date of " + i + 1 + "Person: ");
			System.out.print("Name: ");
			name = in.nextLine();

			System.out.print("Age: ");
			age = in.nextInt();
			in.nextLine();

			p[i] = new Person(name, age);

			avarege += (double) p[i].getAge();

		}

		avarege /= 2;

		System.out.println("A age avarege " + p[0].getName() + " and " + p[1].getName() + " is the "
				+ String.format("%.1f", avarege) + " years old");
	}
}
