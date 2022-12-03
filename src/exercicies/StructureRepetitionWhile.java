package exercicies;

import java.util.Scanner;

public class StructureRepetitionWhile {

	Scanner in = new Scanner(System.in);

	public void excercicie1() {
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		int password;

		do {
			System.out.print("Write your password: ");
			password = in.nextInt();
			if (password == 2002) {
				System.out.println("Passwor valid");
			} else {
				System.out.println("Passwor invalid");
			}
		} while (password != 2002);

	}

	public void excercicie2() {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		int x, y;

		do {
			x = in.nextInt();
			y = in.nextInt();

			if (x >= 1 && y >= 1) {
				System.out.println("Firsth");
			} else if (x <= -1 && y >= 1) {
				System.out.println("Second");
			} else if (x <= -1 && y <= -1) {
				System.out.println("Third");
			} else if (x >= 1 && y <= -1) {
				System.out.println("Fourth");
			}
		} while (x != 0 && y != 0);

	}
}
