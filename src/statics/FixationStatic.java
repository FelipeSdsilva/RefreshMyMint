package statics;

import views.StringText;

public class FixationStatic {

	public static double converterDollar(double priceDollar, double money) {
		return priceDollar * money;
	}

	public static double diameterOfRectangle(double base, double higth) {
		return Math.pow(base, 2) + Math.pow(higth, 2);
	}

	public static double formOfBaskara(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		return delta;
	}

	public static double positiveValueBaskara(double a, double b, double delta) {
		double positRes = (-b + Math.sqrt(delta)) / (2 * a);
		return positRes;
	}

	public static double negativeValueBaskara(double a, double b, double delta) {
		double positRes = (-b - Math.sqrt(delta)) / (2 * a);
		return positRes;
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

	public static double valueContOfTellOperator(int min) {
		double value = 50.00;
		if (min <= 100) {
			return value;
		}
		return value += (min - 100) * 2.00;
	}

	public static void changeVerification(double money, double totalValue) {
		if (money > totalValue) {
			System.out.println(String.format("Change: %.2f", money - totalValue));
		} else {
			System.out.println(String.format("Cash insufficient. FOUL %.2f REALS", totalValue - money));
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

	public static double convertTemperatureCelciusAndFahrenheit(char escFahOrCel, double temp) {
		if (escFahOrCel == 'C' || escFahOrCel == ' ') {
			return temp = (temp * 9 / 5) + 32;
		} else if (escFahOrCel == 'F') {
			return temp = (temp - 32) * 5 / 9;
		}
		return temp;
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

	public static void areMultiples(int a, int b) {
		if (a % b == 0) {
			System.out.println("Are multiples ");
		} else {
			System.out.println("Not are multiples ");
		}
	}

	public static void increasySalary(double salary) {

		StringText msg = new StringText();
		double newSalary;

		if (salary <= 1000.00) {

			newSalary = salary * 1.20;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "20%");
		} else if (salary > 1000.00 && salary <= 3000.00) {
			
			newSalary = salary * 1.15;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "15%");
		} else if (salary > 3000.00 && salary <= 8000.00) {

			newSalary = salary * 1.10;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "10%");

		} else {

			newSalary = salary * 1.05;

			System.out.println(msg.employee[5] + String.format("%.2f", newSalary) + "\n" + msg.employee[6]
					+ String.format("%.2f", newSalary - salary) + "\n" + msg.employee[7] + "5%");

		}
	}
}
