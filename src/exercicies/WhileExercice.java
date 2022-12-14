package exercicies;

import java.util.Scanner;

import statics.ConditionalStatic;
import statics.DivisionStatic;
import views.StringText;

public class WhileExercice {

	StringText msg = new StringText();
	Scanner in = new Scanner(System.in);

	public void exercice01() {

		int x = 2, y = 0;
		do {

			System.out.println(msg.mensage[31]);
			x = in.nextInt();
			y = in.nextInt();

			ConditionalStatic.ascendingAndDescendingOrder(x, y);
		} while (x != y);
	}

	public void exercice02() {

		int x = 1, y = 0, sum = 0;

		System.out.println(msg.person[14]);

		while (x > 0) {
			x = in.nextInt();
			if (x > 0) {
				sum += x;
				y++;
			}
		}

		if (sum > 1) {
			DivisionStatic.averageAgeIndeterminateNumbers(y, sum);
		} else {
			System.out.println("Impossible calculation!");
		}

	}

	public void exercice03() {

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

	public void exercice04() {

		int x, y;

		do {
			
			x = in.nextInt();
			y = in.nextInt();
			ConditionalStatic.planCartesian('U', x, y);
		
		} while (x != 0 && y != 0);

		/* Form 2 */

	}

	public void exercice05() {
		/*
		 * Fa�a um programa que leia as notas referentes �s duas avalia��es de um aluno.
		 * Calcule e imprima a m�dia semestral. Fa�a com que o algoritmo s� aceite notas
		 * v�lidas (uma nota v�lida deve pertencer ao intervalo [0,10]). Cada nota deve
		 * ser validada separadamente.
		 */
	}

	public void exercice06() {

		int alchool = 0, fuel = 0, diesel = 0, n;

		do {
			n = in.nextInt();
			alchool += (n == 1)? alchool ++ : alchool ;
			fuel += (n == 2) ? fuel ++ : fuel;
			diesel += (n == 3)? diesel ++ : diesel;
		} while (n != 4);

		String mensage = """
				Very thanks
				Alchool = """ + alchool + """

				Fuel =  """ + fuel + """

				Diesel = """ + diesel;

		System.out.println(mensage);
	}

	public void exercice07() {
		/*
		 * O programa deve ler um valor inteiro X indefinidas vezes. (O programa ir�
		 * parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma
		 * dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor
		 * de entrada for 4, por exemplo, a sa�da deve ser 40, que � o resultado da
		 * opera��o: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por
		 * exemplo, a sa�da deve ser 80, que � a soma de 12+14+16+18+20.
		 */
	}

	public void exercice08() {

		char cont;

		do {
			System.out.print(msg.mensage[26]);
			double celciuos = in.nextDouble();
			System.out.println(msg.mensage[25]
					+ String.format("%.1f", ConditionalStatic.convertTemperatureCelciusAndFahrenheit(' ', celciuos)));
			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
		} while (cont != 'n');
	}

	public void exercice09() {

		int a, b, c;
		char cont;

		do {
			System.out.println(msg.mensage[22]);
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			ConditionalStatic.biggerDistance(a, b, c);

			System.out.print(msg.mensage[24]);
			cont = in.next().charAt(0);
		} while (cont != 'n' && cont != 'N');
	}
}
