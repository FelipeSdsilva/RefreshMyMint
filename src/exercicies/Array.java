package exercicies;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Array {

	Scanner in = new Scanner(System.in);

	int cont;

	public void exercicie1() {
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

	public void exercicie2() {
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

	public void exercicie3() {
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

	public void exercicie4() {
		/*
		 * Faça um programa que leia N números inteiros e armazene-os em um vetor. Em
		 * seguida, mostre na tela todos os números pares, e também a quantidade de
		 * números pares.
		 */

	}

	public void exercicie5() {
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor. Em
		 * seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 * Mostrar também a posição do maior elemento, considerando a primeira posição
		 * como 0 (zero).
		 */
	}

	public void exercicie6() {
		/*
		 * Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em
		 * seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos
		 * elementos correspondentes de A e B. Imprima o vetor C gerado.
		 * 
		 * .
		 */
	}

	public void exercicie7() {
		/*
		 * Fazer um programa para ler um número inteiro N e depois um vetor de N números
		 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com
		 * três casas decimais. Depois mostrar todos os elementos do vetor que estejam
		 * abaixo da média, com uma casa decimal cada.
		 */
	}

	public void exercicie8() {
		/*
		 * Fazer um programa para ler um vetor de N números inteiros. Em seguida,
		 * mostrar na tela a média aritmética somente dos números pares lidos, com uma
		 * casa decimal. Se nenhum número par for digitado, mostrar a mensagem
		 * "NENHUM NUMERO PAR"
		 */
	}

	public void exercicie9() {
		/*
		 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas
		 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro
		 * vetor. Depois, mostrar na tela o nome da pessoa mais velha.
		 */
	}

	public void exercicie10() {
		/*
		 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as
		 * notas que eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve
		 * ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
		 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0
		 * (seis).
		 */
	}

	public void exercicie11() {
		/*
		 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
		 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a
		 * média de altura das mulheres, e o número de homens.
		 */
	}
}
