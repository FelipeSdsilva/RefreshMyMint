package exercicies;

import java.util.Scanner;

public class IntrodutionTheFunction {

	Scanner in = new Scanner(System.in);

	public void whatNumberMoreHigh() {

		int a, b, c;
		char cont;

		do {
			System.out.println("Enter with three numbens: ");
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			if (a > b && a > c) {
				System.out.println("High: " + a);
			} else if (b > c && b > a) {
				System.out.println("High: " + b);
			} else {
				System.out.println("High: " + c);
			}
			System.out.print("Restart the program (Y/N)?");
			cont = in.next().charAt(0);
		} while (cont != 'n' && cont != 'N');
	}

}
