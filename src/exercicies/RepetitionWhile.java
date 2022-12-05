package exercicies;

import java.util.Scanner;

public class RepetitionWhile {

	Scanner in = new Scanner(System.in);

	public void exercicie1() {
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

	public void exercicie2() {
		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma).
		 */

		@SuppressWarnings("unused")
		int x, y;

		/*
		 * Form one do { x = in.nextInt(); y = in.nextInt(); if (x >= 1 && y >= 1) {
		 * System.out.println("Firsth"); } else if (x <= -1 && y >= 1) {
		 * System.out.println("Second"); } else if (x <= -1 && y <= -1) {
		 * System.out.println("Third"); } else if (x >= 1 && y <= -1) {
		 * System.out.println("Fourth"); } } while (x != 0 && y != 0);
		 */

		/* Form 2 */

	}

	public void exercicie3() {
		/*
		 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo.
		 */

		int alchool = 0, fuel = 0, diesel = 0, n;

		do {
			n = in.nextInt();
			if (n == 1) {
				alchool += 1;
			} else if (n == 2) {
				fuel += 1;
			} else if (n == 3) {
				diesel += 1;
			}
		} while (n != 4);

		String mensage = """
				Very thanks
				Alchool = """ + alchool + """

				Fuel =  """ + fuel + """

				Diesel = """ + diesel;

		System.out.println(mensage);
	}

	public void exercicie4() {
		/*
		 * Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente
		 * em Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário
		 * digite "s", repetir o programa
		 */

		char cont;
		
		do {
		System.out.print("White the temperature in Celcios: ");
		double celciuos = in.nextDouble();
		System.out.println("Equivalent in Fahrenheit: " + String.format("%.1f",((9 * celciuos)/ 5) + 32));
		System.out.print("Restart the program (Y/N)? ");
		cont = in.next().charAt(0);
		}while(cont != 'n');
	}
}
