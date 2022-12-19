package statics;

import java.util.Scanner;

import views.MensagensObjects;
import views.StringText;

public class ConditionalStatic {

	public static void areMultiples(int a, int b) {

		if (a % b == 0) {
			System.out.println("Are multiples ");
		} else {
			System.out.println("Not are multiples ");
		}
	}

	public static void acresentNumber() {

		StringText msg = new StringText();
		Scanner in = new Scanner(System.in);

		int alchool = 0, gas = 0, diesel = 0, n;

		n = in.nextInt();
		while (n != 4) {
			if (n == 1) {
				alchool += 1;
			} else if (n == 2) {
				gas += 1;
			} else if (n == 3) {
				diesel += 1;
			}
			n = in.nextInt();
		}

		System.out.println(msg.mensage[36] + "\n" + msg.mensage[37] + alchool + "\n" + msg.mensage[38] + gas + "\n"
				+ msg.mensage[39] + diesel);

		in.close();
	}

	public static void ascendingAndDescendingOrder(int a, int b) {

		if (a > b) {
			System.out.println("Descending!");
		} else if (b > a) {
			System.out.println("Ascending!");
		} else {

		}
	}

	public static void biggerDistance(double a, double b, double c) {

		StringText msg = new StringText();

		if (a > b && a > c) {
			System.out.println(String.format(msg.mensage[21], a));
		} else if (b > c) {
			System.out.println(String.format(msg.mensage[21], b));
		} else {
			System.out.println(String.format(msg.mensage[21], c));
		}
	}

	public static void changeVerification(double money, double totalValue) {

		if (money > totalValue) {
			System.out.println(String.format("Change: %.2f", money - totalValue));
		} else {
			System.out.println(String.format("Cash insufficient. FOUL %.2f REALS", totalValue - money));
		}
	}

	public static double convertTemperatureCelciusAndFahrenheit(char escFahOrCel, double temp) {

		if (escFahOrCel == 'C' || escFahOrCel == ' ') {
			return temp = (temp * 9 / 5) + 32;
		} else if (escFahOrCel == 'F') {
			return temp = (temp - 32) * 5 / 9;
		}
		return Double.NaN;
	}

	public static void increasySalary(double salary) {

		MensagensObjects ms = new MensagensObjects();
		double newSalary;

		if (salary <= 1000.00) {

			newSalary = salary * 1.20;

			System.out.println(ms.employee[5] + String.format("%.2f", newSalary) + "\n" + ms.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + ms.employee[7] + "20%");
		} else if (salary > 1000.00 && salary <= 3000.00) {

			newSalary = salary * 1.15;

			System.out.println(ms.employee[5] + String.format("%.2f", newSalary) + "\n" + ms.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + ms.employee[7] + "15%");
		} else if (salary > 3000.00 && salary <= 8000.00) {

			newSalary = salary * 1.10;

			System.out.println(ms.employee[5] + String.format("%.2f", newSalary) + "\n" + ms.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + ms.employee[7] + "10%");

		} else {

			newSalary = salary * 1.05;

			System.out.println(ms.employee[5] + String.format("%.2f", newSalary) + "\n" + ms.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + ms.employee[7] + "5%");

		}
	}

	public static void planCartesian(char plat, double x, double y) {

		StringText msg = new StringText();

		if (plat == 'D') {

			if (x >= 1 && y >= 1) {
				System.out.println(msg.xAndY[7]);
			} else if (x <= -1 && y >= 1) {
				System.out.println(msg.xAndY[8]);
			} else if (x <= -1 && y <= -1) {
				System.out.println(msg.xAndY[9]);
			} else if (x >= 1 && y <= -1) {
				System.out.println(msg.xAndY[10]);
			} else if (x == 0 && y == 0) {
				System.out.println("Origin");
			} else if (y == 0 && x >= 1) {
				System.out.println("Axle X");
			} else {
				System.out.println("Axle y");
			}
		} else if (plat == 'U') {

			if (x >= 1 && y >= 1) {
				System.out.println("Firsth");
			} else if (x <= -1 && y >= 1) {
				System.out.println("Second");
			} else if (x <= -1 && y <= -1) {
				System.out.println("Third");
			} else if (x >= 1 && y <= -1) {
				System.out.println("Fourth");
			}
		} else if (plat == 'd') {

			if (x >= 1 && y >= 1) {
				System.out.println("Q1");
			} else if (x <= -1 && y >= 1) {
				System.out.println("Q2");
			} else if (x <= -1 && y <= -1) {
				System.out.println("Q3");
			} else if (x >= 1 && y <= -1) {
				System.out.println("Q4");
			}
		}
	}

	public static void quantityOfGlucose(double avgGlu) {

		if (avgGlu <= 100.0) {
			System.out.println("Classification: Normal");
		} else if (avgGlu > 100.00 && avgGlu <= 140.0) {
			System.out.println("Classification: Higth");
		} else if (avgGlu > 140.0) {
			System.out.println("Classification: Diabetes");
		}
	}

	public static void smallerBetweeThreeNumbers(int a, int b, int c) {

		StringText msg = new StringText();

		if (a < b && a < c) {
			System.out.println(msg.mensage[20] + a);
		} else if (b < c && b < a) {
			System.out.println(msg.mensage[20] + b);
		} else {
			System.out.println(msg.mensage[20] + c);
		}
	}

	public static void totalOrderPriceSnackBar(int codProd, int qtd) {

		if (codProd == 1) {
			System.out.printf("%.2f%n", 5.00 * qtd);
		} else if (codProd == 2) {
			System.out.printf("%.2f%n", 3.50 * qtd);
		} else if (codProd == 3) {
			System.out.printf("%.2f%n", 4.80 * qtd);
		} else if (codProd == 4) {
			System.out.printf("%.2f%n", 8.90 * qtd);
		} else {
			System.out.printf("%.2f%n", 7.32 * qtd);
		}
	}

	public static void validatorOfAvaliation(double avaliation) {

		MensagensObjects ms = new MensagensObjects();

		if (avaliation < 0 || avaliation > 10) {
			System.out.print(ms.student[5]);
		}

	}

	public static double validatorOfPositiveNumber(double avaliation) {

		double avg = 0;

		if (avaliation > 0 && avaliation <= 10.0) {
			return avg += avaliation;
		}
		return avg += 0;
	}

	public static double valueContOfTellOperator(int min) {

		double value = 50.00;

		if (min <= 100) {
			return value;
		}
		return value += (min - 100) * 2.00;
	}

}
