package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Array {

	Scanner in = new Scanner(System.in);

	int cont;

	public void arrayFixedExercicies1() {
		/*
		 * Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois
		 * N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela
		 * todos os números negativos lidos.
		 */

		System.out.print("How many numbers will you type? ");
		cont = in.nextInt();

		int[] vec = new int[cont];

		for (int i : vec) {
			System.out.print("Digit a number: ");
			vec[i] = in.nextInt();
		}

		System.out.println("Negative numbers: ");

		for (int i = 0; i < cont; i++) {
			if (vec[i] < 0) {
				System.out.println(String.format("%d\n", vec[i]));
			}
		}

	}

	public void arrayFixedExercicies2() {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida: - Imprimir todos os elementos do vetor - Mostrar na tela a soma e a
		 * média dos elementos do vetor
		 */
		double sum = 0;

		Locale.setDefault(Locale.US);
		System.out.print("How many numbers will you type? ");
		cont = in.nextInt();

		double[] array = new double[cont];

		for (int i = 0; i < cont; i++) {

			System.out.print("Digit a number: ");
			array[i] = in.nextDouble();
		}
		System.out.print("nValues: ");
		for (int i = 0; i < cont; i++) {
			sum += array[i];
			System.out.printf(" %.1f ", array[i]);
			System.out.println();
		}
		System.out.println("Sum: " + String.format("%.2f", sum));
		System.out.println("Avarage: " + String.format("%.2f", sum / cont));

	}

	public void arrayFixedExercicies3() {
		/*
		 * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
		 * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também
		 * a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas
		 * pessoas caso houver.
		 */
		String name;
		int age;
		double height, avg, sum = 0;

		System.out.print("How many persons will you type? ");
		cont = in.nextInt();

		Person[] person = new Person[cont];

		for (int i = 0; i < person.length; i++) {

			System.out.println("Date of " + (i + 1) + "a person: ");
			in.nextLine();
			System.out.print("Name: ");
			name = in.nextLine();
			System.out.print("Age: ");
			age = in.nextInt();
			System.out.print("Height: ");
			height = in.nextDouble();

			person[i] = new Person(name, age, height);

		}

		for (int i = 0; i < person.length; i++) {
			sum += person[i].getHeight();

		}

		avg = sum / cont;
		System.out.println("Average height: " + String.format("%.2f", avg));

		System.out.println("People whit less 16 year old: ");

		for (int i = 0; i < person.length; i++) {
			if (person[i].getAge() < 16) {
				System.out.println(person[i].getName());
			}

		}
	}

}
